package Test11.UserStory14;

public class Circle implements Shape{
    @Override
    public void calculatingTheArea(int x, int y) {
        System.out.println("THe area of the circle is "+ 3.14159 *x*x);
    }

    @Override
    public void perimeterOfShapes(int x, int y) {
        System.out.println("THe perimeter of the circle is "+ 2*3.14159 *x);
    }
}
