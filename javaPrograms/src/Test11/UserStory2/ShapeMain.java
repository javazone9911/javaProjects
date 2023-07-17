package Test11.UserStory2;

public class ShapeMain {
    public static void main(String[] args) {
        Shape shape=new Shape(0,"null");
        System.out.println(shape.shape+" sides "+ shape.noOfSides+ " zero");
        Circle circle=new Circle(0," circle");
        System.out.println(circle.noOfSides+ " sides in a circle"+circle.shape+ " it is round in shape");
        Square square=new Square(4,"square");
        System.out.println(square.noOfSides+" number of sides "+ square.shape+" it has box shape");
        Rectangle rectangle=new Rectangle(4,"rectangle");
        System.out.println(rectangle.noOfSides+" no of sides "+rectangle.shape+" it is opposite equal sides");
    }
}
