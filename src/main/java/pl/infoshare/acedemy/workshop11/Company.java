package pl.infoshare.acedemy.workshop11;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private final RecruitmentAgency recruitmentAgency = new RecruitmentAgency();
    private String name;
    private List<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void hireManagement() {
        final Employee cto = recruitmentAgency.prepareEmployee(Employee.TITLE_CTO, ExperienceLevel.SENIOR);
        final Employee cfo = recruitmentAgency.prepareEmployee(Employee.TITLE_CFO, ExperienceLevel.MID);
        final Employee coo = recruitmentAgency.prepareEmployee(Employee.TITLE_COO, ExperienceLevel.MID);

        employees.add(cto);
        employees.add(cfo);
        employees.add(coo);
    }

    public void listEmployees() {
        System.out.println("--- " + name + " employees ---");
        for (int i = 0; i < employees.size(); i++) {
            final int ordinal = i + 1;
            System.out.println(ordinal + ". " + employees.get(i).getTitle());
        }
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

}
