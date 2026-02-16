package za.ca.cput.student;

public abstract class StudentBuilder  {
    public String studentID;
    public String name;
    public String email;
    public String department;

    public StudentBuilder studentID(String studentID){
        this.studentID = studentID;
        return this;
    }
    public StudentBuilder name(String name) {
        this.name = name;
        return this;
    }
    public StudentBuilder email(String email) {
        this.email= email;
        return this;
    }
    public StudentBuilder department(String department) {
        this.department = department;
        return this;
    }
    public abstract Student build();
}
