package arrayPractice;

public class Main1
{
//    Write a program that creates an array of integers with a length of 3. Assign the
//    values 1, 2, and 3 to the indexes. Print out each array element.

    public static void main(String[] args) {
        int [] myIntArray = {1, 2, 3};
        System.out.println();


        // print out long way
        int [] myIntArray2 = {1, 2, 3};
        System.out.println("print out long way");
        System.out.println(myIntArray2[0]);
        System.out.println(myIntArray2[1]);
        System.out.println(myIntArray2[2]);
        System.out.println(" ");


        //-----------------------------------------------------------
        //
        //print out using reg forloop
        System.out.println("print out using reg forloop");
        for (int i = 0; i < myIntArray.length; i++)
        {
            System.out.println(myIntArray2[i]);
        }
           System.out.println(" ");


        //-----------------------------------------------------------
        //print out using enhanceforloop
        System.out.println("print out using enhanceforloop");
        for (int myInt : myIntArray)
        {
            System.out.println(myInt);
        }

    }
}
