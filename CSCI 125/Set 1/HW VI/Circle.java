import java.text.DecimalFormat;

public class Circle {
    private double radius;

    public Circle(double r) {

        radius = r;
    }

    public double getArea() {

        return (Math.PI * Math.pow(radius, 2));
    }

    public double getPerimeter() {

        return (2 * radius * Math.PI);
    }
    public static void main(String [] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        Circle sample = new Circle(5);

        System.out.println(df.format(sample.getArea()) );
        System.out.println(df.format(sample.getPerimeter()) );
        
    }
}
