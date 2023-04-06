package homeworkPackage.homework_Package_Monday_4_3_23;

import homeworkPackage.homework_Package_Monday_4_3_23.address_sub_package.Address;

public class Customer
{//class beg

    //------------------------------DEFINING VARIABLES/FIELDS----------------------
    private String customerName;
    private String email;
    private Product[] products;
    private Address[] addresses;
    private int currentAddressIndex = 0;

    //------------------------------CONSTRUCTOR ------------------------------------
    public Customer()
    {

    }

    //--------------------------BASIC LOGIC----------------------------------------
    //  load the variable value into address array & add 1 to array index
    public void addAddress(Address address)
    {
//        int i = 0;
//        for (; i < addresses.length; i++) {
//            if (addresses[i] == null) {
//                break;
//            }
//        }
//        addresses[i] = address;
        addresses[currentAddressIndex++] = address;
    }


    // use for loop to go thru arrays and send/return info/result back to main class
    public String getCustomerInfo()
    {

        String result = "CustomerName: " + customerName +
                 " " + "\n" + "Email: " + email;

        for (int ii = 0; ii < products.length; ii++) {
            if (products[ii] == null) {
                break;
            }
            result += "\n"
                    + "  Product name: "
                    + products[ii].getProductName();
        }

        for (int ii = 0; ii < addresses.length; ii++) {
            if (addresses[ii] == null) {
                break;
            }
            result += "\n"
                    + "  Address: "
                    + addresses[ii].getStreetNumber() + " "
                    + addresses[ii].getCity() + " ";
        }

        return result;
    }


    //------------------GETTER/SETTERS of variables----------------------------------
    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public Product[] getProducts()
    {
        return products;
    }

    public void setProducts(Product[] products)
    {
        this.products = products;
    }

    public void setAddresses(Address[] addresses)
    {
        this.addresses = addresses;
    }


}//class end
