package com.example.models;

public class Employee extends Person {
    private String employeeId;
    private Department department;

    // Constructor
    public Employee(String name, int age, String employeeId, Department department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    // Getters and Setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", department=" + department +
                "} " + super.toString();
    }
}
