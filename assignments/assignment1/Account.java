import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate = 4.5 / 100;
    private Date dateCreated;

    public Account() {
        this((int) ((Math.random() * 1000000)), 0);
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate / 100;
    }

    public Date getDateCreated() {
        return (Date) dateCreated.clone();
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        String output = String.format("Balance: $%.3f\nMonthly interest: $%.3f\nCreation date: %s",
                balance, getMonthlyInterest(), getDateCreated());
        return output;
    }
}
