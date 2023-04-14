package practiceExercises.practice4_14_23.exceptionHandling.exceptionHandling;

import java.time.LocalDate;

public class MyOwnArithmeticException extends ArithmeticException
{
    private LocalDate localDate = LocalDate.now();

    public MyOwnArithmeticException(LocalDate localDate) {
        this.localDate = localDate;
    }
}
