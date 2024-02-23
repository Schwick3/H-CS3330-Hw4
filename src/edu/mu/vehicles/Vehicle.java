package edu.mu.vehicles;

public abstract class Vehicle {
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
	
	@Override
	public String toString() {
		return "Vehicle Brand:" + brand + ", Make: " + make + ", Year: " + modelYear + ", Price: " + price
				+ ", Color: " + color + ", Fuel Type: " + fuelType + ", Mileage" + mileage + ", Mass: " + mass
				+ ", Number of Cylinders: " + cylinders + ", Fuel Capacity" + gasTankCapacity + ", Start Type:" + startType;
	}
}
