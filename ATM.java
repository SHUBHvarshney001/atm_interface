public class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void withdraw(double amount) {
        if (account.getBalance() >= amount) {
            account.withdraw(amount);
            System.out.println("Withdrawal successful. New balance:        " + account.getBalance());
        } else {
            System.out.println("Insufficient funds.    ");
        }
    }

    public void deposit(double amount) {
        account.deposit(amount);
        System.out.println("Deposit successful. New balance:        " + account.getBalance());
    }

    public void checkBalance() {
        System.out.println("Your Current balance is :     "  + account.getBalance());
    }
}
