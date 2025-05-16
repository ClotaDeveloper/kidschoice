import React, { useState, useEffect } from "react";
import { useNavigate } from "react-router-dom";



import { FiChevronDown, FiChevronUp } from "react-icons/fi";

const AllProducts = () => {
  const [products, setProducts] = useState([]);
  const [visibleCount, setVisibleCount] = useState(6);
  const [loading, setLoading] = useState(true);
  const navigate = useNavigate();

  const INITIAL_COUNT = 6;
  const LOAD_COUNT = 6;

  useEffect(() => {
    fetch("/allProductsMedia")
      .then((res) => {
        if (!res.ok) {
          throw new Error("Failed to fetch products");
        }
        return res.json();
      })
      .then((data) => {
        setProducts(data);
        setLoading(false);
      })
      .catch((error) => {
        console.error("Error fetching products:", error);
        setLoading(false);
      });
  }, []);

  const handleToggle = () => {
    if (visibleCount >= products.length) {
      // Collapse back
      setVisibleCount(INITIAL_COUNT);
    } else {
      // Load more
      setVisibleCount((prev) => Math.min(prev + LOAD_COUNT, products.length));
    }
  };

  const isAllVisible = visibleCount >= products.length;

  if (loading) {
    return (
      <div style={{ textAlign: "center", padding: "40px" }}>Loading...</div>
    );
  }

  return (
    <div style={{ background: "#f5f5f5", padding: "20px" }}>
      <div
        style={{
          display: "flex",
          flexWrap: "wrap",
          gap: "20px",
          justifyContent: "center",
        }}
      >
        {products.slice(0, visibleCount).map((item) => (
          <div
            key={item.id}
            style={{
              width: "250px",
              borderRadius: "12px",
              boxShadow: "0 4px 12px rgba(0,0,0,0.1)",
              padding: "15px",
              background: "#fff",
              textAlign: "center",
            }}
          >
            <img
              src={item.image}
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
              onClick={() =>
                navigate(`/product/${item.productID}`, {
                  state: { product: item },
                })
              }
              style={{
                marginTop: "10px",
                padding: "10px 20px",
                background: "#a0c4ff",
                border: "none",
                borderRadius: "25px",
                fontWeight: "bold",
                color: "#000",
                cursor: "pointer",
              }}
            >
              View Product
            </button>
          </div>
        ))}
      </div>

      {products.length > INITIAL_COUNT && (
        <div
          style={{
            display: "flex",
            justifyContent: "center",
            marginTop: "30px",
          }}
        >
          <button
            onClick={handleToggle}
            style={{
              padding: "12px 25px",
              background: "#007bff",
              color: "#fff",
              border: "none",
              borderRadius: "30px",
              fontSize: "16px",
              fontWeight: "bold",
              cursor: "pointer",
              display: "flex",
              alignItems: "center",
              gap: "10px",
            }}
          >
            {isAllVisible ? "See Less" : "See More"}
            {isAllVisible ? (
              <FiChevronUp size={20} />
            ) : (
              <FiChevronDown size={20} />
            )}
          </button>
        </div>
      )}
    </div>
  );
};

export default AllProducts;

