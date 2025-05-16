import React, { useEffect, useState } from "react";
import Noimage from "../../images/3.png";

function SingleProductCar() {
  const productId = sessionStorage.getItem("productID");

  const [product, setProduct] = useState([]);
  const [productDescription, setProductDescription] = useState("");
  const [productImg, setProductImg] = useState([]);

  async function FetchAllEmployeeData() {
    try {
      const response = await fetch(`/allCarsByPID/KCC103`);
      const result = await response.json();
      setProduct(result);

      if (!Array.isArray(response)) {
        throw new Error("Data is not in the expected format");
      }
    } catch (error) {
      console.error("Error fetching employee data:", error.message);
    }
  }

  async function fetchProductMediaByPID() {
    try {
      const response = await fetch(`/allProductsMediaByPID/KCC103`);

      const result = await response.json();
      console.log("API result:", result);
      if (!Array.isArray(result)) {
        throw new Error("Product media response is not an array");
      }

      setProductImg(result);
    } catch (error) {
      console.error("Error fetching product images:", error.message);
    }
  }
  useEffect(() => {
    FetchAllEmployeeData();
    fetchProductMediaByPID();
  }, []);
  console.log(product);
  return (
    <div
      style={{
        display: "flex",
        maxWidth: "1200px",
        margin: "auto",
        padding: "20px",
      }}>
      {productImg.map((emp) => (
        <div key={emp.id}>
          <img
            src={
              emp.productImages
                ? `data:image/png;base64,${emp.productImages}`
                : Noimage
            }
            alt={`Product`}
            style={{ width: "100%", borderRadius: "8px" }}
          />
        </div>
      ))}

      {/* Right - Details */}

      {product.map((prdct) => (
        <div style={{ width: "40%" }}>
          <h2>{prdct.productName}</h2>
          <p>
            <strong>Age Group:</strong> {prdct.ageGroup}
          </p>
          <p>
            <strong>Brand:</strong> {prdct.brand}
          </p>
          <p>
            <strong>Color:</strong> {prdct.color}
          </p>
          <p style={{ fontSize: "24px", color: "#e60000" }}>₹{prdct.price}</p>
          <div style={{ marginTop: "20px" }}>
            <h4>Description</h4>
            <p>{prdct.description}</p>
          </div>
        </div>
      ))}
    </div>
  );
}

export default SingleProductCar;
