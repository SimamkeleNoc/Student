package za.ca.cput.student;

 class GraduateStudent extends Student {
    private boolean researchAssistant;
    private int stipend;

     GraduateStudent(GradBuilder builder) {
         super(builder.studentID, builder.name, builder.email, builder.department);
         this.researchAssistant = builder.researchAssistant;
         this.stipend = builder.stipend;
     }

     @Override
     public double calculateTuition() {
         final double tuition = 4500.00;
         double Tuition = tuition;
         if (researchAssistant){
             Tuition = tuition - stipend;
         }
         return Math.max(Tuition, 0.0);
     }

     @Override
     public String getStudentType() {
         return "Graduate";
     }
     @Override
     public void displayStudentDetails() {
         super.displayStudentDetails();
         System.out.println("Research Assistant: " + researchAssistant);
         System.out.println("Stipend: R" + stipend);
     }
 }


