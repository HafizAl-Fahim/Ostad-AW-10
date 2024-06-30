class CheckingAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 2.0;

    public CheckingAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        double totalAmount = amount + TRANSACTION_FEE;
        if (amount > 0 && totalAmount <= getBalance()) {
            super.withdraw(totalAmount);
            System.out.println("Transaction fee of $" + TRANSACTION_FEE + " applied.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}