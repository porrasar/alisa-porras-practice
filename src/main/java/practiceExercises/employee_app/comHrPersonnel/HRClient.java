package practiceExercises.employee_app.comHrPersonnel;

import java.time.LocalDate;

public class HRClient
{//class beg
    public static void main(String[] args)
    {//main beg
        //------------OBJECT INSTANCES CREATED-----------------------------

        //---------Department object
        Department department = new Department();

        //---------Employee array object and employee object
        Employee[] employees = new Employee[100];
        department.setEmployees(employees);

        Employee employee1 = new Employee ("Mike",
                        LocalDate.of(2022,12,25));

        department.addEmployee(employee1);  //moving data into table

        Employee employee2 = new Employee("Kim",
                LocalDate.of(2020,11,15));

        department.addEmployee(employee2);  //moving data into table

        Employee employee3 = new Employee("Roger ",
                LocalDate.of(2015,10,22));

        department.addEmployee(employee3);  //moving data into table


        //---This is part of polymorphism: creating employee(salaried employee),
        // but using the sub class salaried employee's method
        Employee salariedEmployee1 = new SalariedEmployee(1000.00);
        Employee salariedEmployee2 = new SalariedEmployee(1700.00);

        //---This is part of polymorphism: creating employee(hourly employee),
        // but using the sub class hourly employee's method
        Employee hourlyEmployee1 = new HourlyEmployee
                               (160,21.00);



        //-----------------BUSINESS LOGIC/GENERAL METHODS---------------------

        int employeeWorked = 0;
        double totalDepartmentMonthlySalary = 0.0;


        for (int i = 0; i < employees.length; i++)
        {//for beg

            if (employees[i] == null)
            {
                break;
            }
            //getting name and hire date
            String employeeInfo = employees[i].getEmployeeInfo();


            //getting if employee worked
            String workedMessage = employees[i].work();
            if (workedMessage.contains("worked"))
            {//work message for loop beg
                employeeWorked =
                department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked
                        (employeeWorked);
              totalDepartmentMonthlySalary =
                        department.computeDepartmentMonthlyTotalCompensation
                                (totalDepartmentMonthlySalary);

            }//work message for loop end


            //getting number of years employee worked
            int numberOfYearsWorked =
                     employees[i].computeNumberOfYearsWorkedSinceHired();


            //---------------------
            //PRINTING out all info gathered about employee
            System.out.println("Employee: " + employeeInfo);
            System.out.println("Employee work message: " + workedMessage);
            System.out.println("Number of Years Worked: " + numberOfYearsWorked);
             System.out.println(" ");

        }//for end


        System.out.println("Number of Employees that worked: " + employeeWorked);
        System.out.println(" ");

        double totalMonthlySalary = salariedEmployee1.computeMonthlyCompensation();
        System.out.println("Total Monthly Salary of employee 1: $"
                + salariedEmployee1.computeMonthlyCompensation());

        totalMonthlySalary = totalMonthlySalary
                + salariedEmployee2.computeMonthlyCompensation();
        System.out.println("Total Monthly Salary of employee 2: $"
                + salariedEmployee2.computeMonthlyCompensation());

        totalMonthlySalary = totalMonthlySalary
                + hourlyEmployee1.computeMonthlyCompensation();
        System.out.println("Total Monthly Salary of employee 3: $"
                + hourlyEmployee1.computeMonthlyCompensation());

        System.out.println("Total Monthly Salary of ALL employees: $"
                + totalMonthlySalary);




    }//main end
}//class end
