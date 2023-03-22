package com.knoldus.AdvanceJavaAssignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

interface EvenNumber{
    int getnextEven(long number);
}
public class NextEvenNumber {
    public static void main(String[] args) {

        Long input_number=0L;
        try{
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the number: ");
            input_number= input.nextLong();
        }
        catch(InputMismatchException error){
            System.out.println("Please enter a valid number");
        }

        // lambda function that takes a number and return next positive even number
        EvenNumber nextNumber=((number)->{
            if(number % 2 == 0)
                return (int)number+2;
            else
                return (int)number+1;
        });

        System.out.println("Next Even Number: "+ nextNumber.getnextEven(input_number));
    }
}
