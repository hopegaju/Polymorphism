public class PayPal {
    private String email;
    private int password;

    public PayPal(String email, int password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public int getPassword() {
        return password;
    }
}
