package pl.infoshare.acedemy.workshop10;

public class Employee {

    static final String TITLE_CTO = "CTO";
    static final String TITLE_CFO = "CFO";
    static final String TITLE_COO = "COO";

    String title;
    ExperienceLevel experienceLevel;

    public Employee(String title, ExperienceLevel experienceLevel) {
        this.title = title;
        this.experienceLevel = experienceLevel;
    }
}
