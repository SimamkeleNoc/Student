package za.ca.cput.student;

public class Main {
    public static void main(String[] args) {
        UndergraduateStudent undergrad = new UndergraduateStudent.Builder()
                .setstudentID("2222222")
                .setname("Talent")
                .setemail("2222222@cput.ac.za")
                .setdepartment("Med")
                .setcreditHours(15)
                .setscholarshipAmount(5000)
                .build();

        GraduateStudent gradstu = new GraduateStudent.GradBuilder()
                .setstudentID("3333333")
                .setname("Simamkele")
                .setemail("33333@cput.ac.za")
                .setdepartment("IT")
                .setcreditHours(16)
                .setscholarshipAmount(4500)
                .build();

        undergrad.displayStudentDetails();
        gradstu.displayStudentDetails();

    }
}
