package za.ca.cput.student;


 abstract class Student {
    protected String studentID;
    protected String name;
    protected String email;
    protected  String department;

    protected Student(StudentBuilder builder){
        this.studentID =builder.studentID;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
    }

    public abstract double calculateTuition();
    public abstract String getStudentType();

    public void displayStudentDetails(){
            System.out.println("Student ID: " + studentID);
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Department: " + department);
            System.out.println("Student Type: " + getStudentType());
            System.out.println("Tuition: " + calculateTuition());

    };

}
