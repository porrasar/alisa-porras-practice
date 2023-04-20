package sba_core_java.exercise2;

public class MajorLeagueSoccer
{
    //---------------------------------------------VARIABLE-------------------------------------------------
    private int[] playerNumberArray;

    //--------------------------------------------CONSTRUCTOR----------------------------------------------
    public MajorLeagueSoccer()
    {
        playerNumberArray = new int[11];

        for (int i = 0; i < playerNumberArray.length; i++)
        {
            playerNumberArray[i] = i + 1;
        }
    }

    //--------------------------------------------BUSINESS LOGIC-/METHODS---------------------------------------------

    void sendPlayerToMinorLeague(int playerID)
    {
        int index = playerID - 1;
        int playerIDInTheArray = playerNumberArray[index];

        if (playerIDInTheArray != -1)
        {
            playerNumberArray[index] = -1;
            System.out.println("player is sent to minor league");
        }
        else
        {
            System.out.println("player is already sent to minor league");
        }
}

    void transferPlayerToDifferentTeam(int playerID, String destinationTeam)
    {
        int index = playerID - 1;
        int playerIDInTheArray = playerNumberArray[index];

        if (playerIDInTheArray != -1)  //player is still on the team
        {
            playerNumberArray[index] = -1;
            System.out.println("player " + playerNumberArray[index] + " is transferred to " + destinationTeam);
        }
        else
        {
            System.out.println("player " + playerNumberArray[index] + " is no longer available");
        }
    }

    //--------------------------------------------GETTER/SETTER----------------------------------------------
    public int[] getPlayerNumberArray()
    {
        return playerNumberArray;
    }

    public void setPlayerNumberArray(int[] playerNumberArray)
    {
        this.playerNumberArray = playerNumberArray;
    }



}
