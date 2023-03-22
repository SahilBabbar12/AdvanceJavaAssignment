package com.knoldus.AdvanceJavaAssignment4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;


interface StringInterface{
    ArrayList<String> getDistinctString(ArrayList<String> stringlist);
}
public class DistinctStrings {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input_string =input.nextLine();
        String []stringArray= input_string.split(" ");

        ArrayList<String> listOfStrings=new ArrayList<>();

        for(String index: stringArray){
            listOfStrings.add(index);
        }

        /*Creating a lambda expression that takes a List<String> as input,
          returns the distinct elements in sorted order*/

        StringInterface distinctString=(listOfString)->
                (ArrayList<String>) listOfString.stream().distinct().sorted().collect(Collectors.toList());


        ArrayList<String>finalString=distinctString.getDistinctString(listOfStrings);

        System.out.println("New String: ");
        for (String index: finalString){
            System.out.print(index+" ");
        }
    }
}
