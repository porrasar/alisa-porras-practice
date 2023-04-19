package practiceExercises.sba_exercises.part5;

import java.io.FileNotFoundException;

public class Main {//class beg

    public static void main(String[] args) throws FileNotFoundException {//main beg

    //---------------------------------CREATE OBJECT INSTANCE ----------------------------------

        MySystem mySystem = new MySystem();   // create object instance of MySystem
        Item item1 = new Item("chips","plain",1.35,7 );
        Item item2 = new Item("pizza","plain",1.35,7 );

    //---------------------------------BUSINESS LOGIC-------------------------------------

        mySystem.addItem(item1);
        mySystem.addItem(item2);
        mySystem.removeItem(item2);
        mySystem.reduceAvailableQuantity(item1);
        printItemCollection(mySystem);

    }//main end


    //---------------------------------GENERAL METHODS ---------------------------------
    private static void printItemCollection(MySystem mySystem)
    {
        Item myItemValue;

        System.out.println("--------Testing reduceAvailableQuanity(..) method------");
        System.out.printf("%-20s%-20s%-10s%-10s%n",
                "Name", "Description", "Price", "Available Quantity");

        for (String myItem : mySystem.getMyItemsInHashMap().keySet())
        {
            myItemValue = mySystem.getMyItemsInHashMap().get(myItem);
            System.out.printf("%-20s%-20s%-10s%-10s%n",
                    myItemValue.getItemName(),myItemValue.getItemDescription(),
                    myItemValue.getPrice(),myItemValue.getAvailableQuantity());
        }
    }

}//class end




