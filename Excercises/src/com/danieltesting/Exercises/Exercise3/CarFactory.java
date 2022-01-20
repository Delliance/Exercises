package com.danieltesting.Exercises.Exercise3;

public class CarFactory {

    public Car makeCar(String newCarType){

        CarFactory newCar =null;

        switch (newCarType){

            case "S": //Standard

                return new CarStandard();


            case "C": // Cabriolet convertible

                return new CarCabriolet();


            case "Q": // Camper 4x4

                return new CarCamper();


            case "B": //Bus

                return new CarBus();


            default:
                return null;

        }

    }

}
