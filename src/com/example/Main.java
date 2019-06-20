package com.example;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(20, 0);
        calcFeetAndInchesToCentimeters(32);
    }

    public static int calcFeetAndInchesToCentimeters(int feet, int inches){
        if(feet < 0 || inches > 12 || inches < 0){
            return -1;
        }
        int in = inches + (feet * 12);
        double centimeters = in * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + (int) centimeters + " centimeters");
        return (int) centimeters;
    }

    public static int calcFeetAndInchesToCentimeters(int inches){
        if(inches < 0){
            return -1;
        }
        int in = inches % 12;
        int ft = (inches - in) / 12;
        int cm = calcFeetAndInchesToCentimeters(ft, in);
        return cm;
    }

}
