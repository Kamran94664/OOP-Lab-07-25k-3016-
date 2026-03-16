class Transport {
    void fare() {
        System.out.println("Calculating transport fare");
    }
}

class Bus extends Transport {
    void fare() {
        int fare = 30;
        System.out.println("Bus Fare: " + fare);
    }
}

class Train extends Transport {
    void fare() {
        int fare = 50;
        System.out.println("Train Fare: " + fare);
    }
}

class Taxi extends Transport {
    void fare() {
        int fare = 120;
        System.out.println("Taxi Fare: " + fare);
    }
public static void main(String[] args) {

        Transport t;

        t = new Bus();
        t.fare();
        t = new Train();
        t.fare();
        t = new Taxi();
        t.fare();
    }
}