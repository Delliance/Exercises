package com.danieltesting.Exercises.Exercise3;

public abstract class Car {

    private String name;
    private String horn;
    private int acceleration;
    private int stop;
    private Boolean doubleTraction;
    private Boolean convertible;
    private int maxSpeed;

    //Get & set name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Get & set horn
    public String getHorn() {
        return horn;
    }

    public void setHorn(String horn) {
        this.horn = horn;
    }

    //Get & set acceleration
    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    //Get & set stop
    public int getStop() {
        return stop;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }

    //Get & set doubleTraction
    public Boolean getDoubleTraction() {
        return doubleTraction;
    }

    public void setDoubleTraction(Boolean doubleTraction) {
        this.doubleTraction = doubleTraction;
    }

    //Get & set convertible
    public Boolean getConvertible() {
        return convertible;
    }


    public void setConvertible(Boolean convertible) {
        this.convertible = convertible;
    }

    //Get & set maxSpeed


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    //Car explanation methods

    public void carReady(){

        System.out.println("Your brand new "+getName()+" is here");

    }

    public void carAcceleration(){
        System.out.println("Your new car goes from zero to sixty (MPH) in "+getAcceleration()+" seconds");
    }

    public void carHorn(){
        System.out.println("Your car's horn sounds like "+getHorn()+" ...amazing, right?");
    }

    public void carStop(){
        System.out.println("Your car's brake decreases the speed by 10 km in "+getStop()+" seconds");
    }

    public void carConvertible(){
        if (getConvertible()){
            System.out.println("Your car is a convertible");
        }
    }

    public void carDoubleTraction(){
        if (getDoubleTraction()){
            System.out.println("Your car has 4x4");
        }
    }

    public void carMaxSpeed(){
        System.out.println("Your new car's max speed is "+getMaxSpeed()+" MPH");
    }
}
