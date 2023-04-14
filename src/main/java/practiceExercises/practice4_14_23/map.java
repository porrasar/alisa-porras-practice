package practiceExercises.practice4_14_23;

import java.util.HashMap;
import java.util.Map;

public class map
{
    public static void main(String[] args)

    {
        //creating new hashmap object
        Map<String, Item> itemCollection = new HashMap<>();


        //using to constructors to input data. Key: name, value: other fields
        Item pizza = new Item("pizza", "Cheese pizza", 10.0, 5);
        itemCollection.put("pizza", pizza);

        Item salad = new Item("salad", "Cold Salad", 5.0, 10);
        itemCollection.put("salad", salad);

        int size = itemCollection.size();
        System.out.println(size);

        Item pizza1 =  itemCollection.get(("pizza"));
        System.out.println(pizza1.getName());

        Item salad1 = itemCollection.remove(("salad"));

        int size1 = itemCollection.size();
        System.out.println(size1);

        Item salad2 = itemCollection.get("salad");
        if (salad2 != null)
        {
            System.out.println(salad2.getName());
        }

//        int keySet = itemCollection.keySet();
//        System.out.println(keySet);
//
//        String getTheCollection = itemCollection.values();
//        System.out.println(getTheCollection);

    }//main end

}//class end

