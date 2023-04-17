package practiceExercises.sba_exercises.part3;

import practiceExercises.sba_exercises.part2.Item;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {//class beg

    public static void main(String[] args) throws FileNotFoundException {//main beg

        //---------------------------------CREATE OBJECT INSTANCE ----------------------------------
        //    Item item = new Item();

        MySystem mySystem = new MySystem();

        //------------------------------VARIABLES---------------------------

        //-------------------------------CONSTRUCTOR -----------------------

        //-------------------------------BUSINESS LOGIC --------------------
        readSampleFile();

    }//main end



    //----------------------------------GENERAL METHODS ------------------------------------------
    private static void readSampleFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("sample.txt"));  //accessing and reading the sample file

        System.out.println("--------Testing the constructor of MySystem class------");
        System.out.printf("%-20s%-20s%-10s%-10s%n", "Name", "Description", "Price", "Avalible Quantity");

        while (scanner.hasNext()) {
            String holdList = scanner.nextLine();
            //System.out.println("nextline: " + holdList);
            String[] holdListArray = holdList.split("  ");
            printItemCollection(holdListArray);
        }
        scanner.close();
    }

    private static void printItemCollection(String[] holdListArray) {
        //System.out.println(Arrays.toString(holdListArray));
        System.out.printf("%-20s%-20s%-10s%-10s%n",
                holdListArray[0], holdListArray[1], holdListArray[2], holdListArray[3]);
    }


}//class end

//
//    //---------------------------------CREATE OBJECT INSTANCE ----------------------------------
//    //    Item item = new Item();
//    //using to constructors to input data. Key: name, value: other fields
//    practiceExercises.sba_exercises.part2.Item pizza = new Item("potato salad", "creamy", 12.30, 3);
//
//    //---------------------------------BUSINESS LOGIC ----------------------------------
//
//    String holdItemName = pizza.getItemName();
//    String holdDescription = pizza.getItemDescription();
//    double holdPrice = pizza.getPrice();
//    int holdQuantity = pizza.getQuantity();
//    int holdAvailableQuantity = pizza.getAvailableQuantity();
//
//        System.out.println("-------------Testing the constructor of Item class  ------------");
//                System.out.printf("%-20s%-20s%-10s%-10s%n","Name","Description","Price","Avalible Quantity");
//
//                System.out.printf("%-20s%-20s%-10s%-10s%-10s",
//                holdItemName,holdDescription,holdPrice,holdQuantity,holdAvailableQuantity);


