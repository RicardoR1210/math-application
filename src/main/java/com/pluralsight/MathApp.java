package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //1
        int bobSalary = 20_000;
        int garySalary = 25_000;
        int highestSalary = Math.max(bobSalary, garySalary); // compares both salarys
        System.out.println("The highest salary is " + highestSalary);
        //2
        int carPrice = 15000;
        int truckPrice = 25000;
        System.out.println("The lowest price is " + Math.min(truckPrice, carPrice));//compares in print line lowest
        //3
        double radius = 7.25;
        double pi = 3.14159265359;
        double area = pi * radius * radius;// the area is pi*r^2
        System.out.println("The area is " + area);
        //4
        double number1 = 5.0;
        double squareRoot = Math.sqrt(number1); //
        System.out.println("The square root is " + squareRoot);
        //5
        double distance = Math.sqrt(Math.pow(85-5, 2) + Math.pow(50-10, 2));// used the distance formula
        System.out.println("The distance is " + distance);
        //6
        double value = -3.8;
        double absoluteValue= Math.abs(value);
        System.out.println("The absolute value is " + absoluteValue);
        //7
        double randomValue = Math.random();// the random method is from 0 to 1 already
        System.out.println("The random value is " + randomValue);
        //8
        int days = 24;
        int hoursInDay = 24;
        int minutesInHour = 60;

        int totalMinutes = days * hoursInDay * minutesInHour;// calculate total minutes
        System.out.println("The total minutes is " + totalMinutes);// print



    }
}
