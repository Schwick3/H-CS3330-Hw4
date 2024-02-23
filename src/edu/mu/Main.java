package src.edu.mu;

import src.edu.mu.vehicles.VehicleManager;

public class Main {

	public static void main(String[] args) {
			// Instantiate vehicleManager, perform operations based on the requirements.
			VehicleManager vehicleManager = new VehicleManager();
			// Read vehicle data from the vehcileList.csv file and initialize objects.
			
			// Display all vehicle information.
			vehicleManager.displayAllVehicleInformation();
			// Display all car information.
			vehicleManager.displayAllCarInformation();
			// Display all motorbike information.
			vehicleManager.displayAllMotorBikeInformation();

	}

}
