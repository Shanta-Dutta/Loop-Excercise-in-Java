package com.tts;
import java.util.HashMap;
import java.util.Scanner;
 import java.util.*;


//You are a car dealer. Create a hash map of vehicles.
//        The model is the Key, the make is the Value.
//        Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
//        (e.g. "Oh, you're looking for a Civic? Our 2020 selection is right over here...")



public class LoopMapCar {

    public static void main(String[] args) {

        HashMap<String, Integer> vehicleMap = new HashMap<>();
        vehicleMap.put("HIGHLANDER",2020);
        vehicleMap.put("CHEVROLET",2021);
        vehicleMap.put("RANGEROVER",2020);
        vehicleMap.put("Accord", 2020);
        vehicleMap.put("CIVIC", 2020);
        vehicleMap.put("CRV", 2020);
        vehicleMap.put("PILOT", 2020);
        vehicleMap.put("HRV", 2020);
        vehicleMap.put("PASSPORT", 2020);
        vehicleMap.put("INSIGHT", 2020);
        vehicleMap.put("CLARITY", 2020);
        vehicleMap.put("FIT", 2020);
        vehicleMap.put("ODYSSEY", 2020);
        vehicleMap.put("RIDGELINE", 2020);
        vehicleMap.put("CAMRY", 2021);
        vehicleMap.put("COROLA", 2021);
        vehicleMap.put("RAV4", 2021);
          System.out.println(vehicleMap);



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String customName = scanner.next();
        System.out.println("Hello " + customName + ","+ " what model are you looking for today? " );
        String model = scanner.next();
        model= model.toUpperCase();

        if ((vehicleMap.containsKey(model))== true)
        {
            System.out.println(" available : " +  model);
        }
    else{
//            System.out.println("Oh, you're looking for "+ model + "?" + " Look at our selection right over here...\n "
//              + vehicleMap);
            System.out.println("Oh, you're looking for "+ model + "?" + " Look at our selection right over here...\n");
            for (String i : vehicleMap.keySet()) {
                System.out.println( "Model: " + i + "\tYear: " + vehicleMap.get(i));
            }

        }
    }

    }




