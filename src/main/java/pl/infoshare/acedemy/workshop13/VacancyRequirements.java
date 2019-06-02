package pl.infoshare.acedemy.workshop13;

public class VacancyRequirements {
    private final String title;
    private final ExperienceLevel experienceLevel;

    public VacancyRequirements(String title, ExperienceLevel experienceLevel) {
        this.title = title;
        this.experienceLevel = experienceLevel;
    }

    public String getTitle() {
        return title;
    }

    public ExperienceLevel getExperienceLevel() {
        return experienceLevel;
    }

    public static class VacancyRequirementsBuilder {

        private String title;
        private ExperienceLevel experienceLevel;

        public VacancyRequirementsBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public VacancyRequirementsBuilder setExperienceLevel(ExperienceLevel experienceLevel) {
            this.experienceLevel = experienceLevel;
            return this;
        }

        public VacancyRequirements createVacancyRequirements() {
            return new VacancyRequirements(title, experienceLevel);
        }
    }
}
