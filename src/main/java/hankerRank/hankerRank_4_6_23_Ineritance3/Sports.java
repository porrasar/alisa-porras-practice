package hankerRank.hankerRank_4_6_23_Ineritance3;

public class Sports {

    //------------------------------DEFINING VARIABLES/FIELDS----------------------
    private String name;

    //------------------------------CONSTRUCTOR ------------------------------------
    public Sports() {

    }

    public Sports(String name) {
        this.name = name;
    }


    //--------------------------BASIC LOGIC----------------------------------------
    String getName()
    {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers()
    {
        System.out.println("Each team has n players in " + getName());
    }

    //------------------GETTER/SETTERS of variables----------------------------------


    public void setName(String name) {
        this.name = name;
    }
}//class end