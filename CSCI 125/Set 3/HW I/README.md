# Homework Task

Create a program with the class `QuadraticEquation` that recieves the coefficients `a`, `b`, `c` of the quadratic equation used in mathematics. The form of the equation is $x = {-b \pm \sqrt{b^2-4ac} \over 2a}$. Create two methods `getSolution1()` and `getSolution2()` , they will return the two solutions derived from the quadratic formula. In this program, create a method called `hasSolutions()` to check the discriminant of the equation, meaning the inside of the square root is negative, then return a message if there are no real solutions.

In my code I wanted to make it easier to calculate the square root for each solution so I stored it within a variable called inside that calculated the values within the numerator of the fraction and then subtracted or added it to the *-b* value. 

My calculation for the real solutions was simple since I had already used a variable to store the inside of the square root and then I checked if it was less than 0 or more.
