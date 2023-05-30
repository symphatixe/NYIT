public class bankAccount {
    private double balance;

    public bankAccount() {

        balance = 0;
    }

    public bankAccount(double b) {

        balance = b;
    }

    public void deposit(double b) {

        balance += b;
    }

    public void withdraw(double b) {

        balance -= b;
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
