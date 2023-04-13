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

    public SalariedEmployee(String name, LocalDate hireDate,double monthlySalary1)
    {
        super(name, hireDate);
        this.monthlySalary = monthlySalary1;
    }

    //-----------------BUSINESS LOGIC/GENERAL METHODS---------------------

    //---This is part of polymorphism: overriding the employee's class
    // computeMonthlyCompensation method
    @Override
    public double computeMonthlyCompensation()
    {

        return monthlySalary;
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

