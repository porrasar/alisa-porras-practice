package HomeworkPackage.Homework_Package_Monday_4_3_23;



public class CustomerA
{//class beg

    //--------------Defining variables/fields/arrays------------
    private String customerNameA;
    private String emailA;

    //these are arrays of the classes ProductA and CustomerAddressA
    private ProductA[] purchasedProductA;
    private AddressA[] customerAddressA;

    //----------------------------CONSTRUCTORS --------------------------------------------

    public CustomerA(String customerNameA, String emailA,
                     ProductA [] purchasedProductA)
    {//constructor with 3 arguments: customer name, address, email, purchased product
        this.customerNameA = customerNameA;
        this.emailA = emailA;
        this.purchasedProductA = purchasedProductA;
    }
    public CustomerA(String customerNameA, String emailA,
                     ProductA [] purchasedProductA, AddressA[] customerAddressA)
    {//constructor with 4 arguments: customer name, address, email, purchased product
        this.customerNameA = customerNameA;
        this.emailA = emailA;
        this.purchasedProductA = purchasedProductA;
        this.customerAddressA = customerAddressA;
    }

    //-------------------------------- GETTER AND SETTERS--------------------------------------
    //--------Name getter and setter-----------------
    public String getCustomerNameA()
    {
        return customerNameA;
    }
    public void setCustomerName(String customerName)
    {
        this.customerNameA = customerNameA;
    }

    //--------Email getter and setter-----------------
    public String getEmailA()
    {
        return emailA;
    }
    public void setEmailA(String email)
    {
        this.emailA = emailA;
    }

    //-------Purchased product array getter and setter-----------------
    public ProductA[] getPurchasedProductA()
    {
        return purchasedProductA;
    }
    public void setPurchasedProductA(ProductA[] purchasedProductA)
    {
        this.purchasedProductA = purchasedProductA;
    }

    //-------Address array getter and setter-----------------
    public AddressA[] getCustomerAddressA()
    {
        return customerAddressA;
    }
    public void setCustomerAddressA(AddressA[] customerAddressA)
    {
        this.customerAddressA = customerAddressA;
    }

    //----------GET AND PRINT Customer Info. and product(s) purchased-----------------

    public void getCustomerInfoA()
    {
        System.out.println("Customer: " + customerNameA);
        System.out.println("Email: " + emailA);

        for (AddressA customerAddressMadeUpAddressA : customerAddressA)
        {
            System.out.println
                    ("Primary Address?: " + customerAddressMadeUpAddressA.getIsPrimaryAddressA());
            System.out.println
                    ("Customer Address: " + customerAddressMadeUpAddressA.getStreetNumberA()
                      + " " + customerAddressMadeUpAddressA.getStreetNameA() + " "
                      + customerAddressMadeUpAddressA.getCityA() + " "
                      + customerAddressMadeUpAddressA.getStateA());
        }


        //enhanced for loop format: product array; a made up name to hold the product;
        //the variable used in the product array
        for (ProductA productPurchasedMadeUpNameA : purchasedProductA)
        {
            System.out.println
                    ("Product purchased: " + productPurchasedMadeUpNameA.getProductNameA()
                            + ", $" + productPurchasedMadeUpNameA.getPriceOfProductA());
        }

    }
}//class end
