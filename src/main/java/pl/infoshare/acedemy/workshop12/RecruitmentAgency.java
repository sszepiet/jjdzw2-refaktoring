package pl.infoshare.acedemy.workshop12;

public class RecruitmentAgency {
    public RecruitmentAgency() {
    }

    Employee prepareEmployee(String title, ExperienceLevel experienceLevel) {
        return new Employee(title, experienceLevel);
    }
}
