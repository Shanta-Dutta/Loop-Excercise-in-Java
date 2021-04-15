package com.tts;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopMap {

//    Asks the user for 5 numbers
//    Stores them in an array list
//    Finds the sum, product, largest, and smallest of those numbers

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        ArrayList<Integer> list = new ArrayList<>();
//////Adding to list
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
            System.out.println( list);

        }
////////// Calculating Sum - adding numbers

        int sumValue = 0;
        for (int i = 0; i < list.size(); i++) {
            sumValue = sumValue + list.get(i);

        }
        System.out.println( "Your total value : " + sumValue);

///// Calculating Product - multiplying
        int productValue = 1;
        for (int i = 0; i < list.size(); i++) {
            productValue = productValue * list.get(i);

        }
        System.out.println("Your total product Value :" + productValue);
///// Calculating Max Value

        int Max = 0;
        int i = 0;

        for (int j = i + 1; j < list.size(); j++) {
            if (Max < list.get(j)) {
                Max = list.get(j);

            }


        }
        System.out.println( "Here is your max value as per your input : " +Max);

///// Calculating Min value
        int Min = 0;
        i = 0;
        int k = 0;
        Min = list.get(0);

        for (k = i + 1; k < list.size(); k++) {

            if (Min > list.get(k)) {
                Min = list.get(k);

            }


        }
        System.out.println("Here is your min value as per your input : " + Min);


    }
}












