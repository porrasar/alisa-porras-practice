package practiceExercises.practice4_14_23.exceptionHandling.checked_unchecked;

import java.io.FileNotFoundException;

public class Checked
{
    public static void main(String[] args) throws FileNotFoundException {
        method1();
    }
    private static void method1() throws FileNotFoundException {
        method2();
    }

    private static void method2() throws FileNotFoundException {
        method3();
    }

    private static void method3() throws FileNotFoundException {

        throw new FileNotFoundException();
    }
}
