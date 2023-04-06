package homeworkPackage.homework_Package_Wednesday_4_5_23;

public class CustomerName
{
    //------------------------------DEFINING VARIABLES/FIELDS----------------------
    private String firstName;
    private String middleName;
    private String lastName;

    //------------------------------CONSTRUCTOR ------------------------------------

    public CustomerName(String firstName, String middleName, String lastName)
    {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    //------------------GETTER/SETTERS of variables----------------------------------
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
