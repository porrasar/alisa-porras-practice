package practiceExercises.employee_app.comHrPersonnel;

import java.time.LocalDate;
import java.time.Year;

public class Employee
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
