package pl.infoshare.acedemy.workshop9;

import java.util.ArrayList;
import java.util.List;

public class Company {

    String name;
    List<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void hireManagement(Company company) {
        final Employee cto = prepareEmployee(Employee.TITLE_CTO);
        final Employee cfo = prepareEmployee(Employee.TITLE_CFO);
        final Employee coo = prepareEmployee(Employee.TITLE_COO);

        company.employees.add(cto);
        company.employees.add(cfo);
        company.employees.add(coo);
    }

    public void listEmployees(Company company) {
        System.out.println("--- " + company.name + " employees ---");
        for (int i = 0; i < company.employees.size(); i++) {
            final int ordinal = i + 1;
            System.out.println(ordinal + ". " + company.employees.get(i).title);
        }
    }

    private Employee prepareEmployee(String title) {
        return new Employee(title);
    }
}
