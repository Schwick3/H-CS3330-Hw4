package edu.mu.vehicles;

public class MotorBike extends Vehicle {

	@Override
	public double calculateMaintenceCost(double distance) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void startEngine() {
		System.out.print(getStartType());
		
	}

	public MotorBike(String type, String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType, double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType ) {
		super(type, brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
}
}
