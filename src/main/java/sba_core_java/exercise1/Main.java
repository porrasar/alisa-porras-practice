package sba_core_java.exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{//class beg

    public static void main(String[] args)
    {//main beg

        //-----------------------CREATING OBJECT INSTANCES -------------------

        String[] myStringArrayTestValue
            = {"life","is","worth","living","with","passion"};

        MyOperation myOperation = new MyOperation();
        MyOwnException myOwnException = new MyOwnException();

        //-----------------------BUSINESS LOGIC -------------------
        myOperation.convertStringArrayIntoArrayList(myStringArrayTestValue);

        myOperation.replaceAnElementInTheStringArrayListGiven(1);

        ArrayList<String> aNewArrayListFromExistingArray =
                    myOperation.createANewArrayListFromExistingArray();
        System.out.println("NEW ARRAY: " + aNewArrayListFromExistingArray);

        allowUserInput(myOwnException);

        printMyArrayListInfo(myOperation);

    }//main end

    private static void allowUserInput(MyOwnException e )
    {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Please enter an integer number:");

        if (!scannerInput.hasNextInt())
        {
            try
            {
                throw new MyOwnException("Invalid integer");
            }
            catch (MyOwnException m)
            {
                System.out.println(m.getMessage());
            }

        }
        else
        {
            int integerNumber = scannerInput.nextInt();
            System.out.println("Valid Integer number: " + integerNumber);
        }

    }

    private static void printMyArrayListInfo(MyOperation myOperation )
    {
        //how to print an arraylist list out and not the java jargon
        ArrayList<String> myArrayList = myOperation.getMyArrayList();
        System.out.println(myArrayList);
        System.out.println(myOperation.getMyArrayList());
    }

}//class end
