package hankerRank.hankerRank_4_6_23__Inheritance2;

public class Main
{


    //--------------------------BASIC LOGIC----------------------------------------
    public static void main(String[] args)
    {
        Arithmetic arithmetic = new Arithmetic(5,13);
        int sum = arithmetic.add(arithmetic.getOne(), arithmetic.getTwo());
        System.out.println("Sum from arithmetic: " + sum);

        Adder adder = new Adder(15, 20);
        sum = adder.add(adder.getOne(), adder.getTwo());
        System.out.println("Sum from Adder: " + sum);
        System.out.println(adder.myMessage());
    }




}//class end


