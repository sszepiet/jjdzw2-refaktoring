package pl.infoshare.acedemy.workshop14;

public class Employee {

    static final String TITLE_CTO = "CTO";
    static final String TITLE_CFO = "CFO";
    static final String TITLE_COO = "COO";

    private Title title;
    private ExperienceLevel experienceLevel;

    public Employee(Title title, ExperienceLevel experienceLevel) {
        this.title = title;
        this.experienceLevel = experienceLevel;
    }

    public Title getTitle() {
        return title;
    }

    public ExperienceLevel getExperienceLevel() {
        return experienceLevel;
    }
}
