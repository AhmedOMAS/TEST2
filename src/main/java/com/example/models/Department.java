package com.example.models;

import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;

    // Constructor
    public Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
