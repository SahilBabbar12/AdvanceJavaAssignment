package com.knoldus.AdvanceJavaAssignment1;

import java.time.LocalTime;
import java.util.ArrayList;

public class Menu {
    static ArrayList<Dish> menulist;

    // static block that adds new Dish in menulist.
    static {
        menulist = new ArrayList<>();

        menulist.add(new Dish(101,"Rasmalai", LocalTime.now()));
        menulist.add(new Dish(102,"Chole Bathure", LocalTime.now()));
        menulist.add(new Dish(103,"Rajma Chawal", LocalTime.now()));
    }

    // method that display the dishes from menulist
    public static void displayDishes(){
        for(Dish dish:menulist){
            System.out.println(dish);
        }

    }

    // matchId method that takes an id and matches with all id mentioned in the menulist.
    public static void matchId(int id){

        Dish searchDishID=new Dish(id); //create an object searchDishID and initializes the id
        boolean isFound=false;
        for(Dish dish:menulist){
            if(dish.equals(searchDishID)){
                System.out.println(dish.toString());
                isFound=true;
                break;
            }
        }
        if(isFound==false){
            System.out.println("Dish not found !!");
        }

    }


}
