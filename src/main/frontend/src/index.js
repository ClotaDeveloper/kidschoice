import ReactDOM from "react-dom/client";
import App from "./App";
import { StoreProvider } from "./StoreContext"; // 👈 import this
import "primereact/resources/themes/lara-light-indigo/theme.css";
import "primereact/resources/primereact.css"; // core css
import "primereact/resources/primereact.min.css";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <StoreProvider>
    <App />
  </StoreProvider>
);
