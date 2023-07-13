package Methods.Methods_with_parameters_but_no_return_values;

public class Grade {

  // AL-43  As a teacher, I want to be able to assign grades to students by invoking the "assignGrade" method and passing the student ID and grade value as parameters.

      public void assignGrade(int studentId,String gradeValue){
          System.out.println("The studentid = " + studentId + "  grade is " + gradeValue);
      }

}
