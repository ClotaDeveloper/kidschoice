import React from "react";
import "./AboutUs.css";
import teamImage from "../../images/cycle1.png";

import { Link } from "react-router-dom";





const AboutUs = () => {
  return (
    <div className="about-us-container">
      <div className="about-text">
        <p className="subheading">ABOUT US</p>
        <h1>
          Spreading <span className="highlight">joy</span> with toys, bikes, and
          more
          <br /> for your little champions.
        </h1>
        <p className="description">
          At KidsChoice, we bring smiles to every home by offering a wide range
          of fun-filled toys, stylish bicycles, remote-controlled cars, and
          special gifts crafted just for kids. Our mission is to make childhood
          more playful, healthy, and full of imagination through safe and
          exciting products.
        </p>
        <Link to="/">
          <button className="about-btn">Shop Now</button>
        </Link>
      </div>

      <div className="about-image-wrapper">
        <div className="image-decorator"></div>
        <img src={teamImage} alt="Happy Kid Playing" className="about-image" />
      </div>
    </div>
  );
};

export default AboutUs;

