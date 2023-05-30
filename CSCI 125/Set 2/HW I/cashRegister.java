public class cashRegister {
    private double balance;
    private double payment;

    public cashRegister() {

        balance = 0;
    }

    public void purchase(double p) {

        balance += p;
    }

    public void payDollars(int d) {

        payment += d;
    }

    public void payQuarters(int q) {

        payment +=(q * 0.25);
    }

    public void payDimes(int d) {

        payment += (d * 0.10);
    }

    public void payNickels(int n) {

        payment += (n * 0.05);
    }

    public void payPennies(int p) {

        payment += (p * 0.01);
    }

    public double returnChange() {

        return (balance - payment);
    }

    public static void main (String [] args) {
        
        cashRegister sample = new cashRegister();

        sample.purchase(25);
        sample.payDollars(4);
        sample.payQuarters(25);
        sample.payDimes(20);
        sample.payNickels(4);
        sample.payPennies(50);

        System.out.println(sample.returnChange() );
    }
}
