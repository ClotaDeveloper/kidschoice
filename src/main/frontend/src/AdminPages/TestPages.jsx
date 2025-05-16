import { Button } from "primereact/button";
import { InputText } from "primereact/inputtext";
import React, { useState} from "react";

function TestPages() {
    const [newID, setNewID] = useState("");
    const [newFile, setNewFile] = useState(null);
    const [newProductID, setNewProductID] = useState(null);
    const [newCategoryID, setNewCategoryID] = useState(null);
    const handleFileChange = (e) => {
        const selectedFile = e.target.files[0];
  
        if (selectedFile) {
            setNewFile(selectedFile);
        }
    };
    const applyExpenseClaim = async (e) => {
        e.preventDefault();
  
        const formData = new FormData();
        formData.append("id", newID);
        formData.append("productID", newProductID);
        formData.append("productCategory", newCategoryID);
        formData.append("productImages", newFile);
  
        try {
            const response = await fetch("/updateProductsMediaDetails", {
                method: "PUT",
                body: formData,
            });
            if (response.ok) {
                alert("Successfully submitted the expense claim");
            }
        } catch (error) {
            console.error("Error:", error);
        }
    };
  
    return (
      <div>
        <form onSubmit={applyExpenseClaim} className="">
          <div className="grid">
            <div className="col-12 md:col-6 lg:col-6">
              <div
                className="flex  flex-column mt-3"
                style={{ position: "relative" }}>
                <label
                  style={{
                    position: "absolute",
                    zIndex: "97",
                    backgroundColor: "white",
                    top: "-5px",
                    left: "10px",
                    padding: "0px 2px",
                  }}
                  className="labelforinputs "
                  htmlFor="">
                  ID
                  <span className="starForMandatoryInInputFields">*</span>
                </label>
                <InputText
                  type="text"
                  className="datemobileFile"
                  placeholder="File Date"
                  value={newID}
                  onChange={(e) => setNewID(e.target.value)}
                />
              </div>
              <div
                className="flex  flex-column mt-3"
                style={{ position: "relative" }}>
                <label
                  style={{
                    position: "absolute",
                    zIndex: "97",
                    backgroundColor: "white",
                    top: "-5px",
                    left: "10px",
                    padding: "0px 2px",
                  }}
                  className="labelforinputs "
                  htmlFor="">
                  CategoryID
                  <span className="starForMandatoryInInputFields">*</span>
                </label>
                <InputText
                  type="text"
                  className="datemobileFile"
                  placeholder="File Date"
                  value={newCategoryID}
                  onChange={(e) => setNewCategoryID(e.target.value)}
                />
              </div>
            </div>
            <div className="col-12 md:col-6 lg:col-6 mobileform">
              <div
                className="flex  flex-column mt-3"
                style={{ position: "relative" }}>
                <label
                  style={{
                    position: "absolute",
                    zIndex: "97",
                    backgroundColor: "white",
                    top: "-5px",
                    left: "10px",
                    padding: "0px 2px",
                  }}
                  className="labelforinputs "
                  htmlFor="">
                  ProductID
                  <span className="starForMandatoryInInputFields">*</span>
                </label>
                <InputText
                  type="text"
                  className="datemobileFile"
                  placeholder="File Date"
                  value={newProductID}
                  onChange={(e) => setNewProductID(e.target.value)}
                />
              </div>
              <div
                className="flex  flex-column mt-3"
                style={{ position: "relative" }}>
                <label
                  style={{
                    position: "absolute",
                    zIndex: "97",
                    backgroundColor: "white",
                    top: "-5px",
                    left: "10px",
                    padding: "0px 2px",
                  }}
                  className="labelforinputs "
                  htmlFor="">
                  Document Upload
                  <span className="starForMandatoryInInputFields">*</span>
                </label>
                <InputText
                  type="file"
                  id="file"
                  aria-describedby="username-help"
                  // value={selectedDocumentTypeId}
                  onChange={handleFileChange}
                />
              </div>
            </div>
          </div>
          <div className="flex justify-content-center">
            <Button
              label="Upload"
              type="submit"
              rounded
              className="mt-3 mb-3 roundad"
              disabled={!newID || !newCategoryID || !newProductID || !newFile}
            />
          </div>
        </form>
   
      </div>
    );
}  

export default TestPages;