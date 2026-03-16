class Restaurant {
    double calculateDeliveryFee(double distance) {
        return 0;
    }
}

class FastFoodRestaurant extends Restaurant {
    double calculateDeliveryFee(double distance) {
        return distance * 5;
    }
}

class FineDiningRestaurant extends Restaurant {
    double calculateDeliveryFee(double distance) {
        return distance * 10;
    }
}

class CafeRestaurant extends Restaurant {
    double calculateDeliveryFee(double distance) {
        return distance * 7;
    }
public static void main(String[] args) {

        Restaurant r;
        double distance = 5;

        r = new FastFoodRestaurant();
        System.out.println("FastFood Delivery Fee: " + r.calculateDeliveryFee(distance));

        r = new FineDiningRestaurant();
        System.out.println("FineDining Delivery Fee: " + r.calculateDeliveryFee(distance));

        r = new CafeRestaurant();
        System.out.println("Cafe Delivery Fee: " + r.calculateDeliveryFee(distance));
    }
}
