package arrayPractice;

public class Main2
{
//    Write a program that returns the middle element in an array. Give the following
//    values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7

    public static void main(String[] args)
    {
       int [] middleNumberArray = {13, 5, 7, 68, 2};

       int holdMiddleNumber = middleNumberArray.length / 2;

        System.out.println("middle number in array: " + middleNumberArray[holdMiddleNumber]);
    }


}
