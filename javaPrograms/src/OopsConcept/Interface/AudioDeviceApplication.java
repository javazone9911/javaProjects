package OopsConcept.Interface;

public class AudioDeviceApplication {
    public static void main(String[] args) {
        AudioDevice audioDevice=new BluetoothDevice();
        audioDevice.start();
        AudioDevice audioDevice1=new HeadPhones();
        audioDevice1.stop();
        audioDevice1.volumeUp();
        AudioDevice audioDevice2=new Speakers();
        audioDevice2.volumeDown();

    }
}
