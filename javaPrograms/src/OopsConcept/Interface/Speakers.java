package OopsConcept.Interface;

public class Speakers implements AudioDevice{
    @Override
    public void start() {
        System.out.println("start the speaker");
    }

    @Override
    public void backward() {
        System.out.println("backward the speaker");
    }

    @Override
    public void stop() {
        System.out.println("stop the speaker");
    }

    @Override
    public void volumeUp() {
        System.out.println("increase the volume in the speaker");
    }

    @Override
    public void volumeDown() {
        System.out.println("decrease the volume in the speaker");
    }
}
