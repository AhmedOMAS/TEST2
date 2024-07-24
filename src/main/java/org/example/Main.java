package org.example;

import com.example.models.Company;
import com.example.models.Department;
import com.example.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create departments
        Department hr = new Department("HR", new ArrayList<>());
        Department it = new Department("IT", new ArrayList<>());

        // Create employees
        Employee emp1 = new Employee("Alice", 30, "E001", hr);
        Employee emp2 = new Employee("Bob", 25, "E002", it);
        Employee emp3 = new Employee("Charlie", 28, "E003", it);

        // Add employees to departments
        hr.getEmployees().add(emp1);
        it.getEmployees().add(emp2);
        it.getEmployees().add(emp3);

        // Create company
        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(it);
        Company company = new Company("Tech Corp", departments);

        // Print company structure
      //  System.out.println(company);
    }
}
