package sba_core_java.exercise1;

import sba_core_java.IMyOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOperation implements IMyOperations
{//class beg

    //------------------------------------------VARIABLES---------------------------------------------------
    private ArrayList<String> myArrayList;

    //------------------------------------------CONSTRUCTOR--------------------------------------------------


    public MyOperation()
    {

        this.myArrayList = new ArrayList<>();
    }


    //-----------------------------------------METHODS ---------------------------------------------------

    public void convertStringArrayIntoArrayList(String[] stringArray)
    {
       int countForAddingToArrayList = 0;
       for (String myForLoopString : stringArray)
       {
          if (myForLoopString != null)
              myArrayList.add(stringArray[countForAddingToArrayList]);
           countForAddingToArrayList++;
       }

    }
    public void replaceAnElementInTheStringArrayListGiven(int index)
    {
        myArrayList.set(index,"Nah");
    }
    public ArrayList<String> createANewArrayListFromExistingArray()
    {
//        int countForAddingToArrayList = 0;
//        {
//            myArrayList.remove(index);
////            if (myArrayList(1countForAddingToArrayList) == index)
////            //if (myForLoopString != null)
////                myArrayList.add(stringArray[countForAddingToArrayList]);
//            System.out.println("");
//        }
//

        return null;
    }

    //---------------------------------GETTER/SETTER METHODS-----------------------------------------------


    public ArrayList<String> getMyArrayList()
    {
        return myArrayList;
    }


}//class end
