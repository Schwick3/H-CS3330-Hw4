package edu.mu.vehicles;

public class SUV extends Vehicle {

	@Override
	public double calculateMaintenceCost(double distance) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void startEngine() {
		System.out.print(getStartType());		
	}

}
