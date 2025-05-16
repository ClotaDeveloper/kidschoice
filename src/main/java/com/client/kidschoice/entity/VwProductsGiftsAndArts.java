package com.client.kidschoice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VwProductsGiftsAndArts {
	
	

	@Id
   private String ProductID;
    @Column
    private Integer CategoryID;
	@Column    
	private String CategoryName;	
	@Column    
	private String CategoryDescription;
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
    private String Dimensions;
    @Column
    private String Weight;
    @Column
    private String CountryOfOrigin;
    @Column
    private String Manufacturer;
    @Column
    private String Warranty;
    @Column
    private String CoveredInWarranty;
    @Column
    private String NotCoveredInWarranty;
	@Column    
	private String Color;	
	@Column    
	private Integer Quantity;	
	@Column    
	private Boolean StockAvailability;	
	@Column
	private byte[] PreviewImg;
	@Column    
	private Date CreatedOn;	
	@Column    
	private String CreatedBy;	
	@Column    
	private Date UpdatedOn;	
	@Column    
	private String UpdatedBy;
	
	public VwProductsGiftsAndArts () {}
	
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
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public String getCategoryDescription() {
		return CategoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		CategoryDescription = categoryDescription;
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
	
	public String getDimensions() {
		return Dimensions;
	}

	public void setDimensions(String dimensions) {
		Dimensions = dimensions;
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

	public String getWarranty() {
		return Warranty;
	}

	public void setWarranty(String warranty) {
		Warranty = warranty;
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
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public Integer getQuantity() {
		return Quantity;
	}
	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}
	public Boolean getStockAvailability() {
		return StockAvailability;
	}
	public void setStockAvailability(Boolean stockAvailability) {
		StockAvailability = stockAvailability;
	}
	
	public byte[] getPreviewImg() {
		return PreviewImg;
	}

	public void setPreviewImg(byte[] previewImg) {
		PreviewImg = previewImg;
	}

	public Date getCreatedOn() {
		return CreatedOn;
	}
	public void setCreatedOn(Date createdOn) {
		CreatedOn = createdOn;
	}
	public String getCreatedBy() {
		return CreatedBy;
	}
	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}
	public Date getUpdatedOn() {
		return UpdatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		UpdatedOn = updatedOn;
	}
	public String getUpdatedBy() {
		return UpdatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		UpdatedBy = updatedBy;
	}
	
	

}
