package edu.mu.vehicles;

import java.io.*;

import java.util.*;

import edu.mu.vehicles.*;


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
		Iterator<Vehicle> removeIterator = vehicles.iterator();
		
		while(removeIterator.hasNext()) {
			if(vehicle.equals(removeIterator.next())){
				removeIterator.remove();
				return true;
			}
		}
		return false;
	}
	public boolean addVehicle(Vehicle vehicle) {
		try {
			vehicles.add(vehicle);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean saveVehicleList() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(vehicleFilePath, false));
			for(Vehicle item: vehicles) {
				bw.write(item.type + "," + item.brand + "," + item.make + "," + item.modelYear + "," + item.price + "," + item.color + "," +
						item.fuelType + "," + item.mileage + "," + item.mass + "," + item.cylinders +
						"," + item.gasTankCapacity + "," + item.startType + System.lineSeparator());
			}
			bw.close();
			return true;
		}
		catch(IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	private boolean isVehicleType(Vehicle v, Class clazz ) {
		
		if(v.getClass().equals(clazz)) {
			return true;
		}
		else return false;
	}
	
	
	public ArrayList<Vehicle> getVehicleWithHighestFuelEfficiency(double distance, double fuelPrice){
		double highEfficiency = 0;
		ArrayList<Vehicle> highEfficiencyVehicles = new ArrayList<>();
		
		
		for (Vehicle vehicle : vehicles) {
			if (vehicle.calculateFuelEfficiency(distance, fuelPrice)>highEfficiency) {
				highEfficiencyVehicles.clear();
				highEfficiency = vehicle.calculateFuelEfficiency(distance, fuelPrice);
				highEfficiencyVehicles.add(vehicle);
				
				
			}
			else if(vehicle.calculateFuelEfficiency(distance, fuelPrice)==highEfficiency){
				
				highEfficiencyVehicles.add(vehicle);
				
			}
		}
		return highEfficiencyVehicles;
	}
		
	
	public ArrayList<Vehicle> getVehicleWithLowestFuelEfficiency(double distance, double
	fuelPrice){
		double lowEfficiency = Double.MAX_VALUE;
		ArrayList<Vehicle> lowEfficiencyVehicles = new ArrayList<>();
		
		
		for (Vehicle vehicle : vehicles) {
			if (vehicle.calculateFuelEfficiency(distance, fuelPrice)<lowEfficiency) {
				lowEfficiencyVehicles.clear();
				lowEfficiency = vehicle.calculateFuelEfficiency(distance, fuelPrice);
				lowEfficiencyVehicles.add(vehicle);
				
				
			}
			else if(vehicle.calculateFuelEfficiency(distance, fuelPrice)==lowEfficiency){
				
				lowEfficiencyVehicles.add(vehicle);
				
			}
		}
		return lowEfficiencyVehicles;
		
	}
	public double getAverageFuelEfficiencyOfSUVs(double distance,
			double fuelPrice) {
		double fuelEfficiencySUV = 0;
		double count = 0;
		for (Vehicle vehicle : vehicles) {
			if (isVehicleType(vehicle, SUV.class)) {
				count++;
				fuelEfficiencySUV += vehicle.calculateFuelEfficiency(distance, fuelPrice);
			}
		}
		if (count==0) {
			return -1;
		}
		
		fuelEfficiencySUV = fuelEfficiencySUV/count;
		return fuelEfficiencySUV;
	}
	
}
