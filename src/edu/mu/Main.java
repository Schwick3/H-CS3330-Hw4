package edu.mu;

import edu.mu.vehicles.*;

public class Main {

	public static void main(String[] args) {
		VehicleManager vehiclemanager = new VehicleManager();
		
		
		System.out.println("VEHICLE INFORMATION");
		System.out.println("*******************");

		vehiclemanager.displayAllVehicleInformation();
		System.out.println("CAR INFORMATION");
		System.out.println("***************");
		vehiclemanager.displayAllCarInformation();
		System.out.println("MOTORBIKE INFORMATION");
		System.out.println("*********************");
		vehiclemanager.displayAllMotorBikeInformation();
		
	
		System.out.println("VEHICLE WITH HIGHEST MAINTENCE COST");
		System.out.println("***********************************");
		System.out.println(vehiclemanager.getVehicleWithHighestMaintenanceCost(1000).toString());
		
		System.out.println("VEHICLE WITH HIGHEST FUEL EFFICIENCY");
		System.out.println("***********************************");
		System.out.println(vehiclemanager.getVehicleWithHighestFuelEfficiency(500, 30).toString());
		
	}

}
