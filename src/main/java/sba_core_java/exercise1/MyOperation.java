package sba_core_java.exercise1;

import java.util.ArrayList;

public class MyOperation implements IMyOperations
{//class beg
    //------------------------------------------VARIABLES---------------------------------------------------
    private ArrayList<String> myArrayList;

    //------------------------------------------CONSTRUCTOR--------------------------------------------------
    public MyOperation() {

        this.myArrayList = new ArrayList<>();
    }

    //-----------------------------------------METHODS ---------------------------------------------------
    @Override
    public void convertStringArrayIntoArrayList(String[] stringArray)
    {
        //int countForAddingToArrayList = 0;
        for (String myForLoopString : stringArray) {
            if (myForLoopString != null)
                // myArrayList.add(stringArray[countForAddingToArrayList]);
                myArrayList.add(myForLoopString);
            //    countForAddingToArrayList++;
        }

    }
    @Override
    public void replaceAnElementInTheStringArrayListGiven(int index)
    {
        myArrayList.set(index, "Nah");
    }
    @Override
    public ArrayList<String> createANewArrayListFromExistingArray()
    {
        ArrayList<String> newList = new ArrayList<>();
        for (String string : myArrayList)
        {
            if (!string.equals("Nah"))
            {
                newList.add(string);
            }
        }
        return newList;
    }

    //---------------------------------GETTER/SETTER METHODS-----------------------------------------------
    public ArrayList<String> getMyArrayList()
    {
        return myArrayList;
    }
}//class end
