import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UnitConverter {
    public int unit;
    public int unit2;
    private double value;
    private ArrayList <String> values = new ArrayList <String> (Arrays.asList("in", "ft", "mi", "mm", "cm", "km") );

    public UnitConverter(int u, int u2, double v) {

        unit = u;
        unit2 = u2;
        value = v;
    }

    public double convert() {

        double temp = 0;

        //inch to whatever else
        if (unit == 0 && unit2 == 1) temp = value / 12;
        else if (unit == 0 && unit2 == 2) temp = value / 63360;
        else if (unit == 0 && unit2 == 3) temp = value * 25.4;
        else if (unit == 0 && unit2 == 4) temp = value * 2.54;
        else if (unit == 0 && unit2 == 5) temp = value / 39370;

        //foot to whateever else
        else if (unit == 1 && unit2 == 0) temp = value * 12;
        else if (unit == 1 && unit2 == 2) temp = value * 5280;
        else if (unit == 1 && unit2 == 3) temp = value * 305;
        else if (unit == 1 && unit2 == 4) temp = value * 30.48;
        else if (unit == 1 && unit2 == 5) temp = value / 3281;

        //miles to whatever else
        else if (unit == 2 && unit2 == 0) temp = value * 63360;
        else if (unit == 2 && unit2 == 1) temp = value * 5280;
        else if (unit == 2 && unit2 == 3) temp = value * 1609344;
        else if (unit == 2 && unit2 == 4) temp = value * 160934;
        else if (unit == 2 && unit2 == 5) temp = value * 1.609;

        //millimeter to whatever else
        else if (unit == 3 && unit2 == 0) temp = value * 0.0393700787;
        else if (unit == 3 && unit2 == 1) temp = value * 0.0032808399;
        else if (unit == 3 && unit2 == 2) temp = value / 1609344;
        else if (unit == 3 && unit2 == 4) temp = value / 10;
        else if (unit == 3 && unit2 == 5) temp = value * 0.000001;

        //centimeter to whatever else
        else if (unit == 4 && unit2 == 0) temp = value / 2.54;
        else if (unit == 4 && unit2 == 1) temp = value / 30.48;
        else if (unit == 4 && unit2 == 2) temp = value / 160934;
        else if (unit == 4 && unit2 == 3) temp = value * 10;
        else if (unit == 4 && unit2 == 5) temp = value / 100000;

        //kilometer to whatever else
        else if (unit == 5 && unit2 == 0) temp = value * 39370;
        else if (unit == 5 && unit2 == 1) temp = value * 3281;
        else if (unit == 5 && unit2 == 2) temp = value / 1.609;
        else if (unit == 5 && unit2 == 3) temp = value * 1000000;
        else if (unit == 5 && unit2 == 4) temp = value * 100000;

        else temp = Double.NaN;

        return temp;
    }

    
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Values are marked with numbers: \n1 = inches \n2 = feet \n3 = miles \n4 = millimeters \n5 = centimeeters \n6 = kilometers\n");
        System.out.println("Select value to convert from and to and indicate a value.");

        int temp = input.nextInt();
        int temp2 = input.nextInt();
        double temp3 = input.nextDouble();

        UnitConverter sample = new UnitConverter(temp - 1, temp2 - 1, temp3);

        System.out.println(sample.convert() );
    }
}
