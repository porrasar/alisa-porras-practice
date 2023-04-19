package practiceExercises.sba_exercises.part3;


import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;

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

    //----------------------------------BUSINESS LOGIC---------------------------------------------------



    //----------------------------------GENERAL METHODS---------------------------------------------------
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
