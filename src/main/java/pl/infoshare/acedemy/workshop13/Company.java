package pl.infoshare.acedemy.workshop13;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private final RecruitmentAgency recruitmentAgency = new RecruitmentAgency();
    private String name;
    private List<Employee> employees;
    private final Address address;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
        address = new Address.AddressBuilder().setStreet("Puławska").setNumber(2).setCity("Warszawa").createAddress();
    }

    public void hireManagement() {
        final VacancyRequirements ctoRequirements = new VacancyRequirements.VacancyRequirementsBuilder()
                        .setTitle(Employee.TITLE_CTO)
                        .setExperienceLevel(ExperienceLevel.SENIOR)
                        .createVacancyRequirements();
        final Employee cto = recruitmentAgency.prepareEmployee(ctoRequirements);

        final VacancyRequirements cfoRequirements = new VacancyRequirements.VacancyRequirementsBuilder()
                .setTitle(Employee.TITLE_CFO)
                .setExperienceLevel(ExperienceLevel.MID)
                .createVacancyRequirements();
        final Employee cfo = recruitmentAgency.prepareEmployee(cfoRequirements);

        final VacancyRequirements cooRequirements =
                new VacancyRequirements.VacancyRequirementsBuilder()
                        .setTitle(Employee.TITLE_COO)
                        .setExperienceLevel(ExperienceLevel.MID)
                        .createVacancyRequirements();
        final Employee coo = recruitmentAgency.prepareEmployee(cooRequirements);

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
