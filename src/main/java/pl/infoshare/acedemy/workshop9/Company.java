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

    public void hireManagement() {
        final Employee cto = prepareEmployee(Employee.TITLE_CTO, ExperienceLevel.SENIOR);
        final Employee cfo = prepareEmployee(Employee.TITLE_CFO, ExperienceLevel.MID);
        final Employee coo = prepareEmployee(Employee.TITLE_COO, ExperienceLevel.MID);

        employees.add(cto);
        employees.add(cfo);
        employees.add(coo);
    }

    public void listEmployees() {
        System.out.println("--- " + name + " employees ---");
        for (int i = 0; i < employees.size(); i++) {
            final int ordinal = i + 1;
            System.out.println(ordinal + ". " + employees.get(i).title);
        }
    }

    private Employee prepareEmployee(String title, ExperienceLevel experienceLevel) {
        return new Employee(title, experienceLevel);
    }
}
