package pl.infoshare.acedemy.workshop2;

public class App {

    public static final String INFOSHARE = "infoShare Academy";

    public static void main(final String[] args) {

        Company company = new Company(INFOSHARE);

        final Employee cto = new Employee(Employee.TITLE_CTO);
        final Employee cfo = new Employee(Employee.TITLE_CFO);
        final Employee coo = new Employee(Employee.TITLE_COO);

        company.employees.add(cto);
        company.employees.add(cfo);
        company.employees.add(coo);

        System.out.println("--- " + company.name + " employees ---");
        for (int i = 0; i < company.employees.size(); i++) {
            final int ordinal = i + 1;
            System.out.println(ordinal + ". " + company.employees.get(i).title);
        }

    }

}
