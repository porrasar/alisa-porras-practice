package practiceExercises.employee_app.comHrPersonnel;

import practiceExercises.employee_app.comHrPersonnel2_part4.HourlyEmployee;
import practiceExercises.employee_app.comHrPersonnel2_part4.SalariedEmployee;

public class Department
{

    //-------------------------DEFINE VARIABLES----------------------

    private String name;
    private String location;
    private Employee[] employees = new Employee[100];
    private int currentEmployeeIndex = 0;


    //-------------------------CONSTRUCTORS----------------------
    public Department()
    {

    }
    public Department(String name, String location, Employee[] employees, int currentEmployeeIndex) {
        this.name = name;
        this.location = location;
        this.employees = employees;
        this.currentEmployeeIndex = currentEmployeeIndex;

    }
//------------------------------OBJECT INSTANCES CREATED -------------------------------------



    //-----------------BUSINESS LOGIC/GENERAL METHODS---------------------

    //-----------General Methods
    public void addEmployee (Employee employee)
    {
        employees[currentEmployeeIndex]  = employee;
        currentEmployeeIndex++;
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked()
    {
//
        int employeeWorked = 0;

        for (int i = 0; i < currentEmployeeIndex; i++)
        {
            if (employees[i].work().contains("worked"))
            {
                employeeWorked++;
            }
        }
//        employeeWorked++;
        return employeeWorked;

    }

    //      Compute total monthly compensation of all employees in that department
    public double computeDepartmentMonthlyTotalCompensation()
    {
        double monthlyTotalCompensation = 0.0;

        for (int i = 0; i <currentEmployeeIndex ; i++)
        {
            monthlyTotalCompensation =
            employees[i].computeMonthlyCompensation();

            monthlyTotalCompensation += monthlyTotalCompensation;

        }

        return monthlyTotalCompensation;


    }

    //-------------------------GETTER/SETTERS----------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getCurrentIndex()
    {
        return currentEmployeeIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentEmployeeIndex = currentIndex;
    }
}
