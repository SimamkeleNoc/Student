package za.ca.cput.student;

  class UndergraduateStudent extends Student{

    private int creditHours;
    private double scholarshipAmount;

    private UndergraduateStudent(Builder builder){
        super(builder.studentID, builder.name, builder.email, builder.department);
        this.creditHours = builder.credithours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }

    }
    @Override
    public double calculateTuition() {
    final double credit = 100.00;
    double tuition = creditHours * credit - scholarshipAmount;
        return Math.max(tuition, 0.0);
    }

  @Override
  public String getStudentType() {
      return "Graduate";
  }
  @Override
  public void displayStudentDetails() {
      super.displayStudentDetails();
      System.out.println("Credit Hours: " + creditHours);
      System.out.println("Scholarship Amount: R" + scholarshipAmount);
  }







