package practiceExercises.employee_app.comHrPersonnel2;

import java.time.LocalDate;

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
    //-------------------------BUSINESS LOGIC---------------------
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
       int currentYear = 2023;
       int hiredYear = 2015;


        numberOfYearsWorked =  currentYear - hiredYear;
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
