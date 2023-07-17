package Test11.UserStory12;

public class Rectangle extends Shape {
    @Override
    void noOfSides(int sides) {
        System.out.println("The Rectangle has "+ sides);
    }

    @Override
    void shape(String shape) {
        System.out.println("The Rectangle is in  "+ shape);
    }

    @Override
    void shapeExample(String looksLike) {
        System.out.println("The looks like "+ looksLike);
    }
}
