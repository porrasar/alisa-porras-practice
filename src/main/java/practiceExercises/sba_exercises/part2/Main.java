package practiceExercises.sba_exercises.part2;

import practiceExercises.practice4_14_23.Item;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{//class beg

    public static void main(String[] args)
    {//main beg


        //---------------------------CREATE LIST ARRAY AND ENTERED INPUT-----------------------------------
        List<Item> itemCollection = new ArrayList<>();

        //using to constructors to input data. Key: name, value: other fields
        Item pizza = new Item("pizza", "very cheesy", 12.30, 3);
        //itemCollection.put("pizza", pizza);
        itemCollection.add(pizza);

        Item salad = new Item("salad", "cobb salad", 15.50, 12);
        //itemCollection.put("salad", salad);
        itemCollection.add(salad);

        Item hunger_burger = new Item("hunger burger", "huge patty", 9.49, 10);
        //itemCollection.put("hunger burger", hunger_burger);
        itemCollection.add(hunger_burger);

        Item fried_chicken = new Item("fried chicken", "so crispy", 18.99, 5);
        //itemCollection.put("fried chicken", fried_chicken);
        itemCollection.add(fried_chicken);



        try
        {
            readSampleFile();


        }
        catch (FileNotFoundException e)
        {
            System.out.println("");
            System.out.println("I know, FileNotFoundException, I'm taking care of it");

        }
        finally
        {
            System.out.println("FINALLY: this is the last thing executed");
            System.out.println("");
        }

        //Print the item collection data
        printItemCollection(itemCollection);



    }//main end

    //----------------------------------GENERAL METHODS ------------------------------------------
    private static void readSampleFile() throws FileNotFoundException
    {
        File sampleFile = new File("sample2.txt"); //accessing sample file i created
        Scanner scanner = new Scanner(sampleFile);  //reading the sample file
    }

    private static void printItemCollection(List<Item> itemCollection)
    {
        int size = itemCollection.size();

        for (int i = 0; i < itemCollection.size(); i++)
        {
            System.out.println("ITEM NAME: " + itemCollection.get(i).getName()
                    + ", "
                    + "ITEM DESCRIPTION: "
                    + itemCollection.get(i).getDescription()
                    + ", "
                    + "ITEM PRICE: "
                    + itemCollection.get(i).getPrice()
                    + ", "
                    + "ITEM AVAILABLE QUANITY: "
                    + itemCollection.get(i).getAvailableQuantity());
        }
    }

}//class end
