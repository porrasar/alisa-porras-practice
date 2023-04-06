package homeworkPackage.homework_Package_Wednesday_4_5_23.address_sub_package;

public class Address
{
    //------------------------------DEFINING VARIABLES/FIELDS----------------------
    private boolean isPrimaryAddress;
    private int streetNumber;
    private String streetName;
    private String city;
    private String state;

    //------------------------------CONSTRUCTOR ------------------------------------
    public Address(boolean isPrimaryAddress,
                   int streetNumber,
                   String streetName,
                   String city,
                   String state) {
        this.isPrimaryAddress = isPrimaryAddress;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
    }

    //------------------GETTER/SETTERS of variables----------------------------------
    public boolean isPrimaryAddress()
    {
        return isPrimaryAddress;
    }

    public int getStreetNumber()
    {
        return streetNumber;
    }

    public String getStreetName()
    {
        return streetName;
    }

    public String getCity()
    {
        return city;
    }

    public String getState()
    {
        return state;
    }

}
