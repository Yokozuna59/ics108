public class CheckingAccount extends Account {
    private final double MAX_DRAFT = -10000;

    public CheckingAccount() {
        this((int) ((Math.random() * 1000000)), 0);
    }

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    public double getDebt() {
        double debt = 0;
        double currentBalance = getBalance();
        if (currentBalance < 0)
            debt = Math.abs(currentBalance);
        return debt;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println(String.format("Withdrawing $%.2f", amount));
        double exceptedBalance = getBalance() - amount;
        if (exceptedBalance >= MAX_DRAFT) {
            setBalance(exceptedBalance);
            System.out.println(String.format("You have withdrawn %.2f", amount));
        } else
            System.out.println(
                    "You cant't withdraw more money! You have exceeded the maximum amount of money you can be in debt with.");
    }

    @Override
    public String toString() {
        return String.format("%s\nDebt: %.2f", super.toString(), getDebt());
    }
}
