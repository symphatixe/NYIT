import java.text.DecimalFormat;

public class sodaCan {
    private double radius;
    private double height;

    public sodaCan(double r, double h) {

        radius = r;
        height = h;
    }

    public double getVolume() {

        return (Math.PI * Math.pow(radius, 2) * height);
    }

    public double getSurfaceArea() {

        return ( (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2)) );
    }

    public static void main (String [] args) {
        DecimalFormat twoDigits = new DecimalFormat(".###");

        sodaCan sample = new sodaCan(8, 5);
 
        System.out.println(twoDigits.format(sample.getVolume()) );
        System.out.println(twoDigits.format(sample.getSurfaceArea()) );
    }
}
