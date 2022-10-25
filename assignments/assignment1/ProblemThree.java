public class ProblemThree {
    public static void main(String[] args) throws Exception {
        // Create Account object
        Account student = new Account(123456, 20000);

        // Withdraw $2500 from balance
        student.withdraw(2500);

        // Deposit $3000 to balance
        student.deposit(3000);

        // Print toString method
        System.out.println(student);
    }
}
