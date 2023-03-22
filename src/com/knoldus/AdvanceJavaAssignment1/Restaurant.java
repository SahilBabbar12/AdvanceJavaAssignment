package com.knoldus.AdvanceJavaAssignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Restaurant {

    // findDish method that takes id from user and matches the Dishid;
    public static  void findDish(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the id");
        int id=input.nextInt();
        Menu.matchId(id);
    }
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int number=0;


        while(true){

            System.out.println("\nPress 1 to display Dishes");
            System.out.println("Press 2 to search Dish.");
            try{
                number=input.nextInt();
            }
            catch (InputMismatchException error){
                System.out.println("Invalid number");
                break;
            }

            switch(number){

                case 1:Menu.displayDishes();
                    break;
                case 2:findDish();
                    break;
                default:
                    System.out.println("Invalid input");
            }


        }


    }
}

