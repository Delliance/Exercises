package com.danieltesting.Exercises;

import com.danieltesting.Exercises.Exercise1.ColumnChecker;
import com.danieltesting.Exercises.Exercise2.Cache;
import com.danieltesting.Exercises.Exercise2.RunApp;
import com.danieltesting.Exercises.Exercise3.CarTesting;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner newScanner = new Scanner(System.in);
        String option = "";

        System.out.println("Please select your the exercise" +
                "\nColumn checker (C)" +
                "\nCache + Database (D)" +
                "\nCar factory (F)");

        option = newScanner.nextLine();

        switch (option.toUpperCase()){

            case "C":
                ColumnChecker.columnChecker();
                break;

            case "D":
                String searchedID;

                while (true){

                    System.out.println("Please enter the numeric ID you want to search or type Exit to finish");
                    searchedID = newScanner.next();

                    if (searchedID.toUpperCase().equals("EXIT")){
                        break;
                    }

                    try {

                        RunApp.searchUser(Integer.parseInt(searchedID));

                    } catch (Exception e) {

                        System.out.println("The ID is not valid\n");

                    }

                }

                break;

            case "F":

                CarTesting.testCar();

                break;

            default:
                System.out.println("Not a valid option, try again");


        }

    }
}
