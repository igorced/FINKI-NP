package com.zadaca02;

public class Vraboten {
    private String firstName;
    private String lastName;
    private static double onePoint;
    private double salary;
    private int experience;
    private int numOfPoints;
    private Zadaca[] zadaci = new Zadaca[10];
    private int numOfZadaci;

    Vraboten() {
        this.firstName = "";
        this.lastName = "";
        this.salary = 0;
        this.experience = 0;
        this.numOfPoints = 0;
        this.numOfZadaci = 0;
    }

    public static void setOnePoint() {
        onePoint = 10;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public void setNumOfPoints(int numOfPoints) {
        this.numOfPoints = numOfPoints;
    }



}
