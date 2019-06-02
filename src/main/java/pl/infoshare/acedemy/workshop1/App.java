package pl.infoshare.acedemy.workshop1;

public class App {

    public static void main(final String[] args) {

        Company company = new Company("infoShare Academy");

        company.employees.add(new Employee("CTO"));
        company.employees.add(new Employee("CFO"));
        company.employees.add(new Employee("COO"));

        System.out.println("--- " + company.name + " employees ---");
        for (int i = 0; i < company.employees.size(); i++) {
            final int ordinal = i + 1;
            System.out.println(ordinal + ". " + company.employees.get(i).title);
        }

    }

}
