package sba_core_java.exercise1;

public class MyOwnException extends Throwable
{
    public static boolean getMessage(String holdString)
    {

        System.out.println("Invalid integer from my own class");
        return false;
    }

    public MyOwnException(String message) {
        super(message);
    }
}
