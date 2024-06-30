import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount("Bob", 1000.0);

        checking.displayAccountInfo();
        checking.deposit(300.0);
        checking.withdraw(50.0); // Includes transaction fee
        checking.withdraw(1250.0); // Should fail due to insufficient funds
        checking.displayAccountInfo();
    }
}