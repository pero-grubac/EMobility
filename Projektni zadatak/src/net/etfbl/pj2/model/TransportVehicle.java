package net.etfbl.pj2.model;

import java.time.format.DateTimeFormatter;

public abstract class TransportVehicle implements Chargeable {

	private String id;
	private String manufacturer;
	private String model;
	private Double purchasePrice;
	private String batteryLevel;
    protected static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("d.M.yyyy.");

	public TransportVehicle() {
		super();
	}

	public TransportVehicle(String id, String manufacturer, String model, Double purchasePrice, String batteryLevel) {
		super();
		this.id = id;
		this.manufacturer = manufacturer;
		this.model = model;
		this.purchasePrice = purchasePrice;
		this.batteryLevel = batteryLevel;
	}
	public TransportVehicle(String id, String manufacturer, String model, Double purchasePrice) {
		super();
		this.id = id;
		this.manufacturer = manufacturer;
		this.model = model;
		this.purchasePrice = purchasePrice;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Double getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public String getBatteryLevel() {
		return batteryLevel;
	}
	public void setBatteryLevel(String batteryLevel) {
		this.batteryLevel = batteryLevel;
	}
	@Override
	public String toString() {
		return "id=" + id + ", manufacturer=" + manufacturer + ", model=" + model + ", purchasePrice="
				+ purchasePrice + ", batteryLevel=" + batteryLevel ;
	}
	
	 

	
}
