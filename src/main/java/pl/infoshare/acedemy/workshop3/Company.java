package pl.infoshare.acedemy.workshop3;

import java.util.ArrayList;
import java.util.List;

public class Company {

    String name;
    List<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }
}
