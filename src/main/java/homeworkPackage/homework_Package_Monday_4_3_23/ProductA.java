package homeworkPackage.homework_Package_Monday_4_3_23;

public class ProductA
{//class beg

    //--------------Defining variables/fields------------
    private String productNameA;
    private double priceOfProductA;

    //--------------------------------CONSTRUCTORS --------------------------------------------
    public ProductA(String productNameA, double priceOfProductA)
    {//constructor with 2 arguments: product name and price of product
        this.productNameA = productNameA;
        this.priceOfProductA = priceOfProductA;
//        numberOfProductsPurchasedCount++;
    }

    //------------------------- GETTER AND SETTERS----------------------------
    //--------Product Name  getter and setter-----------------
    public String getProductNameA()
    {
        return productNameA;
    }
    public void setProductNameA(String productNameA)
    {
        this.productNameA = productNameA;
    }

    //--------Price of Product getter and setter-----------------
    public double getPriceOfProductA()
    {
        return priceOfProductA;
    }
    public void setPriceOfProductA(double priceOfProductA)
    {
        this.priceOfProductA = priceOfProductA;
    }

}
