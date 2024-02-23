package edu.mu.vehicles;

import java.util.ArrayList;
import java.util.Iterator;

public class VehicleManager {
	
	ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	public void displayAllVehcileInformation() {
		Iterator<Vehicle> iterator = vehicles.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		
	}
}
