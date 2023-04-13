package practiceExercises.employee_app.comHrPersonnel2_part4;

public class Department
{

    //-------------------------DEFINE VARIABLES----------------------

    private String name;
    private String location;
    private Employee[] employees;
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
    //---This is part of polymorphism: creating employee(salaried employee),
        // but using the sub class salaried employee's method
        SalariedEmployee salariedEmployee1 = new SalariedEmployee(1000.00);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee(1700.00);

        //---This is part of polymorphism: creating employee(hourly employee),
        // but using the sub class hourly employee's method
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee
                               (160,21.00);


    //-----------General Methods
    public void addEmployee (Employee employee)
    {
         employees[currentEmployeeIndex]  = employee;
         currentEmployeeIndex++;
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked(int employeeWorked)
    {
       employeeWorked++;
       return employeeWorked;
    }

    //      Compute total monthly compensation of all employees in that department
    public double computeDepartmentMonthlyTotalCompensation()
//                                   (double totalDepartmentMonthlySalary)
    {

        return 7.2;
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
