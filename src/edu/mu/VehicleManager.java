package src.edu.mu;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;
public class VehicleManager {
	protected final static String vehicleFilePath = "files/inventory.csv";
	private static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	private static ArrayList<String[]> vStringList = new ArrayList<String[]>();
	public static boolean readFromFile() {
		try {
			Scanner fileIn = new Scanner(new FileInputStream(vehicleFilePath));
			
			fileIn.nextLine();
			
			while(fileIn.hasNextLine()) {
				String[] line = fileIn.nextLine().split(",");
				vStringList.add(line);
				
				
				
			}
			for(String[] _line : vStringList) {
				if(_line[0].equals("Truck")) {
					Truck tItem = new Truck(/*_line[0],*/ _line[1], Long.parseLong(_line[2]), Double.parseDouble(_line[3]), VehicleColor.valueOf(_line[4]), FuelType.valueOf(_line[5]),
							Double.parseDouble(_line[6]), Double.parseDouble(_line[7]), Integer.parseInt(_line[8]), Double.parseDouble(_line[9]), StartMechanism.valueOf(_line[10]));
					vehicles.add(tItem);
					
				}
				else if(_line[0].equals("Car")) {
					Car cItem = new Car(/*_line[0],*/ _line[1], Long.parseLong(_line[2]), Double.parseDouble(_line[3]), VehicleColor.valueOf(_line[4]), FuelType.valueOf(_line[5]),
							Double.parseDouble(_line[6]), Double.parseDouble(_line[7]), Integer.parseInt(_line[8]), Double.parseDouble(_line[9]), StartMechanism.valueOf(_line[10]));
					vehicles.add(cItem);
				}
				else if(_line[0].equals("SUV")) {
					SUV sItem = new SUV(/*_line[0],*/ _line[1], Long.parseLong(_line[2]), Double.parseDouble(_line[3]), VehicleColor.valueOf(_line[4]), FuelType.valueOf(_line[5]),
							Double.parseDouble(_line[6]), Double.parseDouble(_line[7]), Integer.parseInt(_line[8]), Double.parseDouble(_line[9]), StartMechanism.valueOf(_line[10]));
					vehicles.add(sItem);
				}
				else if(_line[0].equals("MotorBike")) {
					MotorBike mItem = new MotorBike(/*_line[0],*/ _line[1], Long.parseLong(_line[2]), Double.parseDouble(_line[3]), VehicleColor.valueOf(_line[4]), FuelType.valueOf(_line[5]),
							Double.parseDouble(_line[6]), Double.parseDouble(_line[7]), Integer.parseInt(_line[8]), Double.parseDouble(_line[9]), StartMechanism.valueOf(_line[10]));
					vehicles.add(mItem);
				}
			}
			
		fileIn.close();		
		return true;
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			return false;
				
			}
		
		
	}
}
