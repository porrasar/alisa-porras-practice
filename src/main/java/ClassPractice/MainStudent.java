package ClassPractice;

public class MainStudent
        //------------third class lab exercise for 3/31/23
{//class beg
//   [In-Class Lab exercise: Constructors] - We will do this right after we finish the coverage of “Constructors” (slide #38-#45)
//Refactor “StudentRecord” class to add multiple constructors
//A constructor that takes one argument of “name”
//A constructor that takes 2 arguments of “name” and “mathScore”
//A constructor that takes 4 arguments of “name”, “mathScore”, “scienceScore”, and “algebraScore”
//For the constructors that that 2 arguments and 4 arguments, use “this(..)” method appropriately
//Refactor “Main” class to use these instructors instead of setter methods when creating “StudentRecord” object instances
    public static void main(String[] args)
    {//main beg

        //student 1 is using constructor with 4 aruguments
        StudentRecord studentRecord1 =
                new StudentRecord("Suzy", 4.5,5.8,4.5);

        //student 2 is using constructor with 2 aruguments
        StudentRecord studentRecord2 =
                new StudentRecord("Lynn",2.5);
        studentRecord2.setSciScore(7.3);
        studentRecord2.setAlgebraScore(9.2);

        //student 3 is using constructor with 1 aruguments
        StudentRecord studentRecord3 =
                new StudentRecord("Toby");
        studentRecord3.setMathScore(5.3);
        studentRecord3.setSciScore(7.3);
        studentRecord3.setAlgebraScore(9.2);



        //-----------------------CALL PRINT METHODS----------------------------------

        //----------------------defining variable/fields ------------------------
        String holdStudentName;
        double holdStudentAverage;

        //------------printing student 1 --------------------------------------

        //          getting the name and average of student 1, to use in print methods
        holdStudentName = studentRecord1.getName();
        holdStudentAverage =
               (studentRecord1.getMathScore() +
                studentRecord1.getSciScore() +
                studentRecord1.getAlgebraScore()) / 3;
        //           calling print methods
        studentRecord1.printName(holdStudentName);
        studentRecord1.printNameAverage(holdStudentName, holdStudentAverage);

        //------------printing student 2 --------------------------------------

        //          getting the name and average of student 2, to use in print methods
        holdStudentName = studentRecord2.getName();
        holdStudentAverage =
                (studentRecord2.getMathScore() +
                 studentRecord2.getSciScore() +
                 studentRecord2.getAlgebraScore()) / 3;


        //           calling print methods
//        studentRecord2.printName(holdStudentName);
//        studentRecord2.printNameAverage(holdStudentName, holdStudentAverage);



        //System.out.printf("Student 1: %.2f\n", studentRecord1.getStudentAverage());
        //System.out.printf("Student 2: %.2f\n", studentRecord2.getStudentAverage());
        //System.out.printf("Student 2: %.2f%%\n", studentRecord2.getStudentAverage());

       // System.out.println("in main, number of students: " + );
        //System.out.printf("Student:  1: %.2f\n", studentRecord1.getStudentAverage());




    }//main end

}//class end

//------------second class lab exercise for 3/31/23
//
//    public static void main(String[] args)
//    {//main beg
//        StudentRecord studentRecord1 = new StudentRecord();
//        studentRecord1.setName("Suzy");
//        studentRecord1.setMathScore(4.5);
//        studentRecord1.setSciScore(5.8);
//        studentRecord1.setAlgebraScore(5.1);
//
//
//        StudentRecord studentRecord2 = new StudentRecord();
//        studentRecord2.setName("Lynn");
//        studentRecord2.setMathScore(2.5);
//        studentRecord2.setSciScore(7.3);
//        studentRecord2.setAlgebraScore(9.2);
//
//        //-----------------------CALL PRINT METHODS----------------------------------
//
//        //----------------------defining variable/fields ------------------------
//        String holdStudentName;
//        double holdStudentAverage;
//
//        //------------printing student 1 --------------------------------------
//
//        //          getting the name and average of student 1, to use in print methods
//        holdStudentName = studentRecord1.getName();
//        holdStudentAverage =
//                (studentRecord1.getMathScore() +
//                        studentRecord1.getSciScore() +
//                        studentRecord1.getAlgebraScore()) / 3;
//        //           calling print methods
//        studentRecord1.printName(holdStudentName);
//        studentRecord1.printNameAverage(holdStudentName, holdStudentAverage);
//
//        //------------printing student 2 --------------------------------------
//
//        //          getting the name and average of student 2, to use in print methods
//        holdStudentName = studentRecord2.getName();
//        holdStudentAverage =
//                (studentRecord2.getMathScore() +
//                        studentRecord2.getSciScore() +
//                        studentRecord2.getAlgebraScore()) / 3;
//
//
//        //           calling print methods
//        studentRecord2.printName(holdStudentName);
//        studentRecord2.printNameAverage(holdStudentName, holdStudentAverage);
//
//
//
//        //System.out.printf("Student 1: %.2f\n", studentRecord1.getStudentAverage());
//        //System.out.printf("Student 2: %.2f\n", studentRecord2.getStudentAverage());
//
//        // System.out.println("Number of students: " + StudentRecord.getNumberOfStudents());
//        //System.out.printf("Student:  1: %.2f\n", studentRecord1.getStudentAverage());
//
//
//
//
//    }//main end
