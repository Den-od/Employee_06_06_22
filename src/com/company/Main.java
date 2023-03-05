package com.company;

public class Main {
    public static void main(String[] args){
//        Employee employee1 = new Employee("Ivan", "Ivanov", 25, "team", 2500, POSITION.JUNIOR);
       EmpoyeeNamePrinter namePrinter = new EmpoyeeNamePrinter();
//        namePrinter.print(employee1);
//
        EmployeeSalaryPrinter salaryPrinter =  new EmployeeSalaryPrinter();
//        salaryPrinter.print(employee1);
//
//        Employee employee2 = new Employee("", "", 16, "AQA", 25000, POSITION.MIDDLE);
//        namePrinter.print(employee2);
//        salaryPrinter.print(employee2);
//
//        Employee employee3 = new Employee("Aleksey", "Kukushkin", 25, "AQA", 0, POSITION.SENIOR);
//        namePrinter.print(employee3);
//        salaryPrinter.print(employee3);
//
//        Employee employee4 = new Employee("Alex", "Kukuev", 25, "AQA", POSITION.SENIOR);
//        namePrinter.print(employee4);
//        salaryPrinter.print(employee4);


        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Sasha", "Rashpel", 30, "AQA", POSITION.JUNIOR);
        employees[1] = new Employee("John", "Protopopov", 45, "AQA", POSITION.MIDDLE);

//        namePrinter.print( employees[0] );
//        salaryPrinter.print( employees[0] );
//
//        namePrinter.print( employees[1] );
//        salaryPrinter.print( employees[1] );

//        for (int index = 0; index < employees.length; index++) {
//            namePrinter.print( employees [ index ] );
//            salaryPrinter.print( employees [index] );
//        }

        for ( Employee employee : employees ) {
            namePrinter.print( employee );
            salaryPrinter.print( employee );
        }
    }

}


1234567890
Next commit
Branch1 commit
Master commit2