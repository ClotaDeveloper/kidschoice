import React from "react";
import "./LoginPage.css";
import banner from "../../images/cycle1.png";






const LoginPage = () => {
  return (
    <div className="login-wrapper">
      <div className="login-left">
        <div className="login-content">
          
          <h2>Sign in to your account</h2>
          <p className="sub-text">Welcome back! Please enter your details.</p>
          <form>
            <input type="email" placeholder="Email address" required />
            <input type="password" placeholder="Password" required />
            <div className="options">
              <a href="#">Forgot password?</a>
            </div>
            <button className="btnss" type="submit">Login</button>
            <p className="signup-link">
              Don’t have an account? <a href="#">Sign up</a>
            </p>
          </form>
        </div>
      </div>
      <div className="login-right">
        <img
          src={banner}
          alt="Visual"
        />
      </div>
    </div>
  );
};

export default LoginPage;
