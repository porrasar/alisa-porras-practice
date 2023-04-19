package sba_core_java.exercise1;

import java.util.Scanner;

public class Main
{//class beg

    public static void main(String[] args)
    {//main beg

        //-----------------------CREATING OBJECT INSTANCES -------------------

        String[] myStringArrayTestValue
            = {"life","is","worth","living","with","passion"};

        MyOperation myOperation = new MyOperation();

        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Please enter an integer number:");



        if (!scannerInput.hasNextInt())
        {
            try
            {
                throw new MyOwnException("Invalid integer");
            }
            catch (MyOwnException e)
            {
                System.out.println(e.getMessage());
            }

        }
        else
        {
            int integerNumber = scannerInput.nextInt();
            System.out.println("Valid Integer number: " + integerNumber);
        }












        //-----------------------BUSINESS LOGIC -------------------
        myOperation.convertStringArrayIntoArrayList(myStringArrayTestValue);
        myOperation.replaceAnElementInTheStringArrayListGiven(1);
        //myOperation.createANewArrayListFromExistingArray(2);

        printMyArrayListInfo(myOperation);







    }//main end

    private static void printMyArrayListInfo(MyOperation myOperation )
    {
        System.out.println(myOperation.getMyArrayList());
    }

}//class end
