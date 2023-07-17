package OopsConcept.AccessModifiers.Package1;

public class B {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.defaultWord = "Hello world!");
        a.defaultMethod();
        System.out.println(a.protectedWord = "Hello world!");
        a.protectedMethod();
        System.out.println(a.publicWord="Good morning");
        a.publicMethod();
        
    }
}
