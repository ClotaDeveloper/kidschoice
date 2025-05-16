import React from "react";
import ProductList from "../../ProductCard";
import CycleData from "../Cycle";

const CyclesPage = () => {
  return (
    <div>
      <h2>Cycle Products</h2>
      <ProductList products={CycleData} />
    </div>
  );
};

export default CyclesPage;
