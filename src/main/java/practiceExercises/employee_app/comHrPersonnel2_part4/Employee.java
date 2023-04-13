package practiceExercises.employee_app.comHrPersonnel2_part4;

import java.time.LocalDate;
import java.time.Year;



public abstract class Employee
{//class beg
    //-------------------------DEFINE VARIABLES----------------------
    private String name;
    private LocalDate hireDate;

    private int numberOfYearsWorked;

    //-------------------------CONSTRUCTORS----------------------
    public Employee()
    {

    }
    public Employee(String name, LocalDate hireDate)
    {
        this.name = name;
        this.hireDate = hireDate;

    }

    //-----------------BUSINESS LOGIC/GENERAL METHODS---------------------

    public String getEmployeeInfo()
    {
        String employeeInfo = ("name = " + name + ", hireDate = " + hireDate);

        return employeeInfo;
    }
    public String work()
    {
        return name +  " worked.";
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
        return 0.0;
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



//    //-------------------------DEFINE VARIABLES----------------------
//    String name;
//    LocalDate hireDate;
//
//    int numberOfYearsWorked;
//
//    private double monthlySalary;
//    private int hoursWorkedPerMonth;
//    private double hourlyRate;
//
//
//    //-------------------------CONSTRUCTORS----------------------
//    public Employee()
//    {
//
//    }
//    public Employee(String name, LocalDate hireDate)
//    {
//        this.name = name;
//        this.hireDate = hireDate;
//
//    }
//
//    public Employee(String name, LocalDate hireDate, int hoursWorkedPerMonth, double hourlyRate)
//    {
//        this.name = name;
//        this.hireDate = hireDate;
//        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
//        this.hourlyRate = hourlyRate;
//    }
//
//    public Employee(String name, LocalDate hireDate, double monthlySalary)
//    {
//        this.name = name;
//        this.hireDate = hireDate;
//        this.monthlySalary = monthlySalary;
//    }
////-----------------BUSINESS LOGIC/GENERAL METHODS---------------------
//
//    public abstract String getEmployeeInfo();
//
//    public String work()
//    {
//        String workMessage = name +  " worked.";
//        return workMessage;
//    }
//
//    public int computeNumberOfYearsWorkedSinceHired()
//    {
//        int currentYear = Year.now().getValue();
//
//        LocalDate employeeHireDate = getHireDate();
//        int yearHired = employeeHireDate.getYear();
//
//        numberOfYearsWorked =  currentYear - yearHired;
//        return numberOfYearsWorked;
//    }
//
//    public abstract double computeMonthlyCompensation();
//
//
//    //-------------------------GETTER/SETTERS----------------------
//
//    public String getName()
//    {
//        return name;
//    }
//    public void setName(String name)
//    {
//        this.name = name;
//    }
//    public LocalDate getHireDate()
//    {
//        return hireDate;
//    }
//    public void setHireDate(LocalDate hireDate)
//    {
//        this.hireDate = hireDate;
//    }
//

}//class end
