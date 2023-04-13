package practiceExercises.employee_app.comHrPersonnel2_part4;

import java.time.LocalDate;
import java.time.Year;

public class Employee
{//class beg
    //-------------------------DEFINE VARIABLES----------------------
    private String name;
    private LocalDate hireDate;

    private int numberOfYearsWorked;
    private double monthlySalary;
    private int hoursWorkedPerMonth;
    private double hourlyRate;



    //-------------------------CONSTRUCTORS----------------------
    public Employee()
    {

    }
    public Employee(String name, LocalDate hireDate)
    {
        this.name = name;
        this.hireDate = hireDate;

    }

    public Employee(String name, LocalDate hireDate, double monthlySalary)
    {
        this.name = name;
        this.hireDate = hireDate;
        this.monthlySalary = monthlySalary;
    }

    public Employee(String name, LocalDate hireDate, int hoursWorkedPerMonth,
                    double hourlyRate)
    {
        this.name = name;
        this.hireDate = hireDate;
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
        this.hourlyRate = hourlyRate;
    }

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

    public double getMonthlySalary()
    {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary)
    {
        this.monthlySalary = monthlySalary;
    }

    public int getHoursWorkedPerMonth()
    {
        return hoursWorkedPerMonth;
    }

    public void setHoursWorkedPerMonth(int hoursWorkedPerMonth){
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    public double getHourlyRate(){
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }
}//class end
