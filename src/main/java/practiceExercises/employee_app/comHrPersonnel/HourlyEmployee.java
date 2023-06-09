package practiceExercises.employee_app.comHrPersonnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee
{
    //-------------------------DEFINE VARIABLES----------------------

    private int hoursWorkedPerMonth;
    private double hourlyRate;

    //-------------------------CONSTRUCTORS----------------------
    public HourlyEmployee() {

    }

    public HourlyEmployee(int hoursWorkedPerMonth, double hourlyRate) {
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
        this.hourlyRate = hourlyRate;
    }

    public HourlyEmployee(String name, LocalDate hireDate, int hoursWorkedPerMonth, double hourlyRate)
    {
        super(name, hireDate);
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
        this.hourlyRate = hourlyRate;
    }
//-----------------BUSINESS LOGIC/GENERAL METHODS---------------------


    //---This is part of polymorphism: overriding the employee's class
    // computeMonthlyCompensation method
    @Override
    public double computeMonthlyCompensation() {

        return hourlyRate * hoursWorkedPerMonth;
    }

    //-------------------------GETTER/SETTERS----------------------
    public int getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public void setHoursWorkedPerMonth(int hoursWorkedPerMonth) {
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}