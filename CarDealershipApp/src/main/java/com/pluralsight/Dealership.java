package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    //private static ArrayList<Vehicle> inventory;

    static Scanner input = new Scanner(System.in);

    public Dealership(String name, String address, String phone, ArrayList<Vehicle> inventory) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        ArrayList<Vehicle> inventory = inventory;
    }

    public static ArrayList<Vehicle> getAllVehicles() {
        ArrayList<Dealership> dealerships = new ArrayList<Dealership>();
        try {
            FileReader fr = new FileReader("inventory.csv");
            BufferedReader br = new BufferedReader(fr);
            String line;//to store our lines
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");
                Vehicle vehicle = new Vehicle(Integer.parseInt(data[0]),
                        Integer.parseInt(data[1]),data[2],(data[3]),(data[4]),
                        (data[5]), Integer.parseInt(data[6]), Double.parseDouble(data[7]));
                inventory.add(vehicle);//then we add the product to the arraylist
                //  br.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
     return inventory;
    }

    public void getVehiclesByPrice(ArrayList<Vehicle> inventory) {

    }

    public void getVehiclesByMakeModel(ArrayList<Vehicle> inventory) {

    }

    public void getVehiclesByYear(ArrayList<Vehicle> inventory) {

    }

    public void getVehiclesByColor(ArrayList<Vehicle> inventory) {

    }

    public void getVehiclesByMileage(ArrayList<Vehicle> inventory) {

    }

    public void getVehicleByType(ArrayList<Vehicle> inventory) {
        return;
    }

    private static void addVehicle(ArrayList<Vehicle> vehicles) {
        System.out.println("What is the vehicle vin number? ");
        int vin = input.nextInt();
        input.nextLine();
        System.out.println("Enter vehicle year: ");
        int vehicleYear = input.nextInt();
        System.out.println("Enter vehicle make: ");
        String make = input.nextLine();
        System.out.println("Enter vehicle model: ");
        String model = input.nextLine();
        System.out.println("Enter the vehicle type: ");
        String vehicleType = input.nextLine();
        System.out.println("What is the color?");
        String color = input.nextLine();
        System.out.println("Enter the odometer value: ");
        int odometerVal = input.nextInt();
        System.out.println("What is the price of the flower?");
        double vehiclePrice = input.nextDouble();
        Vehicle vehicle = new Vehicle(vin, vehicleYear, make, model,
                vehicleType,color,odometerVal, vehiclePrice);
        vehicles.add(vehicle);
    }






}
