public class ProblemOne {
    public static void main(String[] args) throws Exception {
        System.out.println("Testing Account Class: ");
        Account testOneAccount = new Account();
        testOneAccount.withdraw(10000);
        System.out.println(testOneAccount);
        System.out.println("-----------------------------------");
        Account testTwoAccount = new Account(234567, 20000);
        testTwoAccount.deposit(10000);
        System.out.println(testTwoAccount);

        System.out.println();

        System.out.println("Testing CheckingAccount Class: ");
        CheckingAccount testOneCheckingAccount = new CheckingAccount();
        testOneCheckingAccount.withdraw(10000);
        System.out.println(testOneCheckingAccount);
        System.out.println("-----------------------------------");
        CheckingAccount testTwoCheckingAccount = new CheckingAccount(345678, 30000);
        testTwoCheckingAccount.withdraw(50000);
        System.out.println(testTwoCheckingAccount);

        System.out.println();

        System.out.println("Testing SavingsAccount Class: ");
        SavingsAccount testOneSavingsAccount = new SavingsAccount();
        testOneSavingsAccount.withdraw(10000);
        System.out.println(testOneSavingsAccount);
        System.out.println("-----------------------------------");
        SavingsAccount testTwoSavingsAccount = new SavingsAccount(456789, 40000);
        testTwoSavingsAccount.deposit(10000);
        System.out.println(testOneSavingsAccount);
    }
}
