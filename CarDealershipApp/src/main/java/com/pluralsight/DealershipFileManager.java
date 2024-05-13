package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class DealershipFileManager {

    public static ArrayList<Dealership> dealerships = new ArrayList<Dealership>();

    public void getDealership() {
        try {
            FileReader fr = new FileReader("inventory.csv");
            BufferedReader br = new BufferedReader(fr);
            String line;//to store our lines
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");
                Dealership dealership = new Dealership(data[0],
                        data[1], data[2]);
                dealerships.add(dealership);//then we add the product to the arraylist
                //  br.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}