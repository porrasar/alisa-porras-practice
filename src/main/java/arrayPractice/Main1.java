package arrayPractice;

public class Main1
{
    public static void main(String[] args) {
        int [] myIntArray = {1, 2, 3};
        System.out.println();

        for (int i = 0; i < myIntArray.length; i++)
        {
            System.out.println(i);
        }

        for (int myInt : myIntArray)
        {
            System.out.println(myInt);
        }

    }
}
