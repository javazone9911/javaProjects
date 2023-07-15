package OopsConcept.Interface;

public class BluetoothDevice implements AudioDevice{
    @Override
    public void start() {
        System.out.println("starting the bluetoothDevice");
    }

    @Override
    public void backward() {
        System.out.println("Backward the bluetooth");
    }

    @Override
    public void stop() {
        System.out.println("stoping the bluetooth");
    }

    @Override
    public void volumeUp() {
        System.out.println("incresing the volume in the bluetoothDevice");
    }

    @Override
    public void volumeDown() {
        System.out.println("Decreasing the volume in bluetoothDevice");
    }
}
