package practiceExercises.practice4_14_23.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main5
{
    public static void main(String[] args)
    {
        //uses generics the '<>' to enter the type.
        // this is the way we should use collection objects, creating 'type safe code'
        List<String> strings = new ArrayList<String>();
        strings.add("Alisa");
//        strings.add(Integer.valueOf(10));


//        //not using generics, not good code, no compile issues, but will cause runtime exception
//        List arrayList = new ArrayList();
//        arrayList.add("Alisa");
//        arrayList.add(Integer.valueOf(10));
//        String x = (String) arrayList.get(1);




    }//main end
}//class end
