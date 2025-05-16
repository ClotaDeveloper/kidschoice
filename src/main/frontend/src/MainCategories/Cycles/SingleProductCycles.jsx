import React from "react";
import { useLocation, useParams } from "react-router-dom";
// import "./ProductDetails.css";
import { useState, useEffect } from "react";


function SingleProductCycles() {
  const location = useLocation();
  const [product, setProduct] = useState(location.state?.product || null);
  const [productImages, setProductImages] = useState([]);


  const { productID } = useParams(); // <-- get it from URL
 


  useEffect(() => {
    async function fetchProductMediaByPID() {
      if (!productID) return;

      try {
        const response = await fetch(`/allProductsMediaByPID/${productID}`, {
          headers: {
            Authorization: `Bearer ${sessionStorage.getItem("jwtToken")}`,
          },
        });

        if (!response.ok) {
          throw new Error(
            `Error fetching product media: ${response.status} ${response.statusText}`
          );
        }

        const result = await response.json();
        console.log("API result:", result); // <-- Check this in your browser console

        if (!Array.isArray(result)) {
          throw new Error("Product media response is not an array");
        }

        setProductImages(result);
      } catch (error) {
        console.error("Error fetching product images:", error.message);
      }
    }

    fetchProductMediaByPID();
  }, [productID]);

  // Check first image's data key (adjust 'imageData' below based on your API response)
  console.log("Image data:", productImages[0]?.imageData);

  return (
    <div
      style={{
        display: "flex",
        maxWidth: "1200px",
        margin: "auto",
        padding: "20px",
      }}
    >
      {/* Left - Image */}
      <div style={{ width: "50%", marginRight: "20px" }}>
        {productImages.length > 0 && productImages[0].imageData && (
          <img
            src={`data:image/png;base64,${productImages[0].imageData}`}
            alt={`Product ${product?.productName}`}
            style={{ width: "100%", borderRadius: "8px" }}
          />
        )}

        <div style={{ marginTop: "20px" }}>
          <h3>Specifications</h3>
          {product &&
            Object.entries(product).map(([key, value]) => {
              const excludedKeys = [
                "productImages",
                "description",
                "productName",
                "updatedOn",
                "createdOn",
                "createdBy",
                "updatedBy",
                "categoryID",
                "categoryName",
                "productID",
                "__v",
              ];

              if (
                value === null ||
                value === undefined ||
                typeof value === "object" ||
                excludedKeys.includes(key)
              ) {
                return null;
              }

              const formattedKey = key
                .replace(/([A-Z])/g, " $1")
                .replace(/^./, (str) => str.toUpperCase());

              return (
                <p key={key}>
                  <strong>{formattedKey}:</strong> {value.toString()}
                </p>
              );
            })}
        </div>
      </div>

      {/* Right - Details */}
      <div style={{ width: "40%" }}>
        <h2>{product?.productName}</h2>
        <p>
          <strong>Age Group:</strong> {product?.ageGroup}
        </p>
        <p>
          <strong>Brand:</strong> {product?.brand}
        </p>
        <p>
          <strong>Color:</strong> {product?.color}
        </p>
        <p style={{ fontSize: "24px", color: "#e60000" }}>₹{product?.price}</p>
        <div style={{ marginTop: "20px" }}>
          <h4>Description</h4>
          <p>{product?.description}</p>
        </div>
      </div>
    </div>
  );
}

export default SingleProductCycles;
