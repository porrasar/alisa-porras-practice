package sba_core_java.exercise1;

import java.util.ArrayList;

public interface IMyOperations
{//interface beg     interface has all abstract methods, only signature, no body

    //----------------------------------ABSTRACT -METHODS---------------------------------------------------
    void convertStringArrayIntoArrayList(String[] stringArray);
    void replaceAnElementInTheStringArrayListGiven(int index);


    ArrayList<String> createANewArrayListFromExistingArray();




}//interface end
