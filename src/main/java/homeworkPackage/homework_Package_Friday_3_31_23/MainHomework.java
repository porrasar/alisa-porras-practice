package homeworkPackage.homework_Package_Friday_3_31_23;


import java.util.Arrays;

public class MainHomework
{//class beg

    //------------------------------------------------------------------------------------
//
//    Create “Product” class with the following fields - choose appropriate data types - and appropriate methods
//        productName
//        price
//    Create “Customer” class with the following fields - choose appropriate data types - and appropriate methods
//        customerName
//        address
//        email
//        Product[] purchasedProducts
//    Add “getCustomerInfo” method to the Customer class, which displays detailed customer information along with the products s/he purchased
//    Create “MainHomework” class, in which you do the following in the “main” method
//    Create 2 Product instances using test productName such as “TV” or “Laptop” with test prices
//    Create a Customer object instance with test customerName, address, email, and the two products created above
//    Invoke “getCustomerInfo” method of the Customer object instance
    //------------------------------------------------------------------------------------
    public static void main(String[] args)
    {//main beg


        Customer customer1 = new Customer();
        customer1.setCustomerName("Go-girl");
        customer1.setAddress("Somewhere");
        customer1.setEmail("gogirl@yahoo.com");

        Product[] purchasedProduct = new Product[10];
        purchasedProduct[0] = new Product("tv",100.00);
        purchasedProduct[1] = new Product("laptop",200.00);
        String s = Arrays.toString(purchasedProduct);
        System.out.println(s);
        customer1.setPurchasedProduct(purchasedProduct);

        String customerInfo = customer1.getCustomerInfo();
        System.out.println(customerInfo);

        customer1.getCustomerInfo();
;
//---------------------old code
        //-----------------------Product object instance with 2 arguments
//        Product product1 = new Product("TV", 399.99);
//
//        Product product2 = new Product("Laptop", 280.99);
          //Product[] purchasedProduct = {product1, product2};
//
//        //-----------------------Customer object instance with 2 arguments
//        Customer customer1 =
//                new Customer("Jim Bob","245 Time Clock, ColdHouse, OH 41111",
//                             "JimBob@yahoo.com", new Product[]{product1, product2});
//
//        //------USING GETTER METHOD TO ACCESS CUSTOMER INFO,PURCHASED PRODUCTS
//        customer1.getCustomerInfo();


    }//main end
}//class end
