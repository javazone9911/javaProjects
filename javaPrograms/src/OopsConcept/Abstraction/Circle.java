package OopsConcept.Abstraction;

public class Circle extends Shape{
    @Override
    void draw(String paint) {
        System.out.println("circle is "+ paint+"on the board" );
    }
}
