package OopsConcept.AccessModifiers.Package2;

import OopsConcept.AccessModifiers.Package1.A;

public class C extends A {
    public static void main(String[] args) {
        C c=new C();
        System.out.println(c.protectedWord="26");
        c.protectedMethod();


    }
}
