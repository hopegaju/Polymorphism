public class Main {
    public static void main(String[] args) {
        PaymentProcessor payment = new PaymentProcessor();
        Bitcoin bitcoin = new Bitcoin();
        payment.processPayment(new Bitcoin());
        payment.processPayment(new PayPal());
    }
}