package pl.infoshare.acedemy.workshop3;

public class App {

    private static final String INFOSHARE = "infoShare Academy";
    private static final Company company = new Company(INFOSHARE);

    public static void main(final String[] args) {

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
