package pl.infoshare.acedemy.workshop17;

import pl.infoshare.acedemy.workshop15.Title;

public abstract class BaseEmployee implements Employee {
    private final String firstName;
    private final String lastName;
    private final Title title;

    public BaseEmployee(String firstName, String lastName, Title title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
    }

    @Override
    public abstract void work();
}
