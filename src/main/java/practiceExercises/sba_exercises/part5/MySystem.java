package practiceExercises.sba_exercises.part5;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MySystem
{//class beg

    //--------------------------------DEFINE VARIABLES -------------------------------------------------
    private HashMap<String, Item> myItemsInHashMap;

    //--------------------------------CONSTRUCTOR-------------------------------------------------------
    public MySystem() throws FileNotFoundException
    {
        this.myItemsInHashMap = new HashMap<>();  //initializing field with hashmap object

        readSampleFile();
     }

    //----------------------------------BUSINESS LOGIC/GENERAL METHODS---------------------------------------------------

    public Item reduceAvailableQuantity(Item item)
    {
        if (myItemsInHashMap.containsKey(item.getItemName()))
        {

            int holdItemAvailableQuantity = item.getAvailableQuantity();
            System.out.println("Available Quantity BEFORE decrease by 1, for the " + item.getItemName()
                    + " item:" + holdItemAvailableQuantity);
            holdItemAvailableQuantity -= 1;
            System.out.println("Available Quantity AFTER decrease by 1, for the " + item.getItemName()
                    + " item:" + holdItemAvailableQuantity);
            if (holdItemAvailableQuantity == 0)
            {
                removeItem(item);
                System.out.println("Removed item: " + item.getItemName());
                System.out.println("Size AFTER removal of item " + item.getItemName()
                        + ":  " + myItemsInHashMap.size());
                System.out.println(" ");
            }
            System.out.println("Decrease Available Quantity by 1, for the " + item.getItemName()
                    + " item");
            System.out.println(" ");


        }
        else
        {
            System.out.println(item.getItemName() + " not present, cannot decease avail quantity");
            item = null;
            System.out.println(" ");
        }

        return item;
    }


    public Item removeItem(Item item)
    {
        if (myItemsInHashMap.containsKey(item.getItemName()))
        {
           myItemsInHashMap.remove(item.getItemName());
           System.out.println("Removed item: " + item.getItemName());
            System.out.println("Size AFTER removal of item " + item.getItemName()
                     + ":  " + myItemsInHashMap.size());
            System.out.println(" ");
        }
        else
        {
            System.out.println(item.getItemName() + " item requested for removal, is not present");
            item  = null;
            System.out.println(" ");
        }

        return item;
    }
    public Item addItem(Item item)
    {
        if (myItemsInHashMap.containsKey(item.getItemName()))
        {
            System.out.println(item.getItemName() + " is already present. Cannot be added.");
            item = null;
            System.out.println("Size AFTER NOT adding an existing item: " + myItemsInHashMap.size());
            System.out.println(" ");
        }
        else
        {
            System.out.println("Size BEFORE adding a new item, " + item.getItemName()
                    + ":  " + myItemsInHashMap.size());
            myItemsInHashMap.put(item.getItemName(), item);  //adding new object (key and items) to hashmap
            System.out.println("Size AFTER adding a new item, "  + item.getItemName()
                    + ":  " + myItemsInHashMap.size());
            System.out.println(" ");

        }

        return item;
    }

     private void readSampleFile() throws FileNotFoundException
    {
        Scanner scanner = new Scanner(new File("sample.txt"));  //accessing and reading the sample file

        while (scanner.hasNext())
        {
            String[] sampleTextArray = scanner.nextLine().split("  ");  //copying split version of txt file to array

            Item item = new Item(sampleTextArray[0],sampleTextArray[1],                        // creating item object
                             Double.valueOf(sampleTextArray[2]),Integer.valueOf(sampleTextArray[3]));

            myItemsInHashMap.put(sampleTextArray[0],item);  //copying item object (key and items) to hashmap
         }
        scanner.close();
    }

    //----------------------------------GETTER/SETTER ------------------------------------------
    public Map<String, Item> getMyItemsInHashMap()
    {
        return myItemsInHashMap;
    }

}//class end
