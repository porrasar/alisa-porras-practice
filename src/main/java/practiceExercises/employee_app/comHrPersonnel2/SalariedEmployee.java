package practiceExercises.employee_app.comHrPersonnel2;

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

    //-------------------------BUSINESS LOGIC---------------------


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
