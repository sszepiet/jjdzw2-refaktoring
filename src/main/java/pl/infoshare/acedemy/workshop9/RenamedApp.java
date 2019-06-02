package pl.infoshare.acedemy.workshop9;

public class RenamedApp {

    private static final String INFOSHARE = "infoShare Academy";

    public static void main(final String[] args) {
        final Company company = new Company(INFOSHARE);
        company.hireManagement();
        company.listEmployees();
    }

}
