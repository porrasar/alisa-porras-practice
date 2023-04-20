package sba_core_java.exercise2;

import java.util.Arrays;

public class Main
{//class beg

    public static void main(String[] args)
    {//main method beg

        //------------------------------------------OBJECT INSTANCE-------------------------------------

        MajorLeagueSoccer majorLeagueSoccer = new MajorLeagueSoccer();
        //---------------------------------------------VARIABLE---------------------------------------
        int[] myNumberArray = {23,12,33,47};

        //-----------------------------------------BUSINESS LOGIC -------------------------------------

        int holdSumAmt = 0;

        for (int forLoopVariable : myNumberArray)
        {
            holdSumAmt += forLoopVariable;
        }

        double holdAverageAmt = (double) holdSumAmt/myNumberArray.length;

        System.out.printf("%.2f \n",holdAverageAmt);

        System.out.println("player number array: " + Arrays.toString(majorLeagueSoccer.getPlayerNumberArray()));
        System.out.println(" ");

        majorLeagueSoccer.sendPlayerToMinorLeague(4);
        majorLeagueSoccer.sendPlayerToMinorLeague(4);
        System.out.println(" ");

        majorLeagueSoccer.transferPlayerToDifferentTeam(6,"Tottenham");
        majorLeagueSoccer.transferPlayerToDifferentTeam(6,"Napoli");




    }//main method end

    //=========================================MAJOR LEAGUE SOCCER CLASS ======================================

}//class main end
