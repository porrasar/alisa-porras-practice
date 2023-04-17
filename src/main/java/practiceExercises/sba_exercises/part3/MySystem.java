package practiceExercises.sba_exercises.part3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MySystem
{//class beg

    //--------------------------------DEFINE VARIABLES -------------------------------------------------
    Map<String, Item> myItemsInHashMap;

    //Item item = new Item(); // creating item object


    //--------------------------------CONSTRUCTOR-------------------------------------------------------
    public MySystem() throws FileNotFoundException
    {
        Map<String, Item> myItemsInHashMap = new HashMap<>();  //initializing field with hashmap object

        readSampleFile();
    }


    //----------------------------------BUSINESS LOGIC---------------------------------------------------
    Item pizza = new Item("toss salad", "italian", 12.30, 3);


    //using to constructors to input data. Key: name, value: other fields
    String holdItemName = pizza.getItemName();
    String holdDescription = pizza.getItemDescription();
    double holdPrice = pizza.getPrice();
    int holdQuantity = pizza.getQuantity();
    int holdAvailableQuantity = pizza.getAvailableQuantity();


    //----------------------------------GENERAL METHODS---------------------------------------------------
     private static void readSampleFile() throws FileNotFoundException
    {

        Scanner scanner = new Scanner(new File("sample.txt"));  //accessing and reading the sample file

        int countSampleTxtLines = 0;

        while (scanner.hasNext())
        {

            String holdList = scanner.nextLine();

            String[] holdListArray = holdList.split("  ");
            //System.out.println(holdListArray[0]);
            moveTextDataToItemObject(holdListArray);
            countSampleTxtLines++;

        }
        scanner.close();
    }

    private static void moveTextDataToItemObject(String[] holdListArray)
    {

    }

    //----------------------------------GETTER/SETTER ------------------------------------------
    public Map<String, Item> getMyItemsInHashMap() {

        return myItemsInHashMap;
    }

    public void setMyItemsInHashMap(Map<String, Item> myItemsInHashMap) {
        this.myItemsInHashMap = myItemsInHashMap;
    }


}//class end
