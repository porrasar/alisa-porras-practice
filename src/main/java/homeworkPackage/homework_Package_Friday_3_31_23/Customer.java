package homeworkPackage.homework_Package_Friday_3_31_23;

import homeworkPackage.homework_Package_Friday_3_31_23.Product;

public class Customer
{//class beg

    //--------------Defining variables/fields/arrays------------
    private String customerName;
    private String address;
    private String email;

    private Product[] purchasedProduct;

    //----------------------------CONSTRUCTORS --------------------------------------------
    public Customer()
    {//constructor with 4 arguments: customer name, address, email, purchased product

    }

      public Customer(String customerName, String address, String email, Product[] purchasedProduct)
      {//constructor with 4 arguments: customer name, address, email, purchased product
        this.customerName = customerName;
        this.address = address;
        this.email = email;
        this.purchasedProduct = purchasedProduct;
      }
   // -----------------------------Basic logic --------------------
    public String getCustomerInfo()
    {//getcustomerinfo beg
        String result = "Customer Name: " + customerName + "address: " + address + "email: " + email;
        for (int ii = 0; ii < purchasedProduct.length; ii++)
        {
            if (purchasedProduct[ii] == null)
            {
                break;
            }
            result += ("\n" + " Product name: " + purchasedProduct[ii].getProductName()
                    + "\n" + " Price $: " + purchasedProduct[ii].getPriceOfProduct());
         }
        return result;

    }//getcustomerinfo end


        //-------------------------------- GETTER AND SETTERS--------------------------------------
        //--------Name getter and setter-----------------
        public String getCustomerName ()
        {
            return customerName;
        }
        public void setCustomerName (String customerName)
        {
            this.customerName = customerName;
        }

        //---------Address getter and setter-----------------
        public String getAddress ()
        {
            return address;
        }
        public void setAddress (String address)
        {
            this.address = address;
        }

        //--------Email getter and setter-----------------
        public String getEmail ()
        {
            return email;
        }
        public void setEmail (String email)
        {
            this.email = email;
        }

        //-------Purchased product array getter and setter-----------------
        public Product[] getPurchasedProduct ()
        {
            return purchasedProduct;
        }
        public void setPurchasedProduct (Product[]purchasedProduct)
        {
            this.purchasedProduct = purchasedProduct;
        }



//------------------------------old code
//      public void getCustomerInfo()
//    {
//        System.out.println("Customer: " + customerName);
//        System.out.println("Address: " + address);
//        System.out.println("Email: " + email);
//
//        //enhanced for loop format: product array; a made up name to hold the product;
//        //the variable used in the product array
//        for (Product productPurchasedMadeUpName : purchasedProduct)
//        {
//            System.out.println
//                    ("Product purchased: " + productPurchasedMadeUpName.getProductName()
//                            + ", $" + productPurchasedMadeUpName.getPriceOfProduct());
//        }
//       String result = "test if working";
//       return result;
//       ....or...
//       return null; // just keeps from getting compile error till i get code in
//    }

}//class end
