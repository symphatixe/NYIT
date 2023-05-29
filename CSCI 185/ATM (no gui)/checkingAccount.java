public class checkingAccount {

    //instance variables
    private double balance;

    public checkingAccount() { //creates a checking account with 0 balance

        balance = 0;
    }

    public void deposit(double n) { //deposits passes parameter to the object

        balance += n;
    }

    public void withdrawal(double n) { //wtihdraws passed parameter to object and returns error if withdrawal is not possible

        if (balance - n < 0) System.out.println("Withdrawal not possible.");
        else balance -= n;
    }

    public double getBalance() { //returns balance

        return balance;
    }
}