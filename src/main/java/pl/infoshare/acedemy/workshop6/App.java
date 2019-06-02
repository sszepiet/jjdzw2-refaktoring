package pl.infoshare.acedemy.workshop6;

public class App {

    private static final String INFOSHARE = "infoShare Academy";
    private static final Company company = new Company(INFOSHARE);

    public static void main(final String[] args) {
        hireEmployees(company);
        listEmployees(company);
    }

    private static void hireEmployees(Company company) {
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
        for (int i = 0; i < getCompanySize(company); i++) {
            final int ordinal = incrementNumber(i);
            System.out.println(ordinal + ". " + company.employees.get(i).title);
        }
    }

    private static int getCompanySize(Company company) {
        return company.employees.size();
    }

    private static int incrementNumber(int i) {
        return i + 1;
    }

}
