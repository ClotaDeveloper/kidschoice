package com.client.kidschoice.service.impl;

import java.util.Properties;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.client.kidschoice.entity.EmailConfig;
import com.client.kidschoice.repository.EmailConfigRepository;




@Service
public class MailServiceImpl {
    private final JavaMailSender javaMailSender;

    private final EmailConfigRepository emailConfigRepository;

    @Autowired
    public MailServiceImpl(JavaMailSender javaMailSender, EmailConfigRepository emailConfigRepository) {
        this.javaMailSender = javaMailSender;
        this.emailConfigRepository = emailConfigRepository;
    }

    public void sendEmail(String to, String ccEmailID, String subject, String body) throws MessagingException {
        EmailConfig emailConfig = this.emailConfigRepository.getEmailConfigById(1);
        String smtpHost = emailConfig.getHost();
        int smtpPort = emailConfig.getPort().intValue();
        String smtpUsername = emailConfig.getUsername();
        String smtpPassword = emailConfig.getPassword();
        MimeMessage message = this.javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        if (!isValidEmailAddress(to) || !isValidEmailAddress(ccEmailID))
            throw new AddressException("Invalid email address");
        Properties props = ((JavaMailSenderImpl) this.javaMailSender).getJavaMailProperties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.trust", emailConfig.getHost());
        helper.setFrom(smtpUsername);
        helper.setTo(to);
        helper.setCc(ccEmailID);
        helper.setSubject(subject);
        helper.setText(body);
        this.javaMailSender.send(message);
    }

    private boolean isValidEmailAddress(String email) {
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
            return true;
        } catch (AddressException ex) {
            return false;
        }
    }

    public void sendEmailForget(String to, String subject, String body) throws MessagingException {
        final EmailConfig emailConfig = this.emailConfigRepository.getEmailConfigById(1);
        Properties props = new Properties();
        props.put("mail.smtp.host", emailConfig.getHost());
        props.put("mail.smtp.port", emailConfig.getPort());
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(emailConfig.getUsername(), emailConfig.getPassword());
            }
        });
        MimeMessage mimeMessage = new MimeMessage(session);
        mimeMessage.setFrom((Address) new InternetAddress(emailConfig.getUsername()));
        mimeMessage.setRecipients(Message.RecipientType.TO, (Address[]) InternetAddress.parse(to));
        mimeMessage.setSubject(subject);
        mimeMessage.setText(body);
        Transport.send((Message) mimeMessage);
    }

    public void sendSimpleMessage(String to, String subject, String text, String from) throws MessagingException {
        EmailConfig emailConfig = this.emailConfigRepository.getEmailConfigById(1);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(emailConfig.getHost());
        mailSender.setPort(emailConfig.getPort().intValue());
        mailSender.setUsername(emailConfig.getUsername());
        mailSender.setPassword(emailConfig.getPassword());
        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        mailSender.send(message);
    }

    public void sendEmailWithCC(String emailID, String ccEmailID, String subject, String body)
            throws MessagingException {
        EmailConfig emailConfig = this.emailConfigRepository.getEmailConfigById(1);
        MimeMessage message = this.javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        if (!isValidEmailAddress(emailID) || !isValidEmailAddress(ccEmailID))
            throw new AddressException("Invalid email address");
        Properties props = ((JavaMailSenderImpl) this.javaMailSender).getJavaMailProperties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.trust", emailConfig.getHost());
        helper.setFrom(emailConfig.getUsername());
        helper.setTo(emailID);
        helper.setCc(ccEmailID);
        helper.setSubject(subject);
        helper.setText(body);
        this.javaMailSender.send(message);
    }

    public void sendEmailWithHTML(String to, String subject, String htmlBody, String imagePath)
            throws MessagingException {
        EmailConfig emailConfig = this.emailConfigRepository.getEmailConfigById(1);
        MimeMessage message = this.javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        Properties props = ((JavaMailSenderImpl) this.javaMailSender).getJavaMailProperties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.trust", emailConfig.getHost());
        helper.setFrom(emailConfig.getUsername());
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(htmlBody, true);
        ClassPathResource image = new ClassPathResource("logo.png");
        helper.addInline("logoImage", (Resource) image);
        this.javaMailSender.send(message);
    }
}

