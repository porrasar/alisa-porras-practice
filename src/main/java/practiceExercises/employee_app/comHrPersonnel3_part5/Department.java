package practiceExercises.employee_app.comHrPersonnel3_part5;


import java.util.ArrayList;
import java.util.List;

public class Department
{

    //-------------------------DEFINE VARIABLES----------------------

    private String name;
    private String location;

    private List<Employee> employees = new ArrayList<>();


    //-------------------------CONSTRUCTORS----------------------

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Department(String name, String location, List<Employee> employees)
    {
        this.name = name;
        this.location = location;
        this.employees = employees;
    }


//------------------------------OBJECT INSTANCES CREATED -------------------------------------

    //-----------------BUSINESS LOGIC/GENERAL METHODS---------------------

    //-----------General Methods
    public void addEmployee (Employee employee)
    {
         employees.add(employee);

    }
    //public Employee[] getEmployees()
    public List<Employee> getEmployees()
    {
        for (int i = 0; i < employees.size(); i++)
        {
             System.out.println(employees.get(i).getEmployeeInfo()
              + " Number of years worked: "
             + employees.get(i).computeNumberOfYearsWorkedSinceHired());
        }
        //return employees;
        return employees;
    }
    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked()
    {
        int employeeWorked = 0;

        for (int i = 0; i < employees.size(); i++)
        {
            if (employees.get(i).work().contains("worked"))
            {
                employeeWorked++;
            }
        }
        return employeeWorked;
    }

    //      Compute total monthly compensation of all employees in that department
    public double computeDepartmentMonthlyTotalCompensation()
    {
        double monthlyTotalCompensation = 0.0;

        for (int i = 0; i < employees.size() ; i++)
        {
            monthlyTotalCompensation =
                    employees.get(i).computeMonthlyCompensation();

            monthlyTotalCompensation += monthlyTotalCompensation;
        }
        return monthlyTotalCompensation;
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

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public void setEmployees(List<Employee> employees)
    {
        this.employees = employees;
    }

}



