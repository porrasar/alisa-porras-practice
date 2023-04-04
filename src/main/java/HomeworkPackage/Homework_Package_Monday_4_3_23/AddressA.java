package HomeworkPackage.Homework_Package_Monday_4_3_23;

public class AddressA
{ //class beg

    //--------------Defining variables/fields/arrays------------
    private boolean isPrimaryAddressA;
    private int streetNumberA;
    private String streetNameA;
    private String cityA;
    private String stateA;


    //----------------------------CONSTRUCTORS --------------------------------------------
    public AddressA(boolean isPrimaryAddressA, int streetNumberA, String streetNameA,
                     String cityA, String stateA)
    {
        this.isPrimaryAddressA = isPrimaryAddressA;
        this.streetNumberA = streetNumberA;
        this.streetNameA = streetNameA;
        this.cityA = cityA;
        this.stateA = stateA;
    }

    //-------------------------------- GETTER AND SETTERS--------------------------------------
    //--------Boolean getter and setter-----------------
    public boolean getIsPrimaryAddressA()
    {
        return isPrimaryAddressA;
    }
    public void setIsPrimaryAddressA(boolean isPrimaryAddressA)
    {
        this.isPrimaryAddressA = isPrimaryAddressA;
    }

    //--------Street number getter and setter-----------------
    public int getStreetNumberA()
    {
        return streetNumberA;
    }
    public void setStreetNumberA(int streetNumberA)
    {
        this.streetNumberA = streetNumberA;
    }

    //--------Street name getter and setter-----------------
    public String getStreetNameA()
    {
        return streetNameA;
    }
    public void setStreetNameA(String streetNameA)
    {
        this.streetNameA = streetNameA;
    }

    //--------City name getter and setter-----------------
    public String getCityA()
    {
        return cityA;
    }
    public void setCityA(String cityA)
    {
        this.cityA = cityA;
    }

    //--------State getter and setter-----------------
    public String getStateA()
    {
        return stateA;
    }
    public void setStateA(String stateA)
    {
        this.stateA = stateA;
    }

}//class end
