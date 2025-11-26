public class RazorpayPayment implements PaymentGateway{
    @Override
    public void initiatePayment(double amount) {
        System.out.println("Payment is happening via Razopray: Rs."+amount);
    }
}
