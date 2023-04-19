package practiceExercises.sba_exercises.part3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {//class beg

    public static void main(String[] args) throws FileNotFoundException {//main beg

    //---------------------------------CREATE OBJECT INSTANCE ----------------------------------

        MySystem mySystem = new MySystem();   // create object instance of MySystem
        Item item = new Item();               // create object instance of Item

    //---------------------------------BUSINESS LOGIC-------------------------------------
        printItemCollection(mySystem);

    }//main end


    //---------------------------------GENERAL METHODS ---------------------------------
    private static void printItemCollection(MySystem mySystem)
    {
        Item myItemValue;

        System.out.println("--------Testing the constructor of MySystem class------");
        System.out.printf("%-20s%-20s%-10s%-10s%n",
                "Name", "Description", "Price", "Avalible Quantity");

        for (String myItem : mySystem.getMyItemsInHashMap().keySet())
        {
            myItemValue = mySystem.getMyItemsInHashMap().get(myItem);
            System.out.printf("%-20s%-20s%-10s%-10s%n",
                    myItemValue.getItemName(),myItemValue.getItemDescription(),
                    myItemValue.getPrice(),myItemValue.getAvailableQuantity());
        }
    }

}//class end




