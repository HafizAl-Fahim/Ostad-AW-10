class SavingsAccount extends BankAccount {
    private static final double WITHDRAWAL_LIMIT = 500.0;

    public SavingsAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > WITHDRAWAL_LIMIT) {
            System.out.println("Withdrawal amount exceeds the limit of $" + WITHDRAWAL_LIMIT);
        } else if (amount > 0 && amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}