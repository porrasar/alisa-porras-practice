package practiceExercises.employee_app.comHrPersonnel3_part5;

import java.time.LocalDate;



public class SalariedEmployee extends Employee {
    //-------------------------DEFINE VARIABLES----------------------
    private double monthlySalary;

    //-------------------------CONSTRUCTORS----------------------
    public SalariedEmployee() {

    }

    public SalariedEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary1) {
        //calling my employee constructor for the parent's fields
        super(name, hireDate);
        //using the subclass (hourly employee) constructor for it's fields
        this.monthlySalary = monthlySalary1;
    }

    //-----------------BUSINESS LOGIC/GENERAL METHODS---------------------

    //---This is part of polymorphism: overriding the employee's class
    // computeMonthlyCompensation method
    @Override
    public double computeMonthlyCompensation() {

        return monthlySalary;
    }

    @Override
    public String getEmployeeInfo() {
        String employeeInfo = ("name = " + name + ", hireDate = " + hireDate
                + "," + " Monthly Salary: $" + monthlySalary + ",");
        return employeeInfo;
    }

    //-------------------------GETTER/SETTERS----------------------
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

}
