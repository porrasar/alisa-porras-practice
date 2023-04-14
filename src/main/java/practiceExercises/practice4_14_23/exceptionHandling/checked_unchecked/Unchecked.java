package practiceExercises.practice4_14_23.exceptionHandling.checked_unchecked;

public class Unchecked extends RuntimeException
{
    public static void main(String[] args)
    {
        method1();
    }
    private static void method1()
    {
        method2();
    }

    private static void method2()
    {
        method3();
    }

    private static void method3()
    {

        throw new RuntimeException();
    }
}
