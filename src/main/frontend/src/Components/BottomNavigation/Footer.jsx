import React from "react";
import "./Footer.css";
import {
  FaFacebookF,
  FaInstagram,
  FaMapMarkerAlt,
  FaPhoneAlt,
  FaEnvelope,
} from "react-icons/fa";
import logoImage from "../../images/Kid Logo.png";
import {
  FaXTwitter,
  FaYoutube,
} from "react-icons/fa6";
import { Link } from "react-router-dom";



const Footer = () => {
  return (
    <footer className="footer">
      <div className="footer-container">
        <div className="logo">
          <img src={logoImage} alt="KidsChoice Logo" className="logo-image" />
        </div>

        <div className="footer-section">
          <h4>Quick Links</h4>
          <ul>
            <li>
              <a href="/" style={{ textDecoration: "none", color: "inherit" }}>
                Home
              </a>
            </li>
            <li>
              <a
                href="/Cycle"
                style={{ textDecoration: "none", color: "inherit" }}
              >
                Cycles
              </a>
            </li>
            <li>
              <a
                href="/Car"
                style={{ textDecoration: "none", color: "inherit" }}
              >
                Cars
              </a>
            </li>
            <li>
              <a
                href="/Toys"
                style={{ textDecoration: "none", color: "inherit" }}
              >
                Toys
              </a>
            </li>
            {/* <li>
              <a
                href="/Bikes"
                style={{ textDecoration: "none", color: "inherit" }}
              >
                Bikes
              </a>
            </li> */}

            <li>
              <a
                href="/Gifts"
                style={{ textDecoration: "none", color: "inherit" }}
              >
                Gifts/Arts
              </a>
            </li>
          </ul>
        </div>

        <div className="footer-section">
          <h4>Customer Service</h4>
          <ul>
            <li>
              <Link
                to="/privacypolicy"
                style={{ textDecoration: "none", color: "inherit" }}
              >
                Privacy Policy
              </Link>
            </li>
            <li>
              <Link
                to="/TermsOfService"
                style={{ textDecoration: "none", color: "inherit" }}
              >
                Terms of Service
              </Link>
            </li>
            <li>
              <Link
                to="/ShippingPolicy"
                style={{ textDecoration: "none", color: "inherit" }}
              >
                Shipping Policy
              </Link>
            </li>
            <li>
              <Link
                to="/ReturnsExchanges"
                style={{ textDecoration: "none", color: "inherit" }}
              >
                Returns & Exchanges
              </Link>
            </li>
          </ul>
        </div>

        <div className="footer-section">
          <h4>Contact Info</h4>
          <ul className="contact-info">
            <li>
              <FaMapMarkerAlt /> Geeta puri Chauraha 'khargapur gomti nagar EXTN
              •opposite Bank of India, Lucknow
            </li>
            <li>
              <a
                href="tel:+919984557913"
                style={{ textDecoration: "none", color: "inherit" }}
              >
                <FaPhoneAlt /> +91 9984557913
              </a>
            </li>
            <li>
              <a
                href="mailto:ajayrocks8090@gmail.com"
                style={{ textDecoration: "none", color: "inherit" }}
              >
                <FaEnvelope /> ajayrocks8090@gmail.com
              </a>
            </li>

            {/* <li>
              <FaClock /> Mon-Fri: 9am-6pm
            </li> */}
          </ul>
        </div>
      </div>

      <div className="footer-botto">
        <p>
          © 2025 KidsChoice. All rights reserved.{" "}
          <a
            className="fooote"
            href="https://www.clotatech.com/"
            target="_blank"
            rel="noopener noreferrer"
          >
            Powered by ClotaTech
          </a>
        </p>

        <div className="social-links">
          <a
            href="https://facebook.com/yourpage"
            target="_blank"
            rel="noopener noreferrer"
          >
            <FaFacebookF />
          </a>
          <a
            href="https://instagram.com/yourpage"
            target="_blank"
            rel="noopener noreferrer"
          >
            <FaInstagram />
          </a>
          <a
            href="https://twitter.com/yourpage"
            target="_blank"
            rel="noopener noreferrer"
          >
            <FaXTwitter />
          </a>
          <a
            href="https://youtube.com/yourchannel"
            target="_blank"
            rel="noopener noreferrer"
          >
            <FaYoutube />
          </a>
        </div>
      </div>
    </footer>
  );
};

export default Footer;
