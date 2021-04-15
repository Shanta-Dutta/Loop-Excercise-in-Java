package com.tts;
import java.util.HashMap;
import java.util.Scanner;
 import java.util.*;


//You are a car dealer. Create a hash map of vehicles.
//        The model is the Key, the make is the Value.
//        Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
//        (e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")



public class LoopMapCar {

    public static void main(String[] args) {

        HashMap<String, Integer> vehicleMap = new HashMap<>();
        vehicleMap.put("HighLander",2020);
        vehicleMap.put("Chevrolet",2021);
        vehicleMap.put("RangeRover",2020);
        System.out.println(vehicleMap);



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String customName = scanner.next();
        System.out.println("Hello " + customName + ","+ " what model are you looking for today? " );
        String model = scanner.next();

        if ((vehicleMap.containsKey(model))== true)
        {
            System.out.println(" available : " +  model);
        }
    else{
            System.out.println("Oh, you're looking for "+ model + "?" + " Look at our selection right over here...\n "
              + vehicleMap);

            }
    }

    }




