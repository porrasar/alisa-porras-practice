package hankerRank.hankerRank_4_6_23__Inheritance2;

public class Arithmetic
{

    //------------------------------DEFINING VARIABLES/FIELDS----------------------


    private int one;
    private int two;

    //------------------------------CONSTRUCTOR ------------------------------------
    public Arithmetic()
    {

    }

    public Arithmetic(int one, int two)
    {
        this.one = one;
        this.two = two;
    }

    //--------------------------BASIC LOGIC----------------------------------------
    public int add(int one, int two)
    {
        int sum = one + two;
        return sum;
    }

    //------------------GETTER/SETTERS of variables----------------------------------


    public int getOne()
    {
        return one;
    }

    public void setOne(int one)
    {
        this.one = one;
    }

    public int getTwo()
    {
        return two;
    }

    public void setTwo(int two)
    {
        this.two = two;
    }
}//class end
