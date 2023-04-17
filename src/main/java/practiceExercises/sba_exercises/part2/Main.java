package practiceExercises.sba_exercises.part2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{//class beg

    public static void main(String[] args) throws FileNotFoundException
    {//main beg

    //---------------------------------CREATE OBJECT INSTANCE ----------------------------------
    //    Item item = new Item();
        //using to constructors to input data. Key: name, value: other fields
        Item pizza = new Item("potato salad", "creamy", 12.30, 3);

        //---------------------------------BUSINESS LOGIC ----------------------------------

        String holdItemName = pizza.getItemName();
        String holdDescription = pizza.getItemDescription();
        double holdPrice = pizza.getPrice();
        int holdQuantity = pizza.getQuantity();
        int holdAvailableQuantity = pizza.getAvailableQuantity();

        System.out.println("-------------Testing the constructor of Item class  ------------");
        System.out.printf("%-20s%-20s%-10s%-10s%n","Name","Description","Price","Avalible Quantity");

        System.out.printf("%-20s%-20s%-10s%-10s%-10s",
                holdItemName,holdDescription,holdPrice,holdQuantity,holdAvailableQuantity);

    }//main end

}//class end
