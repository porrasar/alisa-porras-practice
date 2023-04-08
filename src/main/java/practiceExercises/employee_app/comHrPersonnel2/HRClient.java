package practiceExercises.employee_app.comHrPersonnel2;

import java.time.LocalDate;

public class HRClient
{//class beg
    public static void main(String[] args)
    {
        //------------OBJECT INSTANCES CREATED-----------------------------

        //---------Employee object
        Employee employee1 = new Employee
                ("Mike",
                        LocalDate.of(2022,12,25));
        Employee employee2 = new Employee("Kim",
                LocalDate.of(2020,11,15));

        //---------Salaried object
        SalariedEmployee salariedEmployee1 = new SalariedEmployee();
        SalariedEmployee salariedEmployee2 = new SalariedEmployee();

        //------Hourly Employee object over-ridding Employee object
        Employee hourlyEmployee1 = new HourlyEmployee();
        //HourlyEmployee hourlyEmployee1 = new HourlyEmployee();

        //---------Department object
        Department department = new Department();

        //-------------------------BUSINESS LOGIC-------------------
        String employeeInfo1 = employee1.getEmployeeInfo();
        String employeeWorked1 = employee1.work();
        System.out.println(employeeInfo1);
        System.out.println(employeeWorked1);
        int employeeWorked = 0;
        employeeWorked = employeeWorked + 1;

//        String employeeInfo2 = employee2.getEmployeeInfo();
//        String employeeWorked2 = employee2.work();
//        System.out.println(employeeInfo2);
//        System.out.println(employeeWorked2);

        int numberOfYearsWorked =
                employee1.computeNumberOfYearsWorkedSinceHired();
        System.out.println("Number of Years Worked: " + numberOfYearsWorked);


        department.addEmployee(employee1);
        department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked(employeeWorked);
        System.out.println("Number of Employees that worked: " + employeeWorked);

    }
}//class end
