package Test11.UserStory4;

public class FlyableMain {
    public static void main(String[] args) {
        Flyable flyable=new Airplane();
        flyable.fly();
        Flyable flyable1=new Bird();
        flyable1.fly();
    }
}
