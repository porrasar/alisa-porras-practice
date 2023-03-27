package arrayPractice;

public class Main1
{
    public static void main(String[] args) {
        int [] myIntArray = {1, 2, 3};
        System.out.println();

        //use reg forloop
        for (int i = 0; i < myIntArray.length; i++)
        {
            System.out.println(i);
        }

        //use enhanceforloop
        for (int myInt : myIntArray)
        {
            System.out.println(myInt);
        }

    }
}
