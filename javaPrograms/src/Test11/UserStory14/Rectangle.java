package Test11.UserStory14;

public class Rectangle implements Shape{
    @Override
    public void calculatingTheArea(int x, int y) {
        System.out.println("The area of the rectangle is "+ x*y);
    }

    @Override
    public void perimeterOfShapes(int x, int y) {
        System.out.println("The perimeter of the rectangle "+ (x*y) *2);
    }
}
