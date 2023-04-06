package homeworkPackage.homework_Package_Wednesday_4_5_23;


import homeworkPackage.homework_Package_Wednesday_4_5_23.address_sub_package.Address;

public class Customer
{//class beg

    //------------------------------DEFINING VARIABLES/FIELDS----------------------

    private CustomerName customerName;
    private String email;
    private Product[] products;
    private Address[] addresses;
    private int currentAddressIndex = 0;

    //------------------------------CONSTRUCTOR ------------------------------------
    public Customer()
    {

    }

    public Customer(CustomerName customerName, String email, Product[] products, Address[] addresses, int currentAddressIndex) {
        this.customerName = customerName;
        this.email = email;
        this.products = products;
        this.addresses = addresses;
        this.currentAddressIndex = currentAddressIndex;
    }

    //--------------------------BASIC LOGIC----------------------------------------
    //  load the variable value into address array & add 1 to array index
    public void addAddress(Address address)
    {
        addresses[currentAddressIndex++] = address;
    }


    // use for loop to go thru arrays and send/return info/result back to main class
    public String getCustomerInfo()
    {
        String result = "First Name: " + customerName.getFirstName()
                +  " " + "Middle Name: " + customerName.getMiddleName()
                +  " " + "Last Name: " + customerName.getLastName()
                + "\n" + "Email: " + email;

        for (int ii = 0; ii < products.length; ii++)
        {
            if (products[ii] == null) {
                break;
            }
            result += "\n"
                    + "  Product Name: "
                    + products[ii].getProductName()
                    + "Price: $ "
                    + products[ii].getPrice();

        }

        for (int ii = 0; ii < addresses.length; ii++)
        {
            if (addresses[ii] == null) {
                break;
            }
            result += "\n"
                    + "  Address: "
                    + addresses[ii].getStreetNumber() + " "
                    + addresses[ii].getStreetName() + " "
                    + addresses[ii].getCity() + " ";
        }

        return result;
    }


    //------------------GETTER/SETTERS of variables----------------------------------
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

    public CustomerName getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(CustomerName customerName)
    {
        this.customerName = customerName;
    }
}//class end
