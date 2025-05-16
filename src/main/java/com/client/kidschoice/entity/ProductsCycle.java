package com.client.kidschoice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductsCycle {


	   @Id
	   private String ProductID;
	    @Column
	    private Integer CategoryID;
	    @Column
	    private String ProductName;
	    @Column
	    private String Description;
	    @Column
	    private Double Price;
	    @Column
	    private String Brand;
	    @Column
	    private String ModelNumber;
	    @Column
	    private String GenericName;
	    @Column
	    private String Type;
	    @Column
	    private String AgeGroup;
	    @Column
	    private String Material;
	    @Column
	    private Integer NetQuantity;
	    @Column
	    private String Speed;
	    @Column
	    private String DeliveryCondition;
	    @Column
	    private Boolean Lights;
	    @Column
	    private Boolean Horn;
	    @Column
	    private String Dimentions;
	    @Column
	    private String Weight;
	    @Column
	    private String CountryOfOrigin;
	    @Column
	    private String Manufacturer;
	    @Column
	    private String Warrenty;
	    @Column
	    private String CoveredInWarranty;
	    @Column
	    private String NotCoveredInWarranty;
	    
		public Integer getCategoryID() {
			return CategoryID;
		}
		public void setCategoryID(Integer categoryID) {
			CategoryID = categoryID;
		}
		public String getProductID() {
			return ProductID;
		}
		public void setProductID(String productID) {
			ProductID = productID;
		}
		public String getProductName() {
			return ProductName;
		}
		public void setProductName(String productName) {
			ProductName = productName;
		}
		public String getDescription() {
			return Description;
		}
		public void setDescription(String description) {
			Description = description;
		}
		public Double getPrice() {
			return Price;
		}
		public void setPrice(Double price) {
			Price = price;
		}
		public String getBrand() {
			return Brand;
		}
		public void setBrand(String brand) {
			Brand = brand;
		}
		public String getModelNumber() {
			return ModelNumber;
		}
		public void setModelNumber(String modelNumber) {
			ModelNumber = modelNumber;
		}
		public String getGenericName() {
			return GenericName;
		}
		public void setGenericName(String genericName) {
			GenericName = genericName;
		}
		public String getType() {
			return Type;
		}
		public void setType(String type) {
			Type = type;
		}
		public String getAgeGroup() {
			return AgeGroup;
		}
		public void setAgeGroup(String ageGroup) {
			AgeGroup = ageGroup;
		}
		public String getMaterial() {
			return Material;
		}
		public void setMaterial(String material) {
			Material = material;
		}
		public Integer getNetQuantity() {
			return NetQuantity;
		}
		public void setNetQuantity(Integer netQuantity) {
			NetQuantity = netQuantity;
		}
		public String getSpeed() {
			return Speed;
		}
		public void setSpeed(String speed) {
			Speed = speed;
		}
		public String getDeliveryCondition() {
			return DeliveryCondition;
		}
		public void setDeliveryCondition(String deliveryCondition) {
			DeliveryCondition = deliveryCondition;
		}
		public Boolean getLights() {
			return Lights;
		}
		public void setLights(Boolean lights) {
			Lights = lights;
		}
		public Boolean getHorn() {
			return Horn;
		}
		public void setHorn(Boolean horn) {
			Horn = horn;
		}
		public String getDimentions() {
			return Dimentions;
		}
		public void setDimentions(String dimentions) {
			Dimentions = dimentions;
		}
		public String getWeight() {
			return Weight;
		}
		public void setWeight(String weight) {
			Weight = weight;
		}
		public String getCountryOfOrigin() {
			return CountryOfOrigin;
		}
		public void setCountryOfOrigin(String countryOfOrigin) {
			CountryOfOrigin = countryOfOrigin;
		}
		public String getManufacturer() {
			return Manufacturer;
		}
		public void setManufacturer(String manufacturer) {
			Manufacturer = manufacturer;
		}
		public String getWarrenty() {
			return Warrenty;
		}
		public void setWarrenty(String warrenty) {
			Warrenty = warrenty;
		}
		public String getCoveredInWarranty() {
			return CoveredInWarranty;
		}
		public void setCoveredInWarranty(String coveredInWarranty) {
			CoveredInWarranty = coveredInWarranty;
		}
		public String getNotCoveredInWarranty() {
			return NotCoveredInWarranty;
		}
		public void setNotCoveredInWarranty(String notCoveredInWarranty) {
			NotCoveredInWarranty = notCoveredInWarranty;
		}
	    
    

   

}
