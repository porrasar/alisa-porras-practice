package hankerRank.hankerRank_4_6_23_Ineritance3;

public class Soccer extends Sports
{
    //------------------------------DEFINING VARIABLES/FIELDS----------------------

    //n/a right now

    //------------------------------CONSTRUCTOR ------------------------------------

    public Soccer()
    {

    }

    public Soccer(String name)
    {
        super(name);
    }

    //--------------------------BASIC LOGIC----------------------------------------
    //int sum =
    @Override
    String getName()
    {
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers()
    {
        System.out.println("Each team has 11 players in " + getName());
    }



    //------------------GETTER/SETTERS of variables----------------------------------

    //should it have getters/setters?


}//class end
