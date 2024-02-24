package src.edu.mu.vehicles;

public class Car extends Vehicle {
	public Car(String type, String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType, double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType ) {
		super(type, brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
}
	@Override
	public double calculateFuelEfficiency(double distance, double fuelPrice) {
		double fuelEfficiency = cylinders*gasTankCapacity*fuelPrice/distance*0.003;
		return fuelEfficiency;
	}
}
