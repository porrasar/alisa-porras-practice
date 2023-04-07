package hankerRank.hankerRank_4_6_23__Inheritance2;

public class Adder extends Arithmetic
{
    //------------------------------DEFINING VARIABLES/FIELDS----------------------

    //n/a right now

    //------------------------------CONSTRUCTOR ------------------------------------
    public Adder()
    {

    }
    public Adder(int one, int two)
    {
        super(one, two);
    }


    //--------------------------BASIC LOGIC----------------------------------------
    //int sum =


    @Override
    public int add(int one, int two)
    {
        return super.add(one, two);
    }

    public String myMessage()
    {
        String myMessages =  "My superclass is: Arithmetic";
        return myMessages;
    }

    //------------------GETTER/SETTERS of variables----------------------------------

    //should it have getters/setters?

}
