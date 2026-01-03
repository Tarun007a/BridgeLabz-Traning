package smarthome;

public class DriverClass {
    public static void main(String[] args) {
        User user = new User(1, "Tarun");

        Device light = new Light(0, "Room1");
        Device ac = new AirConditioner(1, "Room2");

        user.displayUser();

        light.turnOn();
        ac.turnOn();

        light.turnOff();
        ac.turnOff();
    }
}
