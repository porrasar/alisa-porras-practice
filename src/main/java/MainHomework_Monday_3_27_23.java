import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.Scanner;

//Read a line of text such as “I love Java.  You love Java. She loves Java.” or any other text.
//        Split them into words
//        Count number of times each word (excluding dot .) occurs
//        So the end result is something like following:

public class MainHomework_Monday_3_27_23 {//class beg
    String convertNumericToNumberByName;


    public static void main(String[] args)
    {//main beg

        Scanner userInput = new Scanner(System.in);   // creating a scanner for user input

        String lineOfText = "I love Java. You love Java. She loves Java";  //creating a string of text

        //taking all '.' out of text
        String lineOfTextWithoutDot = lineOfText.replace(".", " ");
        //System.out.println("line of text w/o dot: " + lineOfTextWithoutDot);

        //split the text w/o dots by delimiter space and then create an array with all the words
        String[] splitLineOfText = lineOfTextWithoutDot.split("\\s+");
        //System.out.println("line of text w/o spaces: " + Arrays.toString(splitLineOfText));

        //counting the number of words in splitlineoftext array
        int lengthOfText = splitLineOfText.length;
        //System.out.println("number of words: " + lengthOfText);


        //define word counters
        int iHoldCount = 0;
        int loveHoldCount = 0;
        int javaHoldCount = 0;
        int youHoldCount = 0;
        int sheHoldCount = 0;
        int lovesHoldCount = 0;

        //for loop to find out how many times a word occurs
       //  countTheNumberOfWords beg
        for (int i = 0; i < lengthOfText; ++i) {//for beg
            switch (splitLineOfText[i]) {//switch beg
                case "I":

                    //++iHoldCount;  // counting the number of 'i's
                    break;
                case "love":
                    ++loveHoldCount;  // counting the number of 'i's
                    break;
                case "Java":
                    ++javaHoldCount;  // counting the number of 'i's
                    break;
                case "You":
                    ++youHoldCount;  // counting the number of 'i's
                    break;
                case "She":
                    ++sheHoldCount;  // counting the number of 'i's
                    break;
                case "loves":
                    ++lovesHoldCount;  // counting the number of 'i's
                    break;
            }//switch end
        }//for end





        System.out.println("\"I\" occurs " + iHoldCount);
        System.out.println("\"love\" occurs " + loveHoldCount);
        System.out.println("\"Java\" occurs " + javaHoldCount);
        System.out.println("\"You\" occurs " + youHoldCount);
        System.out.println("\"She\" occurs " + sheHoldCount);
        System.out.println("\"loves\" occurs " + lovesHoldCount);


    }//main beg




}//class end
