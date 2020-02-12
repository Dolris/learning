package com.alpha.work2;

public class Runner {
    public void run() {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Горпина", "Болиголова");
        Employee e3 = new Employee("Пелагея", "Стражденна", "Спеціаліст бек-офісу", "0666111111");
        System.out.println("Employees: " + Employee.getNumberOfEmployees());
    }
}
