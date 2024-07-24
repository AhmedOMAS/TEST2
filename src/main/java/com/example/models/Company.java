package com.example.models;

import java.util.List;

public class Company {
    private String name;
    private List<Department> departments;

    // Constructor
    public Company(String name, List<Department> departments) {
        this.name = name;
        this.departments = departments;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", departments=" + departments +
                '}';
    }
}
