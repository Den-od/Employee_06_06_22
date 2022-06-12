package com.company;

public class EmpoyeeNamePrinter implements Printer{
    @Override
    public void print(Employee employee) {
        System.out.println("First name: " + employee.firstName);
        System.out.println("Last name: " + employee.lastName);
        System.out.println("Position: " + employee.position);
    }
}
