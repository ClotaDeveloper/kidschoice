import { Button } from "primereact/button";
import React, { useState, useEffect } from "react";
import { useNavigate } from "react-router-dom";

function AllProductsCars() {
  const [cars, setCars] = useState([]);
  const [loading, setLoading] = useState(true);
  const navigate = useNavigate();

  useEffect(() => {
    fetch("/allCars")
      .then((res) => {
        if (!res.ok) {
          throw new Error("Failed to fetch cars");
        }
        return res.json();
      })
      .then((data) => {
        setCars(data);
        setLoading(false);
      })
      .catch((error) => {
        console.error("Error fetching cars:", error);
        setLoading(false);
      });
  }, []);

  if (loading) {
    return (
      <div style={{ textAlign: "center", padding: "40px" }}>Loading...</div>
    );
  }

  return (
    <div
      style={{
        display: "flex",
        flexWrap: "wrap",
        gap: "20px",
        justifyContent: "center",
        padding: "20px",
        background: "#f5f5f5",
      }}>
      <div className="card flex justify-content-center"></div>
      {cars.map((item) => (
        <div
          key={item.id}
          style={{
            width: "250px",
            borderRadius: "12px",
            boxShadow: "0 4px 12px rgba(0,0,0,0.1)",
            padding: "15px",
            background: "#fff",
            textAlign: "center",
          }}>
          <img
            src={`data:image/png;base64,${item.previewImg}`}
            alt={item.name}
            style={{
              width: "100%",
              height: "180px",
              objectFit: "cover",
              borderRadius: "10px",
            }}
          />
          <h2 style={{ fontSize: "20px", margin: "10px 0" }}>
            {item.productName}
          </h2>
          <p style={{ color: "#666", margin: 0 }}>{item.ageGroup} Years</p>
          <p style={{ color: "red", fontWeight: "bold", fontSize: "18px" }}>
            ₹{item.price}
          </p>
          <button
            onClick={() => {
              navigate(`/product/${item.productID}`, {
                state: { product: item },
              });
              sessionStorage.setItem("productId", item.productID);
            }}
            style={{
              marginTop: "10px",
              padding: "10px 20px",
              background: "#a0c4ff",
              border: "none",
              borderRadius: "25px",
              fontWeight: "bold",
              color: "#000",
              cursor: "pointer",
            }}>
            View Product
          </button>
        </div>
      ))}
    </div>
  );
}

export default AllProductsCars;
