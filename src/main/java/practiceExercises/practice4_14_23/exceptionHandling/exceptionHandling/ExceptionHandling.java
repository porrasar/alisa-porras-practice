package practiceExercises.practice4_14_23.exceptionHandling.exceptionHandling;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling
{

    public static void main(String[] args) throws FileNotFoundException
    {
        myMethod1();

//        try
//        {
//            myMethod1();
//        }
//        catch(MyOwnArithmeticException e)
//        {
//            System.out.println("get my own exception");
//        }



    }//main end

    //try and catch for arithmetic exception. throwing for File not found exception
     private static void myMethod1() throws FileNotFoundException
    {

        myMethod2(0);
        myMethod4();

//        try
//        {
//            myMethod2(0);
//            myMethod4();
//            // myMethod2();
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println("i handled it, arithmetic exception");
//        }

        //can handle file exception here, if not throw
//        catch(FileNotFoundException e)
//        {
//            System.out.println("i handled it, the file not found exception in method1");
//        }

    }//method1 end

    private static void myMethod2(int divider)
    {
//        System.out.println("before exception");
//        //the code below will cause an exception
//        System.out.println(3/divider);
//        //System.out.println(3/0);
//        System.out.println("it's working");


        //try and catch for file not found exception
        File file = new File("sample.txt");
        try
        {
            if (divider == 0)
            {
                //throwing 'throw' my own exception because I see something that may cause an issue
                throw new ArithmeticException();
            }
            System.out.println(4/divider);
            Scanner scanner = new Scanner(file);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("I know, File not found exception");
        }
        catch (Exception e)
        {
            System.out.println("Catching ALL/group exceptions");
        }
        finally
        {
            System.out.println("FINALLY exception: always executed, it cleans up of code after try & catch");
        }
    }//method2 end

    private static void myMethod4() throws FileNotFoundException
    {
        File file2 = new File("sample2.txt");
        Scanner scanner = new Scanner(file2);

    }//method 4 end


}//class end
