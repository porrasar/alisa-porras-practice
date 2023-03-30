package arrayPractice;

import java.util.Arrays;
import java.util.Collections;

public class HomeWorkWednesday3_29_23
{//class beg

    public static void main(String[] args)
    {//main beg

        Integer[] ar = {15,118,35,29,174,109,21,92,1,100};

        Arrays.sort(ar,1,8);
        //System.out.println("modified ar[] in asscending order: %s", Arrays.toString(ar));

        for (int arArray : ar)
        {
            System.out.println("source array: " + Arrays.toString(ar));
        }
        //System.out.println();

        System.out.println();
        Arrays.sort(ar,1,8, Collections.reverseOrder());
        //System.out.println("modified ar[] in descending order: %s", Arrays.toString(ar));
        for (int arArray2 : ar)
        {
            System.out.println("source array: " + Arrays.toString(ar));
        }


    }//main end
}//class end
