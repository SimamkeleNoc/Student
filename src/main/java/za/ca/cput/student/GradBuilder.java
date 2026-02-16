package za.ca.cput.student;

public class GradBuilder {
    private String studentID;
    private String name;
    private String email;
    private String department;
    private boolean researchAssistant;
    private double stipend;

    public GradBuilder setStudentID(String studentID) {
        this.studentID = studentID;
        return this;
    }

    public GradBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public GradBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public GradBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    public GradBuilder setResearchAssistant(boolean researchAssistant) {
        this.researchAssistant = researchAssistant;
        return this;
    }

    public GradBuilder setStipend(double stipend) {
        this.stipend = stipend;
        return this;
    }
    public GraduateStudent build() {
        return new GraduateStudent(this);
    }
}
