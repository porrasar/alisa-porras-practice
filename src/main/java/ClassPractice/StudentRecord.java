package ClassPractice;

import org.w3c.dom.ls.LSOutput;

public class StudentRecord
{//class beg

    //------------third class lab exercise for 3/31/23
    //--------------Defining variables/fields------------
    private String name;
    private double mathScore;
    private double sciScore;
    private double algebraScore;

    private static int numberOfStudents;

    //----------------------------CONSTRUCTORS --------------------------------------------
    public StudentRecord()
    {//constructor adding number of students

        numberOfStudents++;

    }

    public StudentRecord(String name)
    {//constructor with 1 argument: name
        this.name = name;

    }

    public StudentRecord(String name, double mathScore)
    {//constructor with 2 arguments: name and mathscore
        this.name = name;
        this.mathScore = mathScore;
        numberOfStudents++;

    }

    public StudentRecord(String name, double mathScore, double sciScore, double algebraScore)
    {//constructor with 4 arguments: name, math score, science score, and algebra score
        this.name = name ;
        this.mathScore = mathScore;
        this.sciScore = sciScore;
        this.algebraScore = algebraScore;
        numberOfStudents++;


    }


//    --------- GETTER AND SETTERS--------------------
    //--------Name  getter and setter-----------------
    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //----------------Math score getter and setter-----------------
    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    //----------Science score  getter and setter-----------------
    public double getSciScore() {
        return sciScore;
    }

    public void setSciScore(double sciScore) {
        this.sciScore = sciScore;
    }

    //----------Algebra score  getter and setter-----------------
    public double getAlgebraScore() {
        return algebraScore;
    }

    public void setAlgebraScore(double algebraScore) {
        this.algebraScore = algebraScore;
    }




    //----------GET Number of Students-----------------
    public static int getNumberOfStudents()
    {
        System.out.println("returning before numberofstudents" + numberOfStudents);
        return numberOfStudents;

    }

    //----------Calculate student average-------------
    public double getStudentAverage() {
        double average = 0;
        average = (mathScore + sciScore + algebraScore) / 3;

        return average;
    }

    //--------------------PRINT METHODS-------------------------

    //---------------Print name method------------------------

    public void printName(String holdStudentName)
    {

        System.out.println("Student from printName method: " +  holdStudentName);

    }
    //---------------Print name and average method-------------
    public void printNameAverage(String holdStudentName, double holdStudentAverage)
    {
        System.out.println("Student from printNameAverage method: " + holdStudentName +
                //System.out.printf("Student 1: %.2f\n", studentRecord1.getStudentAverage());
                " has an average of:  " + holdStudentAverage);
        System.out.println(" ");
        System.out.println("returning before numberofstudents" + numberOfStudents);
    }
}//class end



//------------second class lab exercise for 3/31/23
//    //--------------Defining variables/fields------------
//    private String name;
//    private double mathScore;
//    private double sciScore;
//    private double algebraScore;
//
//    private static int numberOfStudents;
//
//    //------Constructor -Counting Number of Students -----------------
//    public StudentRecord() {
//        numberOfStudents++;
//    }
//
//    //--------- GETTER AND SETTERS--------------------
//    //--------Name  getter and setter-----------------
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    //----------------Math score getter and setter-----------------
//    public double getMathScore() {
//        return mathScore;
//    }
//
//    public void setMathScore(double mathScore) {
//        this.mathScore = mathScore;
//    }
//
//    //----------Science score  getter and setter-----------------
//    public double getSciScore() {
//        return sciScore;
//    }
//
//    public void setSciScore(double sciScore) {
//        this.sciScore = sciScore;
//    }
//
//    //----------Algebra score  getter and setter-----------------
//    public double getAlgebraScore() {
//        return algebraScore;
//    }
//
//    public void setAlgebraScore(double algebraScore) {
//        this.algebraScore = algebraScore;
//    }
//
//
//    //----------Number of Students-----------------
//    public static int getNumberOfStudents() {
//        return numberOfStudents;
//    }
//
//    //----------Calculate student average-------------
//    public double getStudentAverage() {
//        double average = 0;
//        average = (mathScore + sciScore + algebraScore) / 3;
//
//        return average;
//    }
//
//    //--------------------PRINT METHODS-------------------------
//
//    //---------------Print name method------------------------
//
//    public void printName(String holdStudentName)
//    {
//
//        System.out.println("Student from printName method: " +  holdStudentName);
//
//    }
//    //---------------Print name and average method-------------
//    public void printNameAverage(String holdStudentName, double holdStudentAverage)
//    {
//        System.out.println("Student from printNameAverage method: " + holdStudentName +
//                //System.out.printf("Student 1: %.2f\n", studentRecord1.getStudentAverage());
//                " has an average of:  " + holdStudentAverage);
//        System.out.println(" ");
//    }
