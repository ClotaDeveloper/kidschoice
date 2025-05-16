import React from 'react'
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import HomePage from '../Components/HomeContent/HomePage';
import AllProductsCycles from '../MainCategories/Cycles/AllProductsCycles';
import AllProductsGiftsAndArts from '../MainCategories/GiftsAndArts/AllProductsGiftsAndArts';
import AllProductsToys from '../MainCategories/Toys/AllProductsToys';
import AllProductsBike from '../MainCategories/Bikes/AllProductsBike';
import AllProductsCars from '../MainCategories/Cars/AllProductsCars';
import Contact from '../Components/TopNavigation/ContactUs';
import AboutUs from '../Components/TopNavigation/AboutUs';
import LoginPage from '../Components/TopNavigation/LoginPage';
import PrivacyPolicy from '../Components/BottomNavigation/PrivacyPolicy';
import TermsOfService from '../Components/BottomNavigation/TermsOfService';
import ReturnsExchanges from '../Components/BottomNavigation/ReturnsExchanges';
import ShippingPolicy from '../Components/BottomNavigation/ShippingPolicy';
import Navbar from '../Components/TopNavigation/Navbar';
import Footer from '../Components/BottomNavigation/Footer';
import SingleProductCycles from '../MainCategories/Cycles/SingleProductCycles';

function PageRouter() {
  return (
    <Router>
      <Navbar />
      <div className="flex flex-col min-h-screen bg-[#fffaf0] text-gray-800 font-sans">
        <main className="flex-grow pt-20 pb-10 px-4 md:px-10 bg-gradient-to-br from-yellow-50 to-pink-50">
          <Routes>
            <Route path="/" element={<HomePage />} />
            <Route path="/Cycle" element={<AllProductsCycles />} />
            <Route path="/Gifts" element={<AllProductsGiftsAndArts />} />
            <Route path="/Toys" element={<AllProductsToys />} />
            <Route path="/Bikes" element={<AllProductsBike />} />
            <Route path="/Car" element={<AllProductsCars />} />
            {/* <Route path="/AllProducts" element={<AllProducts />} /> */}
            <Route path="/Contact" element={<Contact />} />
            <Route path="/AboutUs" element={<AboutUs />} />
            <Route path="/LoginPage" element={<LoginPage />} />

            {/* <Route path="/product/:id" element={<ProductDetails />} /> */}
            {/* <Route path="/product/:id" element={<ProductDetails />} /> */}
            <Route path="/product/:productID" element={<SingleProductCycles />} />
            <Route path="/privacypolicy" element={<PrivacyPolicy />} />
            <Route path="/TermsOfService" element={<TermsOfService />} />
            <Route path="/ReturnsExchanges" element={<ReturnsExchanges />} />
            <Route path="/ShippingPolicy" element={<ShippingPolicy />} />
          </Routes>
        </main>
        <Footer />
      </div>
    </Router>
  );
}

export default PageRouter;