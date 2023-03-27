package arrayPractice;


//Write a program that creates an integer array with 5 elements (i.e., numbers).
//        The numbers can be any integers. Print out the value at the first index and the
//        last index using length - 1 as the index. Now try printing the value at index =
//        length ( e.g., myArray[myArray.length ] ). Notice the type of exception which is
//        produced. Now try to assign a value to the array index 5. You should get the
//        same type of exception
public class Main4
{
    public static void main(String[] args)
    {

        int [] numberArray = {1, 2, 3, 4, 5};


        int i = 0;
        int firstIndex = numberArray[i];


        int lastIndex = numberArray.length - 1;


        System.out.println("first index: " + firstIndex);
        System.out.println("last index: " + lastIndex);

        //error reading
        //System.out.println(numberArray[numberArray.length]);  //error: Index 5 out of bounds for length 5

        //error assigning value
        //numberArray[numberArray.length] = 22;  //error: Index 5 out of bounds for length 5
    }
}
