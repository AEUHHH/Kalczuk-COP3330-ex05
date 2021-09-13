package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cody Kalczuk
 */

public class App {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("What is the first number?");
        String firstNumber=sc.next();
        System.out.println("What is the second number?");
        String secondNumber=sc.next();

        int convertedFirstNumber=Integer.parseInt(firstNumber);
        int convertedSecondNumber=Integer.parseInt(secondNumber);

        //Calculating sum
        int sum=convertedFirstNumber+convertedSecondNumber;

        //Calculating  difference
        int difference=convertedFirstNumber-convertedSecondNumber;

        //Calculating  multiplication
        int multiplication=convertedFirstNumber*convertedSecondNumber;

        //Calculating  quotient
        int quotient=convertedFirstNumber/convertedSecondNumber;


        System.out.println(convertedFirstNumber+" + "+convertedSecondNumber+" = "+sum);
        System.out.println(convertedFirstNumber+" - "+convertedSecondNumber+" = "+difference);
        System.out.println(convertedFirstNumber+" * "+convertedSecondNumber+" = "+multiplication);
        System.out.println(convertedFirstNumber+" / "+convertedSecondNumber+" = "+quotient);
    }
}