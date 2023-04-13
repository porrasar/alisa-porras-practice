package practiceExercises.employee_app.comHrPersonnel;

import java.time.LocalDate;



public class HRClient
{//class beg
    public static void main(String[] args)
    {//main beg
        //------------OBJECT INSTANCES CREATED-----------------------------

        //---------Department object


        //---------Employee array object and employee object
//        Employee[] employees = new Employee[100];
//        department.setEmployees(employees);

        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Mike",
                LocalDate.of(2022,12,25),
                1000.00);

       SalariedEmployee salariedEmployee2 = new SalariedEmployee("Kim",
              LocalDate.of(2020,11,15), 1700.00);

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Roger ",
                LocalDate.of(2015,10,22),
                160, 21.00);



        Department department = new Department();
        department.addEmployee(salariedEmployee1);  //moving data into table
        department.addEmployee(salariedEmployee2);  //moving data into table
        department.addEmployee(hourlyEmployee1);  //moving data into table

        int employeeWorked =
               department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        System.out.println("Number of Employees that worked: " + employeeWorked);


        double departmentMonthlyTotalCompensation =
                department.computeDepartmentMonthlyTotalCompensation();
        System.out.println(" ");
        System.out.println("Total Monthly Salary of ALL employees: $"
                + departmentMonthlyTotalCompensation);
        //-----------------BUSINESS LOGIC/GENERAL METHODS---------------------


//        int employeeWorked = 0;
//        double totalDepartmentMonthlySalary = 0.0;


//        for (int i = 0; i < employees.length; i++)
//        {//for beg
//
//            if (employees[i] == null)
//            {
//                break;
//            }
//            //getting name and hire date

//            String employeeInfo = employees[i].getEmployeeInfo();
//
//            //getting number of years employee worked
//            int numberOfYearsWorked =
//                    employees[i].computeNumberOfYearsWorkedSinceHired();
            //---------------------
            //PRINTING out all info gathered about employee
//            System.out.println("Employee: " + employeeInfo);
//            System.out.println("Employee work message: " + employeeWorked);
//            System.out.println("Number of Years Worked: " + numberOfYearsWorked);
//            System.out.println(" ");

 //       }//for end







    }//main end
}//class end
