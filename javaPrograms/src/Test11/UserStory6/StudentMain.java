package Test11.UserStory6;

public class StudentMain {
    public static void main(String[] args) {
        Student student=new Student();
        student.setAge(25);
        student.setName("Nandhan");
        System.out.println("The age of the student is "+student.getAge());
        System.out.println("The name of the student is "+student.getName());
    }
}
