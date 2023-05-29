import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Tester {
    public static void main (String [] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int error = 0; //tracks how many error combinations were made
        final int failState = 2; //how many times you can enter a combination after the initial attempt

        String entry = ""; //declares entry for later usage in a while loop

        Boolean testing = false; //holds the boolean value of match method


        try {
            ATM sample = new ATM("D:/nyit/[2] Spring 2022 Semester/CSCI 185/Homework/Individual Project (no gui)/atmData.txt"); //tries the file path and catches exception if thrown
            sample.open();
        } 
        
        catch (FileNotFoundException e) {
            System.out.println("File not found, please run again."); //error message for file not being found at file path
            System.exit(0);
        }

        while (!testing) { //asks user to enter a combination and runs it until the fail state is reached or a correct combination is entered

            System.out.print("Enter account number:");
            int temp = input.nextInt();
    
            System.out.print("Enter PIN:");
            int temp2 = input.nextInt();

            testing = ATM.match(temp, temp2);

            if (testing == false) {

                error++;
                System.out.println("You have entered the wrong combination. You have " + (failState - error) + " attempts left.");
            }

            if (error == failState) {

                System.out.println("Number of attempts exceeded.");
                System.exit(0);
            }
        }


        checkingAccount accOne = new checkingAccount(); //creates a checking and savings account
        savingsAccount accTwo = new savingsAccount();

        while(!entry.equalsIgnoreCase("C") ) { // first loop to run the whole simulation

            System.out.println("A = Checking \nB = Savings \nC = Quit");
            entry = input.next();

            if (entry.equalsIgnoreCase("A") ) { // second loop for using checking account
                String entry2 = ""; //temporary variable to avoid runtime errors in using while loops 

                while(!entry2.equalsIgnoreCase("C") ) {

                    System.out.println("Checking Account: " + accOne.getBalance());
                    System.out.println("A = Deposit \nB = Withdrawal \nC = Cancel Operation");
                    entry2 = input.next();

                    if (entry2.equalsIgnoreCase("A") ) {

                        System.out.print("Amount:");
                        double tempA = input.nextDouble();

                        accOne.deposit(tempA);
                    }

                    else if (entry2.equalsIgnoreCase("B") ) {

                        System.out.print("Amount:");
                        double tempA = input.nextDouble();

                        if (tempA < 0) {

                            System.out.println("Try again."); 
                            break;
                        }
                        accOne.withdrawal(tempA);
                    } 
                }
            }


            if (entry.equalsIgnoreCase("B") ) { // third loop for using savings account
                String entry2 = ""; //temporary variable to avoid runtime errors in using while loops

                while(!entry2.equalsIgnoreCase("C") ) {

                    System.out.println("Savings Account " + accTwo.getBalance());
                    System.out.println("A = Deposit \nB = Withdrawal \nC = Cancel Operation");
                    entry2 = input.next();

                    if (entry2.equalsIgnoreCase("A") ) {

                        System.out.print("Amount:");
                        double tempA = input.nextDouble();

                        accTwo.deposit(tempA);
                    }

                    else if (entry2.equalsIgnoreCase("B") ) {

                        System.out.print("Amount:");
                        double tempA = input.nextDouble();

                        if (tempA < 0) {

                            System.out.println("Try again.");
                            break;
                        }

                        accTwo.withdrawal(tempA);
                    } 
                }
            }
        }

    }
}
