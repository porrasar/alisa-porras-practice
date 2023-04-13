package practiceExercises.employee_app.comHrPersonnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee
{
    //-------------------------DEFINE VARIABLES----------------------
    private double monthlySalary;
    //-------------------------CONSTRUCTORS----------------------
    public SalariedEmployee()
    {

    }
    public SalariedEmployee(double monthlySalary)
    {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary)
    {
        //calling my employee constructor for the parent's fields
        super(name, hireDate);

        //using the subclass (hourlyemployee) constructor for it's fields
        this.monthlySalary = monthlySalary;

    }
//-----------------BUSINESS LOGIC/GENERAL METHODS---------------------

//    SalariedEmployee salariedEmployee1 = new SalariedEmployee();
//    SalariedEmployee salariedEmployee2 = new SalariedEmployee();

    //---This is part of polymorphism: overriding the employee's class
    // computeMonthlyCompensation method
    @Override
    public double computeMonthlyCompensation()
    {
        return monthlySalary;
    }


    @Override
    public String getEmployeeInfo()
    {
        String employeeInfo = ("name = " + name + ", hireDate = " + hireDate
                + "Monthly Salary: " + monthlySalary);
        return employeeInfo;
    }

    //-------------------------GETTER/SETTERS----------------------
    public double getMonthlySalary()
    {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary)
    {
        this.monthlySalary = monthlySalary;
    }
}
