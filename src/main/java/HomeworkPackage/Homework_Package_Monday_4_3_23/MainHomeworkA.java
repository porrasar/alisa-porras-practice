package HomeworkPackage.Homework_Package_Monday_4_3_23;

public class MainHomeworkA
{//class beg
    public static void main(String[] args)
    {//main beg
        //----------------------- object instances ----------------------------
        ProductA product1A = new ProductA("TV", 399.99);

        ProductA product2A = new ProductA("Laptop", 280.99);

        AddressA address1A = new AddressA(false,555,
                "HowYouDoAve", "NiceCity", "OH");

        CustomerA customer1A =
            new CustomerA("Suzy Q","suzyq@yahoo.com",
                           new ProductA[]{product1A, product2A},
                           new AddressA[]{address1A});

        //------USING GETTER METHOD TO ACCESS CUSTOMER INFO,PURCHASED PRODUCTS
        customer1A.getCustomerInfoA();

    }//main end

}//class end
