public class bankAccount {
    private double balance;

    public bankAccount() {

        balance = 0;
    }

    public bankAccount(double b) {

        balance = b;
    }

    public void deposit(double b) {

        if (b < 0) System.out.println("Invalid input.");
        else balance += b;
    }

    public void withdraw(double b) {

        if (b < 0) System.out.println("Invalid input.");
        else {

            if (b > balance) System.out.println("Withdrawal not possible.");
            else balance -= b;
        }
    }

    public double getBalance() {

        return balance;
    }


    public static void main (String [] args) {

        bankAccount sample = new bankAccount();
        sample.deposit(1000);
        sample.withdraw(500);
        sample.withdraw(400);

        System.out.println(sample.getBalance());
    }
}
