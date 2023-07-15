package OopsConcept.Interface;

public class HeadPhones implements AudioDevice{


    @Override
    public void start() {
        System.out.println("playing audio in headphones");
    }

    @Override
    public void backward() {
        System.out.println("backward audio song in headphone");
    }

    @Override
    public void stop() {
        System.out.println("stoping audio in the headphone");
    }

    @Override
    public void volumeUp() {
        System.out.println("increasing the volume in the headphone");
    }

    @Override
    public void volumeDown() {
        System.out.println("Decresing the volume in the headphone");
    }
}
