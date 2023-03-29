import java.util.Scanner;

public class MainHomework_Monday_3_27_23 {//class beg
    String convertNumericToNumberByName;

    public static void main(String[] args)
    {//main beg

        Scanner userInput = new Scanner(System.in);   // creating a scanner for user input

        String lineOfText = "I love Java. You love Java. She loves Java";  //creating a string of text

        String lineOfTextWithoutDot = lineOfText.replace(".", " "); //taking all '.' out of text
        System.out.println("line of text w/o dot: " + lineOfTextWithoutDot);


        //String[] splitLineOfText = lineOfTextWithoutDot.split("\\s+");  //split w/o dots text by delimiter space

        int numberOfWords = 0;

        int iHoldCount = 0;
        int loveHoldCount = 0;
        int javaHoldCount = 0;
        int youHoldCount = 0;
        int sheHoldCount = 0;
        int lovesHoldCount = 0;


        for (int i = 0; i <= 9; i++)
        {//for beg//

            System.out.println(" ");
            String[] splitLineOfText = lineOfTextWithoutDot.split(" ");  //split text by using the space delimiter
            System.out.println("split line text: " + splitLineOfText[i]);



//            if (splitLineOfText[i].equals(" "))
//            {
//                System.out.println("break" );
//                break;
//
//            }
//            else
//            {
//                System.out.println("NUMBER OF WORDS: " + numberOfWords);
//                ++numberOfWords; // adding up number of words
//                System.out.println("number of words: " + numberOfWords);
//            }


            if (splitLineOfText[i].equals("I"))
            {
                System.out.println(" IN IF I STATEMENT");
                ++iHoldCount;  // counting the number of 'i's
                System.out.println("iHoldCount:  " + iHoldCount);
                ++numberOfWords; // adding up number of words
            }
            else
            if (splitLineOfText[i].equals("love"))
            {
                System.out.println(" IN IF love STATEMENT");
                ++loveHoldCount;  // counting the number of 'love's
                System.out.println("LOVE COUNT:  " + loveHoldCount);
                ++numberOfWords; // adding up number of words
            }
            else
            if (splitLineOfText[i].equals("Java"))
            {

                System.out.println(" IN IF java STATEMENT");
                ++javaHoldCount;  // counting the number of 'java's
                System.out.println("JAVA COUNT:  " + javaHoldCount);
                ++numberOfWords; // adding up number of words
            }
            else
            if (splitLineOfText[i].equals("you"))
            {
                System.out.println(" IN IF you STATEMENT");
                ++youHoldCount; // counting the number of 'you's
                System.out.println("YOU COUNT:  " + youHoldCount);
                ++numberOfWords; // adding up number of words
            }
            else
            if (splitLineOfText[i].equals("she"))
            {
                System.out.println(" IN IF she STATEMENT");
                ++sheHoldCount;  // counting the number of 'she's
                System.out.println("SHE COUNT:  " + sheHoldCount);
                ++numberOfWords; // adding up number of words
            }
            else
            if (splitLineOfText[i].equals("loves"))
            {
                System.out.println(" IN IF loves  STATEMENT");
                ++lovesHoldCount;  // counting the number of 'love's
                System.out.println("LOVES COUNT:  " + lovesHoldCount);
                ++numberOfWords; // adding up number of words
            }
            else
            if (splitLineOfText[i].equals(" "))
            {

                System.out.println(" IN BLANK space STATEMENT");
                System.out.println("index before space" + i);
                --i;
                System.out.println("index after space" + i);

            }
            System.out.println("NUMBER OF WORDS: " + numberOfWords);

        }//for end

//        int holdcounts[] = {iHoldCount, loveHoldCount, javaHoldCount, youHoldCount, sheHoldCount, lovesHoldCount};
//
//        for (int i = 0; i <= numberOfWords;++1)
//        {
//            switch (holdcounts[i])
//            {
//                case 1
//
//
//            }
//
//        }

        System.out.println("\"I\" occurs " + iHoldCount);
        System.out.println("\"love\" occurs " + loveHoldCount);
        System.out.println("\"Java\" occurs " + javaHoldCount);
        System.out.println("\"You\" occurs " + youHoldCount);
        System.out.println("\"She\" occurs " + sheHoldCount);
        System.out.println("\"loves\" occurs " + lovesHoldCount);


//        int i = 0;

//
//        do
//        {//do beg
//                String[] splitLineOfText = lineOfText.split(" ");  //split text by using the space delimiter
//                System.out.println(splitLineOfText[i]);
//                ++numberOfWords;
//                System.out.println("number of words: " + numberOfWords);
//
//        }//do end
//
//        while (i <= numberOfWords);
//
//        //while (numberOfWordsb< i);


    }//main beg
}//class end
