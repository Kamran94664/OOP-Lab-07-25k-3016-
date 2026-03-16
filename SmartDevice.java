class SmartDevice {
    void turnOn() {
        System.out.println("Device is turning on");
    }
}

class SmartLight extends SmartDevice {
    @Override
    void turnOn() {
        System.out.println("Smart Light is now ON");
    }
}

class SmartFan extends SmartDevice {
    @Override
    void turnOn() {
        System.out.println("Smart Fan is spinning");
    }
}

class SmartAC extends SmartDevice {
    @Override
    void turnOn() {
        System.out.println("Smart AC is cooling the room");
    }

    public static void main(String[] args) {

        SmartDevice[] devices = new SmartDevice[3];

        devices[0] = new SmartLight();
        devices[1] = new SmartFan();
        devices[2] = new SmartAC();

        for (SmartDevice d : devices) {
            d.turnOn();
        }
    }
}