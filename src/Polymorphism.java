public class Polymorphism {
    public interface PaymentProcessor {
        void processPayment(double amount);
    }

    public class CreditCardProcessor implements PaymentProcessor {
        public void processPayment(double amount) {
            System.out.println("Processing credit card payment of $" + amount);
        }
    }

    public class PayPalProcessor implements PaymentProcessor {
        public void processPayment(double amount) {
            System.out.println("Processing PayPal payment of $" + amount);
        }
    }

    public class UPIProcessor implements PaymentProcessor {
        public void processPayment(double amount) {
            System.out.println("Processing UPI payment of ₹" + amount);
        }
    }

    //Client class
    public class PaymentService {
        public void pay(PaymentProcessor processor, double amount) {
            processor.processPayment(amount);
        }
    }
}
