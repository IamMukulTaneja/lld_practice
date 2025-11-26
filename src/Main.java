//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    StripePayment sp = new StripePayment();

    CheckoutService cs = new CheckoutService(sp);

    cs.initiateTransaction(1234.56);

    RazorpayPayment rp = new RazorpayPayment();
    cs.setPaymentGateway(rp);
    cs.initiateTransaction(1234.56);

}
