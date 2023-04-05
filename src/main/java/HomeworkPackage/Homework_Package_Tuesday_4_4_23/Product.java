package HomeworkPackage.Homework_Package_Tuesday_4_4_23;

public class Product
{//class beg

     //--------------Defining variables/fields------------
    private String productName;
    private double priceOfProduct;

    //--------------------------------CONSTRUCTORS --------------------------------------------
    public Product(String productName, double priceOfProduct)
    {//constructor with 2 arguments: product name and price of product
        this.productName = productName;
        this.priceOfProduct = priceOfProduct;
//        numberOfProductsPurchasedCount++;
    }

    //------------------------- GETTER AND SETTERS----------------------------
    //--------Product Name  getter and setter-----------------
    public String getProductName()
    {
        return productName;
    }
    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    //--------Price of Product getter and setter-----------------
    public double getPriceOfProduct()
    {
        return priceOfProduct;
    }
    public void setPriceOfProduct(double priceOfProduct)
    {
        this.priceOfProduct = priceOfProduct;
    }

}//class end
