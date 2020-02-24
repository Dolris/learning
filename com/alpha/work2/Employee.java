package com.alpha.work2;

public class Employee {
    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    private static int numberOfEmployees = 0;
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getTelephone() {
        return telephone;
    }

    private String firstName;
    private String lastName;
    private String occupation;
    private String telephone;
    public Employee(String firstName, String lastName, String occupation, String telephone) {
        setFirstName(firstName);
        setLastName(lastName);
        setOccupation(occupation);
        setTelephone(telephone);
        numberOfEmployees++;
    }
    public Employee(String firstName, String lastName) {
        this(firstName, lastName, "Unknown occupation", "-");
    }
    public Employee() {
        this("Unknown First name", "Unknown Last name");
    }
}
