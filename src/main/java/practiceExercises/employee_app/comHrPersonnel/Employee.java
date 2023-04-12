package practiceExercises.employee_app.comHrPersonnel;

import java.time.LocalDate;
import java.time.Year;

public class Employee
{//class beg
    //-------------------------DEFINE VARIABLES----------------------
    private String name;
    private LocalDate hireDate;



    private int numberOfYearsWorked;
    //private double monthlySalary;
    //-------------------------CONSTRUCTORS----------------------
    public Employee()
    {

    }
    public Employee(String name, LocalDate hireDate)
    {
        this.name = name;
        this.hireDate = hireDate;

    }

//    public Employee(String name, LocalDate hireDate, double monthlySalary)
//    {
//        this.name = name;
//        this.hireDate = hireDate;
//        this.monthlySalary = monthlySalary;
//    }

    //-----------------BUSINESS LOGIC/GENERAL METHODS---------------------

    public String getEmployeeInfo()
    {
        String employeeInfo = ("name = " + name + ", hireDate = " + hireDate);
//                                   + ",  monthly salary: $" + monthlySalary);
        return employeeInfo;
    }
    public String work()
     {
        String workMessage = name +  " worked.";
        return workMessage;
    }

    public int computeNumberOfYearsWorkedSinceHired()
    {
        int currentYear = Year.now().getValue();

        LocalDate employeeHireDate = getHireDate();
        int yearHired = employeeHireDate.getYear();

        numberOfYearsWorked =  currentYear - yearHired;
        return numberOfYearsWorked;
    }

    public double computeMonthlyCompensation()
    {
       return 7.2;
    }

    //-------------------------GETTER/SETTERS----------------------

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public LocalDate getHireDate()
    {
        return hireDate;
    }
    public void setHireDate(LocalDate hireDate)
    {
        this.hireDate = hireDate;
    }

//    public double getMonthlySalary() {
//        return monthlySalary;
//    }
//
//    public void setMonthlySalary(double monthlySalary) {
//        this.monthlySalary = monthlySalary;
//    }
}//class end
