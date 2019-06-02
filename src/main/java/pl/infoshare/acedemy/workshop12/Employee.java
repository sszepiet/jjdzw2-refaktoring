package pl.infoshare.acedemy.workshop12;

public class Employee {

    static final String TITLE_CTO = "CTO";
    static final String TITLE_CFO = "CFO";
    static final String TITLE_COO = "COO";

    private String title;
    private ExperienceLevel experienceLevel;

    public Employee(String title, ExperienceLevel experienceLevel) {
        this.title = title;
        this.experienceLevel = experienceLevel;
    }

    public String getTitle() {
        return title;
    }

    public ExperienceLevel getExperienceLevel() {
        return experienceLevel;
    }
}
