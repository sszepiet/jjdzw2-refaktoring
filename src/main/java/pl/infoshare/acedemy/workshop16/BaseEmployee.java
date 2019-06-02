package pl.infoshare.acedemy.workshop16;

import pl.infoshare.acedemy.workshop15.Title;

public class BaseEmployee {
    private final String firstName;
    private final String lastName;
    private final Title title;

    public BaseEmployee(String firstName, String lastName, Title title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
    }

}
