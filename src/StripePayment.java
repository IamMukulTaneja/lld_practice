public class StripePayment implements PaymentGateway{
    @Override
    public void initiatePayment(double amount) {
        System.out.println("Payment is happening via stripe: Rs."+amount);
    }
}
