import java.util.ArrayList;
import java.util.List;

public class Main {

    // Model class representing Ashwin's Profile
    public static class DeveloperProfile {
        private String name;
        private String year;
        private String role;
        private List<String> technicalSkills;
        private List<String> frontendSkills;

        public DeveloperProfile(String name, String year, String role) {
            this.name = name;
            this.year = year;
            this.role = role;
            this.technicalSkills = new ArrayList<>();
            this.frontendSkills = new ArrayList<>();
        }

        public void addTechnicalSkill(String skill) {
            this.technicalSkills.add(skill);
        }

        public void addFrontendSkill(String skill) {
            this.frontendSkills.add(skill);
        }

        public void displayProfile() {
            System.out.println("==========================================");
            System.out.println("           DEVELOPER PROFILE              ");
            System.out.println("==========================================");
            System.out.println("Name       : " + name);
            System.out.println("Academic   : " + year);
            System.out.println("Primary    : " + role);
            System.out.println("------------------------------------------");
            System.out.println("Core Tech  : " + String.join(", ", technicalSkills));
            System.out.println("UI & Web   : " + String.join(", ", frontendSkills));
            System.out.println("==========================================");
        }

        // Getters and Setters
        public String getName() { return name; }
        public String getYear() { return year; }
        public String getRole() { return role; }
        public List<String> getTechnicalSkills() { return technicalSkills; }
        public List<String> getFrontendSkills() { return frontendSkills; }
    }

    public static void main(String[] args) {
        // Instantiate Profile
        DeveloperProfile ashwin = new DeveloperProfile("Ashwin R", "2nd Year Student", "Frontend Developer");

        // Add Skills
        ashwin.addTechnicalSkill("Python");
        ashwin.addTechnicalSkill("SQL");

        ashwin.addFrontendSkill("HTML5");
        ashwin.addFrontendSkill("CSS3");
        ashwin.addFrontendSkill("UI/UX Design");

        // Render Output
        ashwin.displayProfile();
    }
}