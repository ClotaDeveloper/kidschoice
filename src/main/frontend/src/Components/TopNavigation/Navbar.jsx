import React from "react";

import logoImage from "../../images/Kid Logo.png"; 
import {
  FaUser,
} from "react-icons/fa";
import "./Navbar.css";

import { useNavigate } from "react-router-dom";

const Navbar = () => {
  const navigate = useNavigate();
  return (
    <div className="navbar-wrapper">
      <div className="main-nav">
        <div className="logo">
          <img src={logoImage} alt="KidsChoice Logo" className="logo-image" />
        </div>

        <div className="search-box">
          <input type="text" placeholder="Search for products..." />
        </div>
        <div className="icons">
          <button className="navbar-btn" onClick={() => navigate("/contact")}>
            Contact us
          </button>
          <button className="navbar-btn" onClick={() => navigate("/AboutUs")}>
            About us
          </button>
          <FaUser
            className="icon"
            onClick={() => navigate("/LoginPage")}
            style={{ cursor: "pointer" }}
          />
       
        </div>
      </div>

      {/* Navigation Menu */}
      <div className="menu-bar">
        <a href="/">Home</a>
        {/* <a href="/Cycle">Cycles</a> */}
        {/* <Link to="/Cycle">Cycles</Link> */}
        <a href="/Cycle">Cycles</a>
        <a href="/Car">Cars</a>
        <a href="/Toys">Toys</a>
        <a href="/Bikes">Bikes</a>
        <a href="/Gifts">Gifts/Arts</a>
      </div>
    </div>
  );
};

export default Navbar;
