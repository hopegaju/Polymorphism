public class Main {
    public static void main(String[] args) {
        PaymentProcessor payment = new PaymentProcessor();
        Bitcoin bitcoin = new Bitcoin("3");
        payment.processPayment(new Bitcoin("3"));
        payment.processPayment(new PayPal());
        payment.processPayment(new CreditCard());
    }
}