package com.knoldus.AdvanceJavaAssignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

interface Max{
    int maxOfTwo(int number1,int number2);
}
public class MaximumNumber {
    public static void main(String[] args) {
        int numberOne=0;
        int numberTwo=0;
        try{
            Scanner input =new Scanner(System.in);
            System.out.println("Enter the first number");
            numberOne=input.nextInt();

            System.out.println("Enter the second number");
            numberTwo=input.nextInt();
        }
        catch (InputMismatchException error){
            System.out.println("Please enter a valid number");
        }

        // lambda function that returns the maximum of 2 numbers
        Max getMax=((number1, number2) -> Math.max(number1,number2));

        System.out.println("Maximum of the given two numbers: " +getMax.maxOfTwo(numberOne,numberTwo));
    }
}
