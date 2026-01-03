package smarthome;

public class AirConditioner extends Device {
    private int temperature;

    public AirConditioner(int deviceId, String deviceName) {
        super(deviceId, deviceName);
        this.temperature = 30;
    }

    public void turnOn() {
        status = true;
    }

    public void turnOff() {
        status = false;
        System.out.println(deviceName + " AC is OFF");
    }
}

