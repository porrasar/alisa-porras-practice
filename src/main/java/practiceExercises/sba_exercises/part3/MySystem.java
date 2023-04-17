package practiceExercises.sba_exercises.part3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

//public class MySystem
//{
//
//    public MySystem() {
//    }
//
//    public static void main(String[] args)
//
////    {//main beg
//
//        //--------------------------------DEFINE VARIABLES -------------------------------------------------
//        Map<String, Item> myItemsInHashMap;
//
//        String itemName;
//        Item itemType;
//
//
//        //---------------------------------CONSTRUCTOR------------------------------------------------------
//
//
//    public MySystem(Map<String, Item> myItemsInHashMap) {
//
//    }
//
//    {//constructor beg
//            this.myItemsInHashMap = new HashMap<>();
//
//            try
//            {
//                FileInputStream sample = new FileInputStream("sample.txt");
//                BufferedReader br = new BufferedReader(new InputStreamReader(sample));
//
//                String strLine;
//
//                try
//                {
//                    //Read File Line By Line
//                    while ((strLine = br.readLine()) != null)
//                    {
//                        // Print the content on the console - do what you want to do
//                        System.out.println(strLine);
//
//                        //Close the input stream
//                        sample.close();
//                    }
//                }
//                catch (IOException e)
//                {
//                    System.out.println("i know,  ");
//                }
//
//
//            }
//            catch (FileNotFoundException e)
//            {
//                System.out.println("i know,  ");
//            }
//
//        }//constructor end
//
//
//        //----------------------------------GETTER/SETTER ------------------------------------------
//        public Map<String, Item> getMyItemsInHashMap() {
//        return myItemsInHashMap;
//
//    }
//
//        public void setMyItemsInHashMap(Map<String, Item> myItemsInHashMap) {
//        this.myItemsInHashMap = myItemsInHashMap;
//    }
//
//
// //   }//main end
//
//
//}//class end
