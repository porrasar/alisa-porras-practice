package homeworkPackage.practiceExercise_4_6_23;

public class Parent
{//class beg
    //------------------------------DEFINING VARIABLES/FIELDS----------------------
    private String parentHairColor;
    private String childHairColor;

    //-----------------------------CONSTRUCTOR -------------------------------------

    public Parent()
    {

    }
     public Parent(String parentHairColor, String childHairColor)
    {
        this.parentHairColor = parentHairColor;
        this.childHairColor = childHairColor;
    }

    //-----------------------------BUSINESS LOGIC ------------------------------------
  public void getParentInfo()
  {
      System.out.println("I am the parent, my hair color is: " + parentHairColor);
      System.out.println("My child's hair color is: " + childHairColor);
  }

  public String changeHairColor()
  {
      String result = "my new hair color";
      return result;
  }


    //-----------------------------GETTER/SETTER  ---------------------
    public String getparentHairColor()
    {
        return parentHairColor;
    }

    public void setparentHairColor(String parentHairColor)
    {
        this.parentHairColor = parentHairColor;
    }

    public void setchildHairColor(String childHairColor)
    {
        this.childHairColor = childHairColor;
    }
    public String getchildHairColor()
    {
        return childHairColor;
    }

}//class end
