package practiceExercises.employee_app.comHrPersonnel;

import java.time.LocalDate;
import java.time.Year;

public abstract class Employee
{//class beg
    //-------------------------DEFINE VARIABLES----------------------
    String name;
    LocalDate hireDate;

    int numberOfYearsWorked;


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

    public abstract String getEmployeeInfo();

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

    public abstract double computeMonthlyCompensation();


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


}//class end
