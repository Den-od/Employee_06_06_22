package com.company;

public enum POSITION {

    JUNIOR(5000), // наши константы
    MIDDLE(10000), // наши константы
    SENIOR(20000); // наши константы

    public final int minSalary;

    POSITION( int minSalary ){
        this.minSalary = minSalary;
    }

}