package com.client.kidschoice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductsGiftsAndArts {

	
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
	    private Double SellingPrice;
	    @Column
	    private String GenericName;
	    @Column
	    private String Brand;
	    @Column
	    private String Type;
	    @Column
	    private String AgeGroup;
	    @Column
	    private String Material;
	    @Column
	    private Integer NetQuantity;
	    @Column
	    private Boolean BatteryOperated;
	    @Column
	    private Integer NoOfBatteries;
	    @Column
	    private Boolean BatteryIncluded;
	    @Column
	    private Boolean Rechargeable;
	    @Column
	    private String BatteryType;
	    @Column
	    private String DeliveryCondition;
	    @Column
	    private String SkillSet;
	    @Column
	    private String Shape;
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
		public String getProductID() {
			return ProductID;
		}
		public void setProductID(String productID) {
			ProductID = productID;
		}
		public Integer getCategoryID() {
			return CategoryID;
		}
		public void setCategoryID(Integer categoryID) {
			CategoryID = categoryID;
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
		public Double getSellingPrice() {
			return SellingPrice;
		}
		public void setSellingPrice(Double sellingPrice) {
			SellingPrice = sellingPrice;
		}
		public String getGenericName() {
			return GenericName;
		}
		public void setGenericName(String genericName) {
			GenericName = genericName;
		}
		public String getBrand() {
			return Brand;
		}
		public void setBrand(String brand) {
			Brand = brand;
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
		public Boolean getBatteryOperated() {
			return BatteryOperated;
		}
		public void setBatteryOperated(Boolean batteryOperated) {
			BatteryOperated = batteryOperated;
		}
		public Integer getNoOfBatteries() {
			return NoOfBatteries;
		}
		public void setNoOfBatteries(Integer noOfBatteries) {
			NoOfBatteries = noOfBatteries;
		}
		public Boolean getBatteryIncluded() {
			return BatteryIncluded;
		}
		public void setBatteryIncluded(Boolean batteryIncluded) {
			BatteryIncluded = batteryIncluded;
		}
		public Boolean getRechargeable() {
			return Rechargeable;
		}
		public void setRechargeable(Boolean rechargeable) {
			Rechargeable = rechargeable;
		}
		public String getBatteryType() {
			return BatteryType;
		}
		public void setBatteryType(String batteryType) {
			BatteryType = batteryType;
		}
		public String getDeliveryCondition() {
			return DeliveryCondition;
		}
		public void setDeliveryCondition(String deliveryCondition) {
			DeliveryCondition = deliveryCondition;
		}
		public String getSkillSet() {
			return SkillSet;
		}
		public void setSkillSet(String skillSet) {
			SkillSet = skillSet;
		}
		public String getShape() {
			return Shape;
		}
		public void setShape(String shape) {
			Shape = shape;
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
