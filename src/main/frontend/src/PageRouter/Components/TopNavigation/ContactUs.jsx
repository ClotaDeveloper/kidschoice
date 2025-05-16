import React, { useEffect, useState } from "react";
import "./ContactUs.css";
import { Card } from "primereact/card";
import Swal from "sweetalert2";

import { Message } from "primereact/message";
import { InputTextarea } from "primereact/inputtextarea";
import ContactUsimg from "../../images/cycle1.png";
import { InputText } from "primereact/inputtext";
import { Dropdown } from "primereact/dropdown";
import { Button } from "primereact/button";
import { FiRefreshCw } from "react-icons/fi";
import { IoCallOutline, IoLocationOutline } from "react-icons/io5";
import { TbWorldWww } from "react-icons/tb";
import { TfiEmail } from "react-icons/tfi";
import { Link } from "react-router-dom";

import { useNavigate } from "react-router-dom";

function Contact() {
  const [invalid, setInvalid] = useState(false);
  const navigate = useNavigate();
  const [answer, setAnswer] = useState("");
  const [captchaText, setCaptchaText] = useState("");
  const [text, setText] = useState("");
  const [fullName, setFullName] = useState("");
  const [emailID, setEmailID] = useState("");
  const [mobileNumber, setMobileNumber] = useState("");
  const [subject, setSubject] = useState("");
  const [contactReason, setContactReason] = useState("");
  const [mobilePrefix, setMobilePrefix] = useState(91);

  const generateCaptcha = () => {
    const number1 = Math.floor(Math.random() * 10) + 1;
    const number2 = Math.floor(Math.random() * 10) + 1;
    const operation = Math.random() < 0.5 ? "+" : "-";
    const result = operation === "+" ? number1 + number2 : number1 - number2;

    setCaptchaText(`${number1} ${operation} ${number2} = `);
    setAnswer(result.toString());
  };
  useEffect(() => {
    generateCaptcha();
  }, []);

  const handleSaveContactUsEnquiry = async (event) => {
    event.preventDefault();
    if (answer === text) {
      setInvalid(false);
    } else {
      Swal.fire({
        icon: "error",
        title: "Invalid Captcha",
        text: "Please enter a valid Captcha",
        timer: 2000,
        showConfirmButton: false,
      });
      setInvalid(true);
      generateCaptcha();
      return;
    }
    if (!fullName || fullName.length < 3 || fullName.length > 50) {
      Swal.fire({
        icon: "error",
        title: "Error!",
        text: "Please enter a valid full name (between 3 and 50 characters).",
        timer: 2000,
        showConfirmButton: false,
      });
      return;
    }
    if (!emailID || !/\S+@\S+\.\S+/.test(emailID)) {
      Swal.fire({
        icon: "error",
        title: "Error!",
        text: "Please enter a valid email address.",
        timer: 2000,
        showConfirmButton: false,
      });
      return;
    }
    if (!mobileNumber || mobileNumber.length !== 10 || isNaN(mobileNumber)) {
      Swal.fire({
        icon: "error",
        title: "Error!",
        text: "Please enter a valid 10-digit mobile number.",
        timer: 2000,
        showConfirmButton: false,
      });
      return;
    }
    if (!subject || subject.length < 3 || subject.length > 200) {
      Swal.fire({
        icon: "error",
        title: "Error!",
        text: "Please enter a subject (between 2 and 200 characters).",
        timer: 2000,
        showConfirmButton: false,
      });
      return;
    }
    if (
      !contactReason ||
      contactReason.length < 3 ||
      contactReason.length > 1000
    ) {
      Swal.fire({
        icon: "error",
        title: "Error!",
        text: "Please enter a contact reason (between 3 and 1000 characters).",
        timer: 2000,
        showConfirmButton: false,
      });
      return;
    }
    try {
      const response = await fetch("/saveContactUsEnquiry", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({
          fullName: fullName,
          emailID: emailID,
          mobileNumber: parseInt(mobilePrefix + "" + mobileNumber),
          subject: subject,
          contactReason: contactReason,
        }),
      });

      if (response.ok) {
        Swal.fire({
          icon: "success",
          title: "Success!",
          text: "Contact form data saved successfully.",
          timer: 2000,
          showConfirmButton: false,
        });

        navigate("/ThankYouPage"); // Navigate after successful submission

        // Optionally reset form fields after successful submission
        setFullName("");
        setEmailID("");
        setMobilePrefix("+91");
        setMobileNumber("");
        setSubject("");
        setContactReason("");
        setText("");
        generateCaptcha();
      } else {
        console.error("Failed to save contact form data");
        Swal.fire({
          icon: "error",
          title: "Error!",
          text: "Failed to save contact form data. Please try again later.",
          timer: 2000, // 3 seconds
          showConfirmButton: false,
        });
        // Handle error scenario if needed
      }
    } catch (error) {
      Swal.fire({
        icon: "error",
        title: "Error!",
        text: "An error occurred while saving contact form data. Please try again later.",
        timer: 2000, // 3 seconds
        showConfirmButton: false,
      });
      console.error("Error occurred while saving contact form data:", error);

      // Handle network or other errors
    }
  };

  const handleMailClick = () => {
    const emailAddress = "ajayrocks8090@gmail.com"; // Replace with your email address
    window.open(`mailto:${emailAddress}`, "_blank");
  };
  const handlePhoneClick = () => {
    const phoneNumber = "+91-9984557913"; // Replace with your phone number
    window.open(`tel:+91 9984557913`, "_blank");
  };
  const handleWebsiteClick = () => {
    console.log("hey");
    window.open(`https://kidschoice.co.in/`, "_blank");
  };

  return (
    <div className="ContactSection">
      <div className="contact-subsection-left">
        <div className="innersection-left">
          <img src={ContactUsimg} alt="contactimage" />
          <p>Feel Free to reach out to us!</p>
          <div className="contacts-sources">
            <Message
              className="d-block"
              severity="info"
              text="+91-9984557913"
              onClick={handlePhoneClick}
              icon={<IoCallOutline className="contact-icon" />}
            />
            <Message
              className="d-block"
              severity="info"
              text="ajayrocks8090@gmail.com"
              onClick={handleMailClick}
              icon={<TfiEmail className="contact-icon" />}
            />
            <Message
              className="d-block"
              severity="info"
              style={{ marginBottom: "30px" }}
              onClick={handleWebsiteClick}
              text="https://kidschoice.co.in/"
              icon={<TbWorldWww className="contact-icon" />}
            />
          </div>
        </div>
      </div>
      <div className=" contact-subsection-right">
        <h2 className="Contact-heading">Contact Us</h2>

        <Card style={{ boxShadow: "none" }} className="contact-form">
          <form onSubmit={handleSaveContactUsEnquiry} method="post">
            <table className="contact-form-table" cellPadding={"8px"}>
              <tbody>
                <tr>
                  <td colSpan={2} className="floating-label-container">
                    <InputText
                      keyfilter={/^[a-zA-Z ]*$/}
                      value={fullName}
                      onChange={(e) => setFullName(e.target.value)}
                      pattern=".{3,50}"
                      placeholder=" "
                    />
                    <div className="label-line">Enter Your Name</div>
                  </td>
                </tr>
                <tr>
                  <td
                    colSpan={2}
                    className="floating-label-container mobile-label"
                  >
                    <Dropdown
                      options={[{ name: "+91", value: 91 }]}
                      value={mobilePrefix}
                      onChange={(e) => setMobilePrefix(e.value)}
                      optionLabel="name"
                      placeholder="+91"
                      style={{ zIndex: "2" }}
                      className="drop-down-contact"
                    />
                    <InputText
                      className="contact-number "
                      keyfilter="pint"
                      placeholder=" "
                      pattern=".{10}"
                      value={mobileNumber}
                      onChange={(e) => setMobileNumber(e.target.value)}
                    />
                    <div className="label-line">Contact Number</div>
                  </td>
                </tr>
                <tr>
                  <td colSpan={2} className="floating-label-container">
                    <InputText
                      type="email"
                      placeholder=" "
                      keyfilter={"email"}
                      value={emailID}
                      onChange={(e) => setEmailID(e.target.value)}
                    />
                    <div className="label-line">Enter Your Email</div>
                  </td>
                </tr>
                <tr>
                  <td colSpan={2} className="floating-label-container">
                    <InputText
                      pattern=".{3,200}"
                      type="text"
                      keyfilter={/^[a-zA-Z ]*$/}
                      placeholder=" "
                      value={subject}
                      onChange={(e) => setSubject(e.target.value)}
                    />
                    <div className="label-line">Enquiry About</div>
                  </td>
                </tr>

                <tr>
                  <td colSpan={2} className="floating-label-container">
                    <InputTextarea
                      style={{ width: "100%" }}
                      rows={5}
                      keyfilter={/^[a-zA-Z0-9 ]*$/}
                      value={contactReason}
                      placeholder=" "
                      onChange={(e) => setContactReason(e.target.value)}
                      cols={30}
                    />
                    <div className="label-line">Reason</div>
                  </td>
                </tr>
                <tr>
                  <td style={{ padding: "0px" }} colSpan={2}>
                    <div className="captcha">
                      {captchaText}{" "}
                      <FiRefreshCw
                        onClick={generateCaptcha}
                        className="captcha-icon"
                      />
                    </div>
                  </td>
                </tr>
                <tr>
                  <td className="floating-label-container">
                    <InputText
                      keyfilter={"int"}
                      value={text}
                      placeholder=" "
                      onChange={(e) => setText(e.target.value)}
                    />
                    <div className="label-line">Enter Captcha</div>
                    {invalid && (
                      <p
                        style={{
                          color: "red",
                          margin: "0",
                          marginTop: "10px",
                        }}
                      >
                        Invalid Captcha
                      </p>
                    )}
                  </td>
                </tr>
                <tr>
                  <td colSpan={2}>
                    <Button
                      disabled={
                        !fullName ||
                        !emailID ||
                        !mobileNumber ||
                        !subject ||
                        !contactReason ||
                        !text
                      }
                      label="Submit"
                      type="submit"
                      // onClick={() => generateCaptcha()}
                      style={{ width: "100%", height:"20px" }}
                    />
                  </td>
                </tr>
              </tbody>
            </table>
          </form>
        </Card>
      </div>
    </div>
  );
}

export default Contact;
