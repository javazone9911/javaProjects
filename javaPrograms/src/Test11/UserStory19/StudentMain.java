package Test11.UserStory19;

public class StudentMain {
    public static void main(String[] args) {
        Student student=new Student();
        student.setAge(65);
        student.setGrade("b-grade");
        student.setName("kiran bedii");
        System.out.println("you got "+student.getGrade());
        System.out.println("Your name is "+student.getName());
        System.out.println("Your age is "+student.getAge());
    }
}
