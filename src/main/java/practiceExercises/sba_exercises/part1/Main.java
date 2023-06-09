package practiceExercises.sba_exercises.part1;

import jdk.jfr.Description;
import practiceExercises.practice4_14_23.Item;

import javax.imageio.stream.FileImageInputStream;
import java.io.*;
import java.util.*;

public class Main
{//class beg

    public static void main(String[] args) throws FileNotFoundException
    {//main beg
    //---------------------------------BUSINESS LOGIC ----------------------------------
        readSampleFile();

    }//main end

    //----------------------------------GENERAL METHODS ------------------------------------------
    private static void readSampleFile() throws FileNotFoundException
    {
        Scanner scanner = new Scanner(new File("sample.txt"));  //accessing and reading the sample file

        System.out.println("-------------Testing reading sample.txt ------------");
        System.out.printf("%-20s%-20s%-10s%-10s%n","Name","Description","Price","Available Quantity");

        while (scanner.hasNext())
        {
           String holdList = scanner.nextLine();
           String[] holdListArray = holdList.split("  ");
           printItemCollection(holdListArray);
        }
        scanner.close();
    }

    private static void printItemCollection(String[] holdListArray)
    {
        System.out.printf("%-20s%-20s%-10s%-10s%n",
                holdListArray[0], holdListArray[1], holdListArray[2], holdListArray[3]);
    }


}//class end


