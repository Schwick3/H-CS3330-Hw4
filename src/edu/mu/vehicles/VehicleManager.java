package src.edu.mu.vehicles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import src.edu.mu.vehicles.Car;
import src.edu.mu.vehicles.FuelType;
import src.edu.mu.vehicles.MotorBike;
import src.edu.mu.vehicles.SUV;
import src.edu.mu.vehicles.StartMechanism;
import src.edu.mu.vehicles.Truck;
import src.edu.mu.vehicles.VehicleColor;

public class VehicleManager {
	
	private static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	protected final static String vehicleFilePath = "files/vehicleList.csv";
	private static ArrayList<String[]> vStringList = new ArrayList<String[]>();
	//private static ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	
	public static boolean readFromFile() {
		try {
			Scanner fileIn = new Scanner(new FileInputStream(vehicleFilePath));
			
			fileIn.nextLine();
			
			while(fileIn.hasNextLine()) {
				String[] line = fileIn.nextLine().split(",");
				vStringList.add(line);
			}
		fileIn.close();		
		return true;
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			return false;
				
			}
	}
	public VehicleManager() {
		readFromFile();
		for(String[] _line : vStringList) {
			if(_line[0].equals("Truck")) {
				Truck tItem = new Truck(_line[0], _line[1], _line[2], Long.parseLong(_line[3]), Double.parseDouble(_line[4]), VehicleColor.valueOf(_line[5]), FuelType.valueOf(_line[6]),
						Double.parseDouble(_line[7]), Double.parseDouble(_line[8]), Integer.parseInt(_line[9]), Double.parseDouble(_line[10]), StartMechanism.valueOf(_line[11]));
				vehicles.add(tItem);
				
			}
			else if(_line[0].equals("Car")) {
				Car cItem = new Car(_line[0], _line[1], _line[2], Long.parseLong(_line[3]), Double.parseDouble(_line[4]), VehicleColor.valueOf(_line[5]), FuelType.valueOf(_line[6]),
						Double.parseDouble(_line[7]), Double.parseDouble(_line[8]), Integer.parseInt(_line[9]), Double.parseDouble(_line[10]), StartMechanism.valueOf(_line[11]));
				vehicles.add(cItem);
			}
			else if(_line[0].equals("SUV")) {
				SUV sItem = new SUV(_line[0], _line[1], _line[2], Long.parseLong(_line[3]), Double.parseDouble(_line[4]), VehicleColor.valueOf(_line[5]), FuelType.valueOf(_line[6]),
						Double.parseDouble(_line[7]), Double.parseDouble(_line[8]), Integer.parseInt(_line[9]), Double.parseDouble(_line[10]), StartMechanism.valueOf(_line[11]));
				vehicles.add(sItem);
			}
			else if(_line[0].equals("MotorBike")) {
				MotorBike mItem = new MotorBike(_line[0], _line[1], _line[2], Long.parseLong(_line[3]), Double.parseDouble(_line[4]), VehicleColor.valueOf(_line[5]), FuelType.valueOf(_line[6]),
						Double.parseDouble(_line[7]), Double.parseDouble(_line[8]), Integer.parseInt(_line[9]), Double.parseDouble(_line[10]), StartMechanism.valueOf(_line[11]));
				vehicles.add(mItem);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	
	public boolean removeVehicle(Vehicle vehicle) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
