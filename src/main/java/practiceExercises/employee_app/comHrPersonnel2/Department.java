package practiceExercises.employee_app.comHrPersonnel2;

public class Department
{

    //-------------------------DEFINE VARIABLES----------------------

    private String name;
    private String location;
    private Employee[] employees = new Employee[100];
    private int currentIndex = 0;

    //-------------------------CONSTRUCTORS----------------------
    public Department()
    {

    }
    public Department(String name, String location, Employee[] employees, int currentIndex) {
        this.name = name;
        this.location = location;
        this.employees = employees;
        this.currentIndex = currentIndex;
    }

    //-------------------------BUSINESS LOGIC---------------------

    public void addEmployee (Employee employee)
    {
        for (int i = 0; i <= currentIndex; ++i)
        {

             employees [i] = employee;
        }
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked(int employeeWorked)
    {
       employeeWorked = employeeWorked + 1;
       return employeeWorked;
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

    public int getCurrentIndes() {
        return currentIndex;
    }

    public void setCurrentIndes(int currentIndes) {
        this.currentIndex = currentIndes;
    }
}
