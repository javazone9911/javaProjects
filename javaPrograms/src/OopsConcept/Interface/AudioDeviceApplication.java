package OopsConcept.Interface;

public class AudioDeviceApplication {
    public static void main(String[] args) {
        AudioDevice audioDevice=new BluetoothDevice();
        audioDevice.start();
        audioDevice.stop();
        audioDevice.volumeUp();
        audioDevice.backward();
        audioDevice.volumeDown();
        AudioDevice audioDevice1=new HeadPhones();
        audioDevice1.stop();
        audioDevice1.volumeUp();
        audioDevice1.volumeDown();
        audioDevice1.backward();
        audioDevice1.start();
        AudioDevice audioDevice2=new Speakers();
        audioDevice2.volumeDown();
        audioDevice2.start();
        audioDevice2.volumeDown();
        audioDevice2.stop();
        audioDevice2.volumeUp();
        audioDevice2.backward();
    }
}
