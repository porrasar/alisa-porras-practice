package sba_core_java.exercise2;

import java.util.Arrays;

public class Main {//class beg

    public static void  main(String[] args) {//main method beg

        //-----------------------OBJECT INSTANCE-------------------------------------

        MajorLeagueSoccer majorLeagueSoccer = new MajorLeagueSoccer();
        //--------------------------------VARIABLE---------------------------------------
        int[] myNumberArray = {23, 12, 33, 47};  //creating a number array

        //-----------------------BUSINESS LOGIC -------------------------------------

        int holdSumAmt = 0;

        for (int forLoopVariableNumbersInTheArray  : myNumberArray)
        {
            holdSumAmt += forLoopVariableNumbersInTheArray;
        }

        double holdAverageAmt = (double) holdSumAmt / myNumberArray.length;

        System.out.printf("%.2f \n", holdAverageAmt);
        System.out.println(" ");

        System.out.println("player number array: "
                + Arrays.toString(majorLeagueSoccer.getPlayerNumberArray()));  // display contents of playernumber array
        System.out.println(" ");

        majorLeagueSoccer.sendPlayerToMinorLeague(4);
        majorLeagueSoccer.sendPlayerToMinorLeague(4);
        System.out.println(" ");

        majorLeagueSoccer.transferPlayerToDifferentTeam(6, "Tottenham");
        majorLeagueSoccer.transferPlayerToDifferentTeam(6, "Napoli");


    }//main method end

}//class main end


//=======================MAJOR LEAGUE SOCCER CLASS ===================================


class MajorLeagueSoccer
{
    //------------------------VARIABLE-------------------------------------------------
    private int[] playerNumberArray;

    //-------------------------CONSTRUCTOR----------------------------------------------
    public MajorLeagueSoccer()
    {
        playerNumberArray = new int[11];

        for (int i = 0; i < playerNumberArray.length; i++)
        {
            playerNumberArray[i] = i + 1;  //this is creating the player id, by incrementing index by 1
        }
    }

    //----------------------BUSINESS LOGIC-/METHODS---------------------------------------------

    public void sendPlayerToMinorLeague(int playerID)
    {
        int index = playerID - 1;
        int playerIDInTheArray = playerNumberArray[index];

        if (playerIDInTheArray != -1) //checking to see if player still on team
        {
            playerNumberArray[index] = -1;
            System.out.println("player " + playerID + " is sent to minor league");  //player still on team, but sending to minor league
        } else {
            System.out.println("player " + playerID + " is no longer available");  //player already gone to minor league
        }
    }

    public void transferPlayerToDifferentTeam(int playerID, String destinationTeam)
    {
        int index = playerID - 1;
        int playerIDInTheArray = playerNumberArray[index];

        if (playerIDInTheArray != -1)  //player is still on the team
        {
            playerNumberArray[index] = -1;
            System.out.println("player " + playerID + " is transferred to " + destinationTeam);
        } else
        {
            System.out.println("player " + playerID + " is no longer available");
        }
    }

    //-------------------GETTER/SETTER------------------------------------------
    public int[] getPlayerNumberArray()
    {
        return playerNumberArray;
    }

    public void setPlayerNumberArray(int[] playerNumberArray)
    {
        this.playerNumberArray = playerNumberArray;
    }
}//class end majorleaguesoccer

