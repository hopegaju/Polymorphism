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
    public void processPayment(ApplePay applePay) {
        String expectedAccountNumber = applePay.getAccountNumber();
        String expectedAuthentication = applePay.getAuthentication();
        if (applePay.getAccountNumber().equals(expectedAccountNumber) && applePay.getAuthentication().equals(expectedAuthentication)){
            System.out.println("Processing ApplePay Payment for " + applePay.getAccountNumber());
        }else {
            System.out.println("ApplePay Payment credentials are incorrect");
        }
    }
}
