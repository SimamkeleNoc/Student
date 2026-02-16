package za.ca.cput.student;

public static class Builder {
    private String studentID;
    private String name;
    private String email;
    private String department;
    private int creditHours;
    private double scholarshipAmount;

    public Builder setstudentID(String studentID) {
        this.studentID = studentID;
        return this;
    }

    public Builder setname(String name) {
        this.name = name;
        return this;
    }
    public Builder setemail(String email) {
        this.email = email;
        return this;
    }

    public Builder setdepartment(String department) {
        this.department = department;
        return this;
    }

    public Builder setcreditHours(int creditHours) {
        this.creditHours = creditHours;
        return this;
    }

    public Builder setscholarshipAmount(double scholarshipAmount) {
        this.scholarshipAmount = scholarshipAmount;
        return this;
    }
    public UndergraduateStudent build() {
        return new UndergraduateStudent(this);
    }
}
