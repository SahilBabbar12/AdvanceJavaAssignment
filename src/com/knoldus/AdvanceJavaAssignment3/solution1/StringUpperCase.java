package com.knoldus.AdvanceJavaAssignment3.solution1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

 // a functional interface with a single method that takes a List<String> as input and returns a String
interface StringConcatenation {
    String getConcatenatedUpperString(List<String>originalList);
}

public class StringUpperCase {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        ArrayList<String> originalList =new ArrayList<>();

        for(int count=1;count<=7;count++){
            System.out.println("Enter the string "+count);
            originalList.add(input.nextLine());
        }

        /*Creating a lambda expression that takes a List<String>,
        converts all the strings to uppercase, and concatenates them into a single string*/

        StringConcatenation concatenateUpperString =(stringlist)->
                originalList.stream().map(String::toUpperCase).collect(Collectors.joining());


       // Calling the lambda expression to get the final concatenated uppercase string
        String finalString =concatenateUpperString.getConcatenatedUpperString(originalList);

        System.out.println(finalString);

    }
}
