package edu.mu.vehicles;

public abstract class Vehicle {
	



	protected String type;
	protected String brand;
	protected String make;
	protected long modelYear;
	protected double price;
	protected VehicleColor color;
	protected FuelType fuelType;
	protected double mileage;
	protected double mass;
	protected int cylinders;
	protected double gasTankCapacity;
	protected StartMechanism startType;
	
	public Vehicle(String type, String brand, String make, long modelYear, double price, VehicleColor color,
			FuelType fuelType, double mileage, double mass, int cylinders, double gasTankCapacity,
			StartMechanism startType) {
		super();
		this.type = type;
		this.brand = brand;
		this.make = make;
		this.modelYear = modelYear;
		this.price = price;
		this.color = color;
		this.fuelType = fuelType;
		this.mileage = mileage;
		this.mass = mass;
		this.cylinders = cylinders;
		this.gasTankCapacity = gasTankCapacity;
		this.startType = startType;
	}
	
	
	
	public abstract double calculateFuelEfficiency(double distance, double fuelPrice);
	@Override
	public String toString() {
		return "Vehicle Type:" + type + "Vehicle Brand:" + brand + ", Make: " + make + ", Year: " + modelYear + ", Price: " + price
				+ ", Color: " + color + ", Fuel Type: " + fuelType + ", Mileage" + mileage + ", Mass: " + mass
				+ ", Number of Cylinders: " + cylinders + ", Fuel Capacity" + gasTankCapacity + ", Start Type:" + startType;
	}
	
	public abstract double calculateMaintenceCost(double distance);
		
	public abstract void startEngine();

	public StartMechanism getStartType() {
		return startType;
	}
	
}
