package edu.mu.vehicles;

public class Truck extends Vehicle {
	@Override
	public double calculateMaintenceCost(double distance) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void startEngine() {
		System.out.print(getStartType());
		}
	
	public Truck(String type, String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType, double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType ) {
		super(type, brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
	}
	@Override
	public double calculateFuelEfficiency(double distance, double fuelPrice) {
		double fuelEfficiency = cylinders*gasTankCapacity*fuelPrice/distance*0.1;
		return fuelEfficiency;
	}

}