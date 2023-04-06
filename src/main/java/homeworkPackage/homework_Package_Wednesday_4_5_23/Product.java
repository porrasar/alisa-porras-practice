package homeworkPackage.homework_Package_Wednesday_4_5_23;

public class Product
{//class beg

    //------------------------------DEFINING VARIABLES/FIELDS----------------------
    private String productName;
    private double price;

    //------------------------------CONSTRUCTOR ------------------------------------
    public Product(String productName, double price)
    {
        this.productName = productName;
        this.price = price;
    }

    //------------------GETTER/SETTERS of variables----------------------------------
    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }


}//class end
