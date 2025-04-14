import CommingSoon from "../src/images/CommingSoon.png";
import "./App.css";

function App() {
  return (
    <div
      style={{
        display: "flex",
        justifyContent: "center",
        alignItems: "center",
        height: "100vh",
      }}>
      <img src={CommingSoon} alt="logo" style={{ height: "100%" }} />
    </div>
  );
}

export default App;
