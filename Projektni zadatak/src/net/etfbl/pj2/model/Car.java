package net.etfbl.pj2.model;

import java.time.LocalDate;
import java.util.Date;

public class Car extends TransportVehicle {

	private LocalDate purchaseDate;
	private String description;
	private Integer passengerCapacity;
	private User driver;
	
	public Car(String id, String manufacturer, String model, Double purchasePrice, String batteryLevel,
			LocalDate purchaseDate, String description, Integer passengerCapacity, User driver) {

		super(id, manufacturer, model, purchasePrice, batteryLevel);
		this.purchaseDate = purchaseDate;
		this.description = description;
		this.passengerCapacity = passengerCapacity;
		this.driver = driver;
	}

	public Car(String id, String manufacturer, String model, Double purchasePrice, LocalDate purchaseDate,
			String description) {

		super(id, manufacturer, model, purchasePrice);
		this.purchaseDate = purchaseDate;
		this.description = description;

	}

	@Override
	public void chargeBattery() {
		// TODO Auto-generated method stub

	}

	@Override
	public void drainBattery() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Car " + super.toString() + ", purchaseDate="
				+ (purchaseDate != null ? purchaseDate.format(DATE_FORMATTER) : "N/A") + ", description=" + description
				+ ", passengerCapacity=" + passengerCapacity + ", driver=" + driver;
	}

}
