package Test11.UserStory10;

public class PersonMain {
    public static void main(String[] args) {
        Person person=new Person("kalyan",96);
     //   person.setAge(32);
     //   person.setName("kumar");
        System.out.println("The person age is "+person.getAge());
        System.out.println("The person name is "+person.getName());
    }
}
