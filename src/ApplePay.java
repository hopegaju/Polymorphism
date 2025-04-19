public class ApplePay {
    private String accountNumber;
    private String authentication;
    public ApplePay(String accountNumber, String authentication) {
        this.accountNumber = accountNumber;
        this.authentication = authentication;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAuthentication() {
        return authentication;
    }
}
