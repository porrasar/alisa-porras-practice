package hankerRank.hankerRank_4_6_23_Ineritance3;

public class Main
{

    //--------------------------BASIC LOGIC----------------------------------------


        public static void main(String[] args)
        {
                Sports sports = new Sports();
                String teamName = sports.getName();
                System.out.println(teamName);
                sports.getNumberOfTeamMembers();


                Soccer soccer = new Soccer();
                teamName = soccer.getName();
                System.out.println(teamName);
                soccer.getNumberOfTeamMembers();
        }


}
