public class PaymentProcessor {
    public void processPayment(Bitcoin bitcoin) {
        System.out.println("Processing Bitcoin Payment");
        System.out.println("Transaction ID: " + bitcoin.getTransactionId());
    }
    public void processPayment(PayPal payPal) {
        System.out.println("Processing PayPal Payment");
    }
    public void processPayment(CreditCard creditCard) {
        System.out.println("Processing CreditCard Payment");
    }
}
