public class Main {

    public static void main(String[] args) {

        String customerName = "Abi";
        String accountNumber = "1234567890";
        double amount = 75000;
        String transactionType = "UPI";

        String status;

        if (amount > 50000) {
            status = "Fraud";
        } else {
            status = "Safe";
        }

        Transaction transaction = new Transaction(
                customerName,
                accountNumber,
                amount,
                transactionType,
                status
        );

        TransactionDAO dao = new TransactionDAO();
        dao.saveTransaction(transaction);

        System.out.println("Digital Payment Fraud Detection Completed.");
    }
}
