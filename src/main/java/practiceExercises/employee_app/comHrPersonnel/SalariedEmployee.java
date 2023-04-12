package practiceExercises.employee_app.comHrPersonnel;

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
