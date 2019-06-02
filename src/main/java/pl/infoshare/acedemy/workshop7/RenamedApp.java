package pl.infoshare.acedemy.workshop7;

public class RenamedApp {

    private static final String INFOSHARE = "infoShare Academy";
    private static final Company company = new Company(INFOSHARE);

    public static void main(final String[] args) {
        hireManagement(company);
        listEmployees(company);
    }

    private static void hireManagement(Company company) {
        final Employee cto = prepareEmployee(Employee.TITLE_CTO);
        final Employee cfo = prepareEmployee(Employee.TITLE_CFO);
        final Employee coo = prepareEmployee(Employee.TITLE_COO);

        company.employees.add(cto);
        company.employees.add(cfo);
        company.employees.add(coo);
    }

    private static Employee prepareEmployee(String title) {
        return new Employee(title);
    }

    private static void listEmployees(Company company) {
        System.out.println("--- " + company.name + " employees ---");
        for (int i = 0; i < company.employees.size(); i++) {
            final int ordinal = i + 1;
            System.out.println(ordinal + ". " + company.employees.get(i).title);
        }
    }

}
