# Homework Task

Write a program that prints the question, "Do you want to continue?", it will read a user input as the answer. If the user input is "Y", "OK", "Sure", "Why not?", print out `OK` as the response. On the other hand, if the user input is "N" or "No", print out `Terminating` as the response. If the user response does not fit either case, return `Invalid Input`. The program should also ignore case sensititvy meaning that if the user enters "y" instead of "Y" it is still valid.

For this code we will use the `equalsIgnoreCase()` method that is used by `String` objects in Java. This method will compare two strings, ignoring the difference in case, which means two words, as long as they contain the same content, will be deemed as equal.
