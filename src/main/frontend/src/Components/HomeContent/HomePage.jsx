import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./HomePage.css";
import bicycleImage from "../../images/cycle1.png";
import toys from "../../images/toys2.png";
import gifts from "../../images/3.png";
import Cars from "../../images/car2.png";
import ImageSlider from "./ImageSlider";
import AllProducts from "../../kidschoice/Product/AllProducts";
import { Button } from "primereact/button";
const ageGroups = ["All", "0-3", "3-5", "5-8"];

const HomePage = () => {
  const [selectedAge, setSelectedAge] = useState("All");
  const navigate = useNavigate();

  return (
    <>
      <ImageSlider />

      <div className="homepage">
        {/* Hero Banner */}
        <section className="hero-banner">
          <h1>Bringing Smiles to Every Child</h1>
          <p>Discover toys they'll love!</p>

          <div className="categories">
            <div
              className="category-card"
              onClick={() => navigate("/Cycle")}
              style={{ cursor: "pointer" }}
            >
              <img src={bicycleImage} alt="Favorite Bicycle" />
              <h3>Bicycle</h3>
            </div>

            <div
              className="category-card"
              onClick={() => navigate("/Toys")}
              style={{ cursor: "pointer" }}
            >
              <img src={toys} alt="Favorite Toys" />
              <h3>Toys</h3>
            </div>

            <div
              className="category-card"
              onClick={() => navigate("/Gifts")}
              style={{ cursor: "pointer" }}
            >
              <img src={gifts} alt="Favorite Gifts" />
              <h3>Gifts</h3>
            </div>

            <div
              className="category-card"
              onClick={() => navigate("/Car")}
              style={{ cursor: "pointer" }}
            >
              <img src={Cars} alt="Favorite Cars" />
              <h3>Cars</h3>
            </div>
          </div>
        </section>
      </div>
      <div className="home-container">
        <h1 className="home-title">Most Purchased Products</h1>

        <div className="age-filter">
          {ageGroups.map((age) => (
            <button
              key={age}
              onClick={() => setSelectedAge(age)}
              className={`age-button ${selectedAge === age ? "active" : ""}`}
            >
              {age} Years
            </button>
          ))}
        </div>

        <div>
          <AllProducts />
        </div>

     
      </div>
    </>
  );
};

export default HomePage;
