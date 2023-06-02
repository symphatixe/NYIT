# Homework Task

Write a program that converts a user's entered measurement in meters and convert it into miles, feet, and inches. I designed the class to work as a independent converter meaning that to use the conversion of miles, a `Converter` object is created with the conversion indicated in the constructor. 

### Example:

```java

Converter sample = new Converter(39.37);

//In the Converter class:
private double conversion;
private final double METERS_TO_INCHES = 39.37;

public Converter(double c) {
  conversion = c;
}
```
<br/><br/>

This means that the converter is now set to convert meters to inches since the conversion for meters to inches is 39.37. In retrospect, when creating the program, I should have made it more user intituitive meaning that the possible conversions should have been stored in a `String` array named `String[] options` so that the user input can then be found in the array.

### Example

```java

public class Converter {

  private String conversion;
  private String[] options = {"inches", "feet", "miles"};
  
  public Converter(String s) {
    
    conversion = s;
  }
  
  
```
