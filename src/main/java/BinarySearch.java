import java.util.Arrays;

public class BinarySearch
{//class beg
    public static void main(String[] args)
    {//main beg

        int targetNumber = 17;   // setting the target number
        int numArray[] = {5,12,54,-7,95,23,65};  //the array holding the numbers

        Arrays.sort(numArray);   // sort the number array

        int startIndex = 0;  // starting from 0 index in the number array
        int endIndex = numArray.length - 1;  //the last index number in the number array - 1

        while (startIndex <= endIndex)
        {
            int middleIndex = (endIndex - startIndex) / 2 + startIndex;

            int middleValue = numArray[middleIndex];

            if (targetNumber == middleValue)
            {
                System.out.println("Found target number: " + targetNumber);
                break;
            }
            else
            if (targetNumber > middleValue)
            {
                startIndex = middleIndex + 1;
                System.out.println("Target number: " + targetNumber + " > middlevalue:" + middleValue);
                break;
            }
            else
            if (targetNumber < middleValue)
            {
                endIndex = middleIndex - 1;
                System.out.println("Target number: " + targetNumber + " < middlevalue:" + middleValue);
            }
            else
            {
                System.out.println("Target number not found in the array");
            }
        }

    }//main end

}//class end
