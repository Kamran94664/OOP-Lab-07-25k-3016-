class Payment {
    void processPayment() {
        System.out.println("Processing payment...");
    }
}

class CreditCard extends Payment {
    void processPayment() {
        System.out.println("Processing Credit Card payment");
    }
}

class DebitCard extends Payment {
    void processPayment() {
        System.out.println("Processing Debit Card payment");
    }
}

class PayPal extends Payment {
    void processPayment() {
        System.out.println("Processing PayPal payment");
    }

public static void main(String[] args) {

        Payment p;

        p = new CreditCard();
        p.processPayment();
        p = new DebitCard();
        p.processPayment();
        p = new PayPal();
        p.processPayment();
    }
}