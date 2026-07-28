CREATE DATABASE frauddb;

USE frauddb;

CREATE TABLE transactions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    customer_name VARCHAR(100) NOT NULL,
    account_number VARCHAR(20) NOT NULL,
    amount DOUBLE NOT NULL,
    transaction_type VARCHAR(20) NOT NULL,
    transaction_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(20) NOT NULL
);

INSERT INTO transactions
(customer_name, account_number, amount, transaction_type, status)
VALUES
('Abi', '1234567890', 10000, 'UPI', 'Safe'),
('Nathiya', '9876543210', 75000, 'NEFT', 'Fraud');

SELECT * FROM transactions;
