# Homework Task

Write a program that asks for four integers and prints their sum and average. Create a class named `DataSet` that has methods: `void addValue(int x)`, `int getSum()`, and `double getAverage()`. Keep track of the count and the amount of values, consider that a user may enter more than four values. Test the program by reading four integers and calls `addValue()` four times.

In my code I used an array for four integers and implemented a private instance variable named position that could keep track of how many values there are. The methods for `getSum()` and `getAverage()` can be changed to work with an `ArrayList` that could increase depending on the values inputted. To simulate 4 values, I used `Math.random()` to return me a number from 1 to 10.
