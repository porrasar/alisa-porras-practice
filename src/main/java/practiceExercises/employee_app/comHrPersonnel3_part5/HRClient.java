package practiceExercises.employee_app.comHrPersonnel3_part5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HRClient
{//class beg
    public static void main(String[] args)
    {//main beg

        //------------OBJECT INSTANCES CREATED-----------------------------

        //------------department object

        //---------Employee array object and employee object

        //this code works also
//        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Mike",
//                LocalDate.of(2022,12,25),
//                1000.00);
//        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Kim",
//                LocalDate.of(2020,11,15), 1700.00);
//        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Roger ",
//                LocalDate.of(2015,10,22),
//                160, 21.00);
        //

        Employee salariedEmployee1 = new SalariedEmployee("Mike",
                LocalDate.of(2022,12,25),
                1000.00);

        Employee salariedEmployee2 = new SalariedEmployee("Kim",
                LocalDate.of(2020,11,15), 1700.00);


        Employee hourlyEmployee1 = new HourlyEmployee("Roger ",
                LocalDate.of(2015,10,22),
                160, 21.00);

        Department department = new Department("Marketing", "Ohio");


        //-----------------BUSINESS LOGIC/GENERAL METHODS---------------------

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
        System.out.println(" ");


        //get employee info
        System.out.println("-----------EMPLOYEES --------------- ");
        department.getEmployees();

    }//main end
}//class end

