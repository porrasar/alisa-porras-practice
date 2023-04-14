package homeworkPackage.homework_Package_Thursday_4_13_23.lab303_7_2_ArrayList;

import java.util.List;

import java.util.ArrayList;


     public class CreateArrayListExample {

        public static void main(String[] args) {
            // Creating an ArrayList of String
            List<String> animals = new ArrayList<>();

            // Adding new elements to the ArrayList
            animals.add("Lion");
            animals.add("Tiger");
            animals.add("Cat");
            animals.add("Dog");

            System.out.println(animals);

            // Adding an element at a particular index in an ArrayList
            animals.add(2, "Elephant");
            System.out.println(animals);
        }
    }



