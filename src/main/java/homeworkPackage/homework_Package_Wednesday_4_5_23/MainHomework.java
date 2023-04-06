package homeworkPackage.homework_Package_Wednesday_4_5_23;


import homeworkPackage.homework_Package_Wednesday_4_5_23.address_sub_package.Address;

public class MainHomework
{//class beg

//-------------------------------REQUIREMENTS------------------------------------------

    /*
Remove existing “customerName” field (and its getter and setter) from the Customer class
Create “CustomerName” class with the following fields:
firstName
middleName
lastName
Refactor affected code accordingly
*/

    //------------------------------DEFINING VARIABLES/FIELDS----------------------
    public static void main(String[] args)
    {//main beg


       //------------creating object instances and setting the variable-----------------
       //------------customer object

        Customer customer = new Customer();
        customer.setEmail("suzyq@yahoo.com");

        CustomerName customerName = new CustomerName
                ("Suzy", "Tammy", "Q");
        customer.setCustomerName(customerName);


        //------------product array object
        Product[] products = new Product[10];
        products[0] = new Product("Big TV", 535.00);
        products[1] = new Product("Laptop",100.00);
        customer.setProducts(products);

        //------------address array object
        Address[] addresses = new Address[10];
        customer.setAddresses(addresses);

        //--loading address into variable and calling the addAddress
        //  method to load the variable value into address array
        Address address1 = new Address(true,333,
                "How You Doing St.","Nice City","OH");
        customer.addAddress(address1);  // calling the
        Address address2 = new Address(false,542,
                "I'm fine Ave.","Nice City","OH");
        customer.addAddress(address2);



        //call getCustomerInfo method to get customer info and then print it out
        String customerInfo = customer.getCustomerInfo();
        System.out.println("\n" + customerInfo);


    }//main end
}//class end
