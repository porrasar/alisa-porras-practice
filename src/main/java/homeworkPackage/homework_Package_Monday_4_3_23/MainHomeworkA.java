package homeworkPackage.homework_Package_Monday_4_3_23;

/*
Remove existing “address” field (and its getter and setter) from the Customer class
Create “Address” class with the following fields:
boolean isPrimaryAddress
streetNumber
streetName
city
state
Add “Address[]” field to the “Customer” class
The “Address” class should be in a sub-package
Add “addAddress(Address address)” method to the “Customer” class
Think about how you are going to keep track of the next available Address slot in the Address[] array of the Customer object
Modify “getCustomerInfo” method to display the addresses of the customer as well
In the “main” method of the “MainHomeworkMarch31st” class, please add a new address to a “Customer” object using “addAddress(Address address)” method

*/

public class MainHomeworkA
{//class beg
    public static void main(String[] args)
    {//main beg
        //--------------creating bject instances ----------------------------
        ProductA product1A = new ProductA("TV", 399.99);

        ProductA product2A = new ProductA("Laptop", 280.99);

        AddressA address1A = new AddressA(false,555,
                "How You Do Ave.", "NiceCity", "OH");

        AddressA address2A = new AddressA();
//        //use to set values for address 2 in main class
//        address2A.setIsPrimaryAddressA(true);
//        address2A.setStreetNumberA(7544);
//        address2A.setStreetNameA("I Am Fine Dr.");
//        address2A.setCityA("NiceCity");
//        address2A.setStateA("OH");

        CustomerA customer1A =
            new CustomerA("Suzy Q","suzyq@yahoo.com",
                           new ProductA[]{product1A, product2A},
                           new AddressA[]{address1A, address2A});

        CustomerA customer2A = new CustomerA();

        //adding new address
        customer2A.addAddressA(address2A);

        //------USING GETTER METHOD TO ACCESS CUSTOMER INFO,PURCHASED PRODUCTS

        customer1A.getCustomerInfoA();
    }//main end

}//class end
