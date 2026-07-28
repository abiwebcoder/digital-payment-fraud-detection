public class Transaction {

    private String customerName;
    private String accountNumber;
    private double amount;
    private String transactionType;
    private String status;

    public Transaction(String customerName, String accountNumber,
            double amount, String transactionType, String status) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.transactionType = transactionType;
        this.status = status;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public String getStatus() {
        return status;
    }
}
