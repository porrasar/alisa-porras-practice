package homeworkPackage.homework_Package_Monday_4_3_23;

import homeworkPackage.homework_Package_Monday_4_3_23.address_sub_package.Address;

import java.util.Arrays;

public class MainHomework
{//class beg

//-------------------------------REQUIREMENTS------------------------------------------

//Remove existing “address” field (and its getter and setter) from the Customer class
//Create “Address” class with the following fields:
//boolean isPrimaryAddress
//streetNumber
//streetName
//city
//state
//Add “Address[]” field to the “Customer” class
//The “Address” class should be in a sub-package
//Add “addAddress(Address address)” method to the “Customer” class
//Think about how you are going to keep track of the next available Address slot in the Address[] array of the Customer object
//Modify “getCustomerInfo” method to display the addresses of the customer as well
//In the “main” method of the “MainHomeworkMarch31st” class, please add a new address to a “Customer” object using “addAddress(Address address)” method



    //------------------------------DEFINING VARIABLES/FIELDS----------------------
    public static void main(String[] args)
    {//main beg


       //------------creating object instances and setting the variable-----------------
       //------------customer object
        Customer customer = new Customer();
        customer.setCustomerName("Suzy q");
        customer.setEmail("suzyq@yahoo.com");

        //------------product array object
        Product[] products = new Product[10];
        products[0] = new Product("TV", 535.00);
        products[1] = new Product("Laptop",310.00);
        customer.setProducts(products);

        //------------address array object
        Address[] addresses = new Address[10];
        customer.setAddresses(addresses);


        //--loading address into variable and calling the addAddress
        //  method to load the variable value into address array
        Address address1 = new Address(true,254,
                "How You Doing St.","Nice City","OH");
        customer.addAddress(address1);  // calling the
        Address address2 = new Address(false,3550,
                "I'm fine Ave.","Nice City","OH");
        customer.addAddress(address2);

        //call getCustomerInfo method to get customer info and then print it out
        String customerInfo = customer.getCustomerInfo();
        System.out.println(customerInfo);

    }//main end
}//class end
