package pl.infoshare.acedemy.workshop13;

public class RecruitmentAgency {
    public RecruitmentAgency() {
    }

    Employee prepareEmployee(VacancyRequirements vacancyRequirements) {
        return new Employee(vacancyRequirements.getTitle(), vacancyRequirements.getExperienceLevel());
    }
}
