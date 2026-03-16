class Ride {
    double calculateFare(double distance) {
        return 0;
    }
}

class BikeRide extends Ride {
    @Override
    double calculateFare(double distance) {
        return distance * 5;   // 5 per km
    }
}

class CarRide extends Ride {
    @Override
    double calculateFare(double distance) {
        return distance * 10;  // 10 per km
    }
}

class LuxuryRide extends Ride {
    @Override
    double calculateFare(double distance) {
        return distance * 20;
    }
   public static void main(String[] args) {

        Ride ride;
        double distance = 10;

        ride = new BikeRide();
        System.out.println("Bike Ride Fare: " + ride.calculateFare(distance));

        ride = new CarRide();
        System.out.println("Car Ride Fare: " + ride.calculateFare(distance));

        ride = new LuxuryRide();
        System.out.println("Luxury Ride Fare: " + ride.calculateFare(distance));
    }
}