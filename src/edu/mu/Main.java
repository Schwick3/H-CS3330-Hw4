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
		
	}

}
