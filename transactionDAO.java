java.sql.Connection;
import java.sql.PreparedStatement;
import 
public class TransactionDAO {

    public void saveTransaction(Transaction transaction) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO transactions(customer_name, account_number, amount, transaction_type, status) VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, transaction.getCustomerName());
            ps.setString(2, transaction.getAccountNumber());
            ps.setDouble(3, transaction.getAmount());
            ps.setString(4, transaction.getTransactionType());
            ps.setString(5, transaction.getStatus());

            ps.executeUpdate();

            System.out.println("Transaction Saved Successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}vimport java.sql.Connection;
import java.sql.PreparedStatement;

public class TransactionDAO {

    public void saveTransaction(Transaction transaction) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO transactions(customer_name, account_number, amount, transaction_type, status) VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, transaction.getCustomerName());
            ps.setString(2, transaction.getAccountNumber());
            ps.setDouble(3, transaction.getAmount());
            ps.setString(4, transaction.getTransactionType());
            ps.setString(5, transaction.getStatus());

            ps.executeUpdate();

            System.out.println("Transaction Saved Successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
