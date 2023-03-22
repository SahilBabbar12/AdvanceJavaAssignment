package com.knoldus.AdvanceJavaAssignment1;

import java.time.LocalTime;

// class  Dish that describes the dishID,dishName, creationTime
public class Dish {
    Integer dishID;
    String  dishName;

    LocalTime creationTime;

    public Dish(Integer dishID){
        this.dishID=dishID;
    }
    public Dish(Integer dishID, String dishName, LocalTime creationTime) {
        this.dishID = dishID;
        this.dishName = dishName;
        this.creationTime = creationTime;
    }

    // overriding equals method to compare the dishid with inputid
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Dish)) {
            return false;
        }
        Dish otherDish = (Dish) obj;
        return this.dishID.equals(otherDish.dishID);
    }

    // overriding "toString" method that returns Dish details..
    @Override
    public String toString() {

        return "dishID=" + dishID + ", dishName='" + dishName + '\'' + ", creationTime=" + creationTime;
    }
}
