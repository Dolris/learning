package com.codespace.task2_2;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getAge() {return age;}
    public void setFirstName(String firstName) {this.firstName = firstName; }
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setAge(int age) {
        if (!(age >=1 && age <= 120) ) throw new InvalidAgeException("Age not valid");
        this.age = age;}

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
