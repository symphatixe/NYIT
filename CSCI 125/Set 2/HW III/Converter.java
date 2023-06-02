public class Converter {
    private double conversion;
    private final double METERS_TO_INCHES = 39.37;
    private final double METERS_TO_FEET = 3.281;
    private final double METERS_TO_MILES = 1609;

    public Converter(double c) {

        conversion = c;
    }

    public double convert(double v) {

        if (conversion == METERS_TO_INCHES) return v * METERS_TO_INCHES;
        else if (conversion == METERS_TO_FEET) return v * METERS_TO_FEET;
        else return v * METERS_TO_MILES;
    }

    public static void main (String [] args) {

        Converter sample = new Converter(39.37);

        System.out.println(sample.convert(16) );
        System.out.println(sample.convert(5) );
        System.out.println(sample.convert(2) );
    }
    
}
