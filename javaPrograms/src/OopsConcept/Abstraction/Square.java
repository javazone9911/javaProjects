package OopsConcept.Abstraction;

public class Square extends Shape{
    @Override
    void draw(String paint) {
        System.out.println("square has"+paint +"four sides");
    }
}
