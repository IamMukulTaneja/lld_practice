package Encapsulation;

public class Main {
        public static void main(String[] args) {
            PaymentProcessor payment = new PaymentProcessor("1234567812345678", 250.00);
            payment.processPayment();

            BankAccount bankAccount = new BankAccount();
            bankAccount.deposit(12345);
            bankAccount.deposit(1234);

            bankAccount.withdraw(1200);
            System.out.println(bankAccount.getBalance());
        }
}
