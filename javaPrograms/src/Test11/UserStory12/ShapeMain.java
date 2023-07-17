package Test11.UserStory12;

public class ShapeMain {
    public static void main(String[] args) {
        Shape shape=new Circle();
        shape.shapeExample("sun");
        shape.shape("round");
        shape.noOfSides(0);
        Shape shape1=new Rectangle();
        shape1.shapeExample("table");
        shape1.shape("board");
        shape1.noOfSides(4);
        Shape shape2=new Square();
        shape2.shapeExample("ice-cube");
        shape2.shape("box");
        shape2.noOfSides(4);
    }
}
