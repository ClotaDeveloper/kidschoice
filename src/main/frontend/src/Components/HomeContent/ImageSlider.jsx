import React, { useEffect, useState } from "react";
import { FaChevronLeft, FaChevronRight } from "react-icons/fa";
import img1 from "../../images/car1.png";
import img2 from "../../images/toys3.png";
import img3 from "../../images/cycle3.png";
import img4 from "../../images/cycle1.png";
import img5 from "../../images/toys2.png";

const images = [img1, img2, img3, img4, img5];



const HeroSlider = () => {
  const [currentIndex, setCurrentIndex] = useState(0);

  useEffect(() => {
    const interval = setInterval(() => {
      setCurrentIndex((prevIndex) => (prevIndex + 1) % images.length);
    }, 4000);
    return () => clearInterval(interval);
  }, []);

  return (
    <div style={styles.container}>
      <div style={styles.content}>
        <h1 style={styles.heading}>
          Ride Into <span style={styles.highlight}>Adventure</span>
        </h1>
        <p style={styles.subText}>
          Safe, stylish and super fun bikes just for your little one.
        </p>
        <button style={styles.primaryBtn}>Explore Now →</button>
      </div>

      <div style={styles.sliderContainer}>
        <img
          src={images[currentIndex]}
          alt={`Slide ${currentIndex + 1}`}
          style={styles.image}
        />
        <button
          onClick={() =>
            setCurrentIndex((currentIndex - 1 + images.length) % images.length)
          }
          style={styles.leftArrow}
        >
          <FaChevronLeft />
        </button>
        <button
          onClick={() => setCurrentIndex((currentIndex + 1) % images.length)}
          style={styles.rightArrow}
        >
          <FaChevronRight />
        </button>
      </div>
    </div>
  );
};

const styles = {
  container: {
    display: "flex",
    flexWrap: "wrap",
    alignItems: "center",
    justifyContent: "space-between",
    padding: "60px 40px",
    background: "linear-gradient(to right, #ffeaa7, #fab1a0)",
  },
  content: {
    flex: "1 1 40%",
    paddingRight: "30px",
  },
  heading: {
    fontSize: "3rem",
    fontWeight: "bold",
    marginBottom: "20px",
    lineHeight: "1.2",
  },
  highlight: {
    color: "#d63031",
  },
  subText: {
    fontSize: "1.1rem",
    color: "#2d3436",
    marginBottom: "25px",
  },
  primaryBtn: {
    backgroundColor: "#e17055",
    color: "#fff",
    padding: "12px 28px",
    border: "none",
    borderRadius: "30px",
    fontSize: "1rem",
    cursor: "pointer",
    transition: "background-color 0.3s ease",
  },
  sliderContainer: {
    flex: "1 1 55%",
    position: "relative",
  },
  image: {
    width: "100%",
    height: "400px",
    objectFit: "cover",
    borderRadius: "20px",
    boxShadow: "0 15px 30px rgba(0, 0, 0, 0.2)",
  },
  leftArrow: {
    position: "absolute",
    top: "50%",
    left: "10px",
    transform: "translateY(-50%)",
    background: "#2d3436",
    color: "#fff",
    border: "none",
    borderRadius: "50%",
    padding: "10px",
    cursor: "pointer",
    opacity: 0.7,
  },
  rightArrow: {
    position: "absolute",
    top: "50%",
    right: "10px",
    transform: "translateY(-50%)",
    background: "#2d3436",
    color: "#fff",
    border: "none",
    borderRadius: "50%",
    padding: "10px",
    cursor: "pointer",
    opacity: 0.7,
  },
};

export default HeroSlider;
