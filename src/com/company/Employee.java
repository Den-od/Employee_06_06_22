package com.company;

public class Employee {
    public String firstName; //имя
    public String lastName; //фамилия
    public int age; // возраст
    public String team; //команда
    public long salary; // зп
    public POSITION position; // позиция сотрудика

    public Employee(String firstName, String lastName, int age, String team, POSITION position){
        this(firstName, lastName, age, team, 0, position);
    }

    public Employee(String firstName, String lastName, int age, String team, long salary, POSITION position){

        if (salary < 0 ){
            System.out.println("Incorrect salary value");
        }

        if (age < 18){
            System.out.println("Incorrect age value");
        }

        if (firstName.isEmpty()){
            System.out.println("First name cannot be empty");
        }
        if (lastName.isEmpty()){
            System.out.println("Last name cannot be empty");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.team = team;

        if(salary == 0){
            salary = position.minSalary;
        }
//            switch (position){
//                case JUNIOR -> salary = 5000;
//                case MIDDLE -> salary = 10000;
//                case SENIOR -> salary = 20000;
//                default -> salary = -10000;
//            }

//            if (position == POSITION.JUNIOR){
//                salary = 5000;
//            }
//            if (position == POSITION.MIDDLE){
//                salary = 10000;
//            }
//            if (position == POSITION.SENIOR){
//                salary = 20000;
//            }

        this.salary = salary;
        this.position = position;
    }

}
