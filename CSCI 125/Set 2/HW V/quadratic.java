public class quadratic {
    private double a;
    private double b;
    private double c;

    public quadratic(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSolution1() {

        double inside = Math.sqrt(Math.pow(b, 2) - (4 * a * c) );
        return ( (-b + inside) / (2 * a) );
    }

    public double getSolution2() {

        double inside = Math.sqrt(Math.pow(b, 2) - (4 * a * c) );
        return ( (-b - inside) / (2 * a));
    }


    public static void main (String [] args) {

        quadratic sample = new quadratic(4, 7, 2);

        System.out.println(sample.getSolution1() );
        System.out.println(sample.getSolution2() );
    }
}
