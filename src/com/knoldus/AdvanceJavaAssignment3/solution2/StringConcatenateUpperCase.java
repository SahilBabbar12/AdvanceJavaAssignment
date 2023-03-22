package com.knoldus.AdvanceJavaAssignment3.solution2;

import java.util.Scanner;
import java.util.stream.Stream;

// a functional interface with a single method that takes a List<String> as input and returns a String
interface StringConcatenation{
    String concatenateStrings(String str1, String str2, String str3, String str4, String str5, String str6, String str7);
}

public class StringConcatenateUpperCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seven strings: ");

        String string1 = input.nextLine();
        String string2 = input.nextLine();
        String string3 = input.nextLine();
        String string4 = input.nextLine();
        String string5 = input.nextLine();
        String string6 = input.nextLine();
        String string7 = input.nextLine();

        /*Creating a lambda expression that takes a seven strings ,
        converts all the strings to uppercase, and concatenates them into a single string*/
        StringConcatenation stringConcatenation =
                (stringOne, stringTwo, stringThree, stringFour, stringFive, stringSix, stringSeven) -> {
                    String result = Stream.of(stringOne, stringTwo, stringThree, stringFour, stringFive, stringSix, stringSeven).map(String ::toUpperCase).reduce("", String::concat);
                    return result;
                };

        String resultString = stringConcatenation.concatenateStrings(string1,string2,string3,string4,string5,string6,string7);
        System.out.println(resultString);
    }
}
