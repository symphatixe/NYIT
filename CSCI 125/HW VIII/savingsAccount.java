public class savingsAccount {
    private double balance;
    private double interest;

    public savingsAccount(double b, double i) {

        balance = b;
        interest = i;
    }

    public void addInterest() {

        interest++;
    }

    public double getBalance() {

        return balance + (balance * (interest / 100));
    }
    
    public static void main (String [] args) {

        savingsAccount sample = new savingsAccount(1000, 10);

        for (int i = 0; i < 5; i++) {

            sample.addInterest();
        }

        System.out.println(sample.getBalance() );
    }
}
