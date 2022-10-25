public class SavingsAccount extends Account {
    public SavingsAccount() {
        this((int) ((Math.random() * 1000000)), 0);
    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("You can't withdraw from saving account!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
