public class CheckoutService {

    PaymentGateway paymentGateway;

    CheckoutService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    void initiateTransaction(double amount) {
        paymentGateway.initiatePayment(amount);
    }
}
