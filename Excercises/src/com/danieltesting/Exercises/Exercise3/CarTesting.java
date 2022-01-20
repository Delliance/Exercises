package com.danieltesting.Exercises.Exercise3;

import com.danieltesting.Exercises.Main;

import java.util.Scanner;

public class CarTesting extends Main {

    public static void testCar(){

        CarFactory carFactory = new CarFactory();

        Car newCar = null;

        Scanner userInput = new Scanner(System.in);

        System.out.println("What car do you want to test:" +
                "\n Standard (S)" +
                "\n Cabriolet (C)" +
                "\n Camper 4x4 (Q)" +
                "\n Bus (B)");

        if (userInput.hasNextLine()){

            String carType = userInput.nextLine();

            newCar = carFactory.makeCar(carType.toUpperCase());

        }

        if (newCar != null){

            carTestingGame(newCar);

        }

        else {
            System.out.println("We don't have that car for testing, try again");
        }

    }

    public static void carTestingGame(Car aNewCar){

        aNewCar.carReady();
        aNewCar.carHorn();
        aNewCar.carAcceleration();
        aNewCar.carStop();
        aNewCar.carMaxSpeed();
        aNewCar.carConvertible();
        aNewCar.carDoubleTraction();

        String wannaPlay = null;
        Scanner newScanner = new Scanner(System.in);

        System.out.println("\nDo you want to test the car? (Y/N)");
        wannaPlay = newScanner.nextLine();


        Boolean exitLoop1 = false;
        Boolean exitLoop2 = false;

        while (true){

            if (exitLoop1){
                break;
            }

            if(wannaPlay.toUpperCase().equals("N")){

                break;

            }
            else if (!(wannaPlay.toUpperCase().equals("N")) && !(wannaPlay.toUpperCase().equals("Y"))){

                System.out.println("Not a valid value, please write Y or N");
                wannaPlay = newScanner.nextLine();

            }
            else {

                Scanner testScanner = new Scanner(System.in);

                System.out.println("\nSadly the road is under construction, so for" +
                                   "\nnow you can only test the car's features, in" +
                                   "\nthe future you may be able to test the car on" +
                                   "\nthe road.\n");

                System.out.println("These are the features you can test if available:" +
                                   "\n Horn (H)" +
                                   "\n Convertible roof (C)" +
                                   "\n 4x4 traction (T)" +
                                   "\n to finish testing type anything else");

                String testFeature = null;

                String convertible = "The roof is placed";
                String traction = "4x4 is inactive";

                while (true) {

                    if (exitLoop2){
                        break;
                    }

                    testFeature = testScanner.nextLine();

                    switch (testFeature.toUpperCase()) {

                        case "H":
                            System.out.println(aNewCar.getHorn());
                            break;

                        case "C":

                            if (aNewCar.getConvertible()){
                                convertible = (convertible.equals("The roof is placed")) ? "The roof is removed" : "The roof is placed";
                                System.out.println(convertible);
                            }
                            else {
                                System.out.println("Your car does not have this feature");
                            }
                            break;

                        case "T":

                            if (aNewCar.getDoubleTraction()){
                                traction = (traction.equals("4x4 is inactive")) ? "4x4 is inactive" : "4x4 is inactive";
                                System.out.println(traction);
                            }
                            else {
                                System.out.println("Your car does not have this feature");
                            }
                            break;

                        default:
                            exitLoop1 = true;
                            exitLoop2 = true;


                    }

                }

            }

        }

    }

}
