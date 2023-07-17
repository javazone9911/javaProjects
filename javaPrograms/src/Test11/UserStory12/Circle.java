package Test11.UserStory12;

public class Circle extends Shape{

    @Override
    void noOfSides(int sides) {
        System.out.println("The circle has "+ sides);
    }

    @Override
    void shape(String shape) {
        System.out.println("The circle is in  "+ shape);
    }

    @Override
    void shapeExample(String looksLike) {
        System.out.println("The looks like "+ looksLike);
    }
}
