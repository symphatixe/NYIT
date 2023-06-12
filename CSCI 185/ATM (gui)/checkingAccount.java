public class checkingAccount {

    //instance variables
    private double balance;

    public checkingAccount() { //creates a checking account with 0 balance

        balance = 0;
    }

    public void deposit(double n) { //deposits passed parameter into the object

        balance += n;
    }

    public void withdrawal(double n) { //withdraws passed parameter from the object and returns error 


        balance -= n;
    }

    public double getBalance() { //returns balance

        return balance;
    }
}