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


        //creating an instance of the subclasses
        // (salaried employee and hourly employee) using the
        // parent (Employee) as a reference type
//        Employee employee1 = new SalariedEmployee("Mike",
//                        LocalDate.of(2022,12,25),
//                1000.00);
//        department.addEmployee(employee1);  //moving data into table
//
//        Employee employee2 = new SalariedEmployee("Kim",
//              LocalDate.of(2020,11,15),
//                1700.00);
//        department.addEmployee(employee2);  //moving data into table

        Employee employee3 = new HourlyEmployee("Roger ",
                LocalDate.of(2015,10,22),
                160, 21.00);
        department.addEmployee(employee3);  //moving data into table


        //-----------------BUSINESS LOGIC/GENERAL METHODS---------------------

        int employeeWorked = 0;
        double totalDepartmentMonthlySalary = 0.0;
        String employeeInfo = null;


        for (int i = 0; i < employees.length; i++)
        {//for beg

            if (employees[i] == null)
            {
                break;
            }
            //getting name and hire date
            //String employeeInfo = employees[i].getEmployeeInfo();



            //getting if employee worked
            String workedMessage = employees[i].work();
            if (workedMessage.contains("worked"))
            {//work message for loop beg
                employeeWorked =
                department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked
                        (employeeWorked);

                if (employees[i] instanceof SalariedEmployee)
                {
                    employeeInfo = employees[i].getEmployeeInfo();
                }
                else
                if (employees[i] instanceof HourlyEmployee)
                {
                    employeeInfo = employees[i].getEmployeeInfo();
                }



                totalDepartmentMonthlySalary =
                    department.computeDepartmentMonthlyTotalCompensation();
              //                                (totalDepartmentMonthlySalary);

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

//        double totalMonthlySalary = salariedEmployee1.computeMonthlyCompensation();
//        System.out.println("Total Monthly Salary of employee 1: $"
//                + salariedEmployee1.computeMonthlyCompensation());
//
//        totalMonthlySalary = totalMonthlySalary
//                + salariedEmployee2.computeMonthlyCompensation();
//        System.out.println("Total Monthly Salary of employee 2: $"
//                + salariedEmployee2.computeMonthlyCompensation());
//
//        totalMonthlySalary = totalMonthlySalary
//                + hourlyEmployee1.computeMonthlyCompensation();
//        System.out.println("Total Monthly Salary of employee 3: $"
//                + hourlyEmployee1.computeMonthlyCompensation());
//
//        System.out.println("Total Monthly Salary of ALL employees: $"
//                + totalMonthlySalary);

        System.out.println("Total Monthly Salary of ALL employees: $"
                        + totalDepartmentMonthlySalary);


    }//main end
}//class end
