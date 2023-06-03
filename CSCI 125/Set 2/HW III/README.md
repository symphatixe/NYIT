# Homework Task

Write a program that converts a user's entered measurement in meters and convert it into miles, feet, and inches. I designed the class to work as a independent converter meaning that to use the conversion of miles, a `Converter` object is created with the conversion as a `double` indicated in the constructor. 

### Code Sample:

```java

//Main class
Converter sample = new Converter(39.37);

//In the Converter class:
private double conversion;
private final double METERS_TO_INCHES = 39.37;
private final double METERS_TO_FEET = 3.281;
private final double METERS_TO_MILES = 1609;

public Converter(double c) {

  conversion = c;
}
```

This means that the converter is now set to convert meters to inches since the conversion for meters to inches is 39.37. In retrospect, when creating the program, I should have made it more user intituitive meaning that the possible conversions should have been stored in a `int` array named `int[] conversions` so that the user input can be converted using the array.

### Example:

```java

public class Converter {

  private String conversion;
  private int[] conversions  = {39.37, 3.281, 1609};
  //conversions are in order: inches, feet, miles
  
  public Converter(String s) {
    
    conversion = s;
  }
  
  public double convert(double v) {

      if (conversion.equalsIgnoreCase("inches") ) return v * METERS_TO_INCHES;
      else if (conversion.equalsIgnoreCase("feet") ) return v * METERS_TO_FEET;
      else if (conversion.equalsIgnoreCase("miles") ) return v * METERS_TO_MILES;
      else return -1;
  }
}
```
