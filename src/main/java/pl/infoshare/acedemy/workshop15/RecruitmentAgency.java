package pl.infoshare.acedemy.workshop15;

public class RecruitmentAgency {
    public RecruitmentAgency() {
    }

    Employee prepareEmployee(VacancyRequirements vacancyRequirements) {
        return new Employee(Title.valueOf(vacancyRequirements.getTitle()), vacancyRequirements.getExperienceLevel());
    }
}
