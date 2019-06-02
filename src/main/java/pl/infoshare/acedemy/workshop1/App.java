package pl.infoshare.acedemy.workshop1;

public class App {

    public static void main(final String[] args) {

        Company company = new Company("infoShare Academy");

        final Employee cto = new Employee("CTO");
        final Employee cfo = new Employee("CFO");
        final Employee coo = new Employee("COO");

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
