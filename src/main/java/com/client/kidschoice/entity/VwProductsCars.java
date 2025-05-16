package com.client.kidschoice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VwProductsCars {
	
    @Id
    private String ProductID;
	@Column    
	private String CategoryName;	
	@Column    
	private String CategoryDescription;
    @Column
    private Integer CategoryID;
    @Column
    private String ProductName;
    @Column
    private String Description;
    @Column
    private Double Price;
    @Column
    private String GenericName;
    @Column
    private String Brand;
    @Column
    private String ModelNumber;
    @Column
    private String Type;
    @Column
    private String AgeGroup;
    @Column
    private String MaximumUserWeight;
    @Column
    private Integer NetQuantity;
    @Column
    private String Speed;
    @Column
    private String DeliveryCondition;
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
    private String OtherPowerFeatures;
    @Column
    private Boolean KeyStart;
    @Column
    private Boolean SeatbeltIncluded;
    @Column
    private Boolean MpThreePlayerSupported;
    @Column
    private Boolean ParentalRemote;
    @Column
    private String Lights;
    @Column
    private String Horn;
    @Column
    private String OtherConvenienceFeatures;
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
	
	
	public VwProductsCars () {}
	
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
	public String getModelNumber() {
		return ModelNumber;
	}
	public void setModelNumber(String modelNumber) {
		ModelNumber = modelNumber;
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
	public String getMaximumUserWeight() {
		return MaximumUserWeight;
	}
	public void setMaximumUserWeight(String maximumUserWeight) {
		MaximumUserWeight = maximumUserWeight;
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
	public String getOtherPowerFeatures() {
		return OtherPowerFeatures;
	}
	public void setOtherPowerFeatures(String otherPowerFeatures) {
		OtherPowerFeatures = otherPowerFeatures;
	}
	public Boolean getKeyStart() {
		return KeyStart;
	}
	public void setKeyStart(Boolean keyStart) {
		KeyStart = keyStart;
	}
	public Boolean getSeatbeltIncluded() {
		return SeatbeltIncluded;
	}
	public void setSeatbeltIncluded(Boolean seatbeltIncluded) {
		SeatbeltIncluded = seatbeltIncluded;
	}
	public Boolean getMpThreePlayerSupported() {
		return MpThreePlayerSupported;
	}
	public void setMpThreePlayerSupported(Boolean mpThreePlayerSupported) {
		MpThreePlayerSupported = mpThreePlayerSupported;
	}
	public Boolean getParentalRemote() {
		return ParentalRemote;
	}
	public void setParentalRemote(Boolean parentalRemote) {
		ParentalRemote = parentalRemote;
	}
	public String getLights() {
		return Lights;
	}
	public void setLights(String lights) {
		Lights = lights;
	}
	public String getHorn() {
		return Horn;
	}
	public void setHorn(String horn) {
		Horn = horn;
	}
	public String getOtherConvenienceFeatures() {
		return OtherConvenienceFeatures;
	}
	public void setOtherConvenienceFeatures(String otherConvenienceFeatures) {
		OtherConvenienceFeatures = otherConvenienceFeatures;
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
