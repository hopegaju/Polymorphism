public class PaymentProcessor {
    public void processPayment(Bitcoin bitcoin) {
        System.out.println("Processing Bitcoin Payment");
        System.out.println("Transaction ID: " + bitcoin.getTransactionId());
    }
    public void processPayment(PayPal payPal) {
        String expectedEmail = "user@example.com";
        String expectedPassword = "securePass123";
        if (payPal.getEmail().equals(expectedEmail) && payPal.getPassword().equals(expectedPassword)){
            System.out.println("Processing PayPal Payment for " + payPal.getEmail());
        } else {
            System.out.println("PayPal Payment credentials are incorrect");
        }
    }
    public void processPayment(CreditCard creditCard) {
        System.out.println("Processing CreditCard Payment");
    }
}
