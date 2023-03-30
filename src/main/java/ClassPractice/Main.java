package ClassPractice;

public class Main
{//class beg
    public static void main(String[] args)
    {//main beg

        House house1 = new House();   //creating a new house object
        house1.setColor("purple");
        house1.setSize("2000");


        House house2 = new House();   //creating another new house object
        house2.setColor("peach");
        house2.setSize("2500");

        System.out.println(house1.getColor());  //print out color of house1
        System.out.println(house2.getColor());  //print out color of house2

        System.out.println(house1.getSize());  //print out color of house1
        System.out.println(house2.getSize());  //print out color of



    }//main end
}//class end
