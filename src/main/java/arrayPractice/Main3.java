package arrayPractice;

import java.util.Arrays;

//Write a program that creates an array of String type and initializes it with the
//        strings “red”, “green”, “blue” and “yellow”. Print out the array length. Make a
//        copy using the clone( ) method. Use the Arrays.toString( ) method on the new
//        array to verify that the original array was copied.
public class Main3
{
    public static void main(String[] args)
    {

        String[] colorArray = {"red", "green", "blue", "yellow"};
        int lengthOfColorArray  = colorArray.length;
        System.out.println("length of color array: " + lengthOfColorArray);
        System.out.println(" ");


        String[] cloneArray = colorArray.clone();

        //to display content of color array
        System.out.println("color array contents: ");
        for (int i = 0; i < lengthOfColorArray; i++)
        {
            System.out.println(colorArray[i]);
        }


        //to display content of clone array with print out
        System.out.println(" ");
        System.out.println("to display content of clone array with print out ");
        System.out.println(Arrays.toString(cloneArray));


    }
}
