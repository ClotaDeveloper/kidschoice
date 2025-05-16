package com.client.kidschoice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import com.client.kidschoice.entity.EmailConfig;
import com.client.kidschoice.repository.EmailConfigRepository;



@Configuration
public class MailConfig {
	
	
  private final EmailConfigRepository emailConfigRepository;
  
  @Autowired
  public MailConfig(EmailConfigRepository emailConfigRepository) {
    this.emailConfigRepository = emailConfigRepository;
  }
  
  @Bean
  public JavaMailSender javaMailSender() {
    EmailConfig emailConfig = this.emailConfigRepository.getEmailConfigById(1);
    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
    mailSender.setHost(emailConfig.getHost());
    mailSender.setPort(emailConfig.getPort().intValue());
    mailSender.setUsername(emailConfig.getUsername());
    mailSender.setPassword(emailConfig.getPassword());
    return (JavaMailSender)mailSender;
  }
}