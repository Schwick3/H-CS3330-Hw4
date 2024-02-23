package edu.mu.vehicles;

import java.util.ArrayList;
import java.util.Iterator;

public class VehicleManager {
	
	ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public void displayAllVehicleInformation() {
		Iterator<Vehicle> iterator = vehicles.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}
		
		public void displayAllCarInformation() {
			Iterator<Vehicle> iterator = vehicles.iterator();
			Vehicle placeholder;
			while(iterator.hasNext()) {
				placeholder = iterator.next();
				if(placeholder instanceof Car) {
				System.out.println(placeholder.toString());
				}
		
			}
	}
		public void displayAllSUVInformation() {
			Iterator<Vehicle> iterator = vehicles.iterator();
			Vehicle placeholder;
			while(iterator.hasNext()) {
				placeholder = iterator.next();
				if(placeholder instanceof SUV) {
				System.out.println(placeholder.toString());
				}
		
			}
	}
		
		public void displayAllTruckInformation() {
			Iterator<Vehicle> iterator = vehicles.iterator();
			Vehicle placeholder;
			while(iterator.hasNext()) {
				placeholder = iterator.next();
				if(placeholder instanceof Truck) {
				System.out.println(placeholder.toString());
				}
		
			}
	}
		
		public void displayAllMotorBikeInformation() {
			Iterator<Vehicle> iterator = vehicles.iterator();
			Vehicle placeholder;
			while(iterator.hasNext()) {
				placeholder = iterator.next();
				if(placeholder instanceof MotorBike) {
				System.out.println(placeholder.toString());
				}
		
			}
	}
		
	public void displayVehicleInformation(Vehicle v) {
		if(vehicles.contains(v)) {
			v.toString();
		}
		else
			System.out.println("Vehicle not found");
	}
}
