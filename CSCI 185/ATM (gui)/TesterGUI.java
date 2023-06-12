import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane; //this gui will use strictly JOptionPane

public class TesterGUI {
    public static void main (String [] args) throws IOException {

        int error = 0; //tracks how many error combinations were made
        final int failState = 2; //how many times you can enter a combination after the initial attempt

        String entry = ""; //declares entry for later usage in a while loop

        Boolean testing = false; //holds the boolean value of match method


        try {

            ATM sample = new ATM("D:/nyit/Spring 2022 Semester/CSCI 185/Homework/Individual Project (gui)/atmData.txt"); //tries the file path and catches exception if thrown
            sample.open();
        } 
        
        catch (FileNotFoundException e) {

            JOptionPane.showMessageDialog(null, "File not found, please try again.", "Missing File", JOptionPane.ERROR_MESSAGE); //error message for file not being found at file path
            System.exit(0);
        }


        while (!testing) { //asks user to enter a combination and runs it until the fail state is reached or a correct combination is entered

            int acc = Integer.parseInt(JOptionPane.showInputDialog("Enter an account number") ); //prompts JOption panes for inputting the account number and pin
            int pin = Integer.parseInt(JOptionPane.showInputDialog("Enter the corresponding pin") );

            testing = ATM.match(acc, pin);

            if (testing == false) {

                error++;
                JOptionPane.showMessageDialog(null, "You have enter the wrong combination, try again. You have " + (failState - error) + " attempts left.", "Wrong Combination", JOptionPane.WARNING_MESSAGE); //displays an error message for incorrect combinations of account number and pin
            }

            if (error == failState) {

                JOptionPane.showMessageDialog(null, "You have used up all possible attempts.", "Termination of Process", JOptionPane.INFORMATION_MESSAGE); //displays an error message when too many incorrect combinations
                System.exit(0);
            }
        }


        checkingAccount accOne = new checkingAccount(); //creates checking and savings account
        savingsAccount accTwo = new savingsAccount();

        while(!entry.equalsIgnoreCase("C") ) { // first loop to run the whole simulation

            entry = JOptionPane.showInputDialog(null, "A = Checking \nB = Savings \nC = Quit \n\nChoose one of the menu options"); //shows you the menu options after the correct combination is entered and takes a user entry

            if (entry.equalsIgnoreCase("A") ) { // second loop for using checking account
                String entry2 = ""; //temporary variable to avoid runtime errors in using while loops

                while(!entry2.equalsIgnoreCase("C") ) {

                    entry2 = JOptionPane.showInputDialog(null, "Checking Account: " + accOne.getBalance() + "\nA = Deposit \nB = Withdrawal \nC = Cancel Operation"); //shows you menu options for checking account

                    if (entry2.equalsIgnoreCase("A") ) {

                        double tempA = Double.parseDouble(JOptionPane.showInputDialog(null, "Amount: ") ); //prompts for an amount to deposit
                        accOne.deposit(tempA);
                    }

                    else if (entry2.equalsIgnoreCase("B") ) {

                        double tempA = Double.parseDouble(JOptionPane.showInputDialog(null, "Amount: ") ); //prompts for an amount to withdraw

                        if (accOne.getBalance() < tempA) {

                            JOptionPane.showMessageDialog(null, "Withdrawal not possible, please try again.", "Banking Error", JOptionPane.ERROR_MESSAGE); //prints error message if withdrawal is not possible
                            break;
                        }

                        else if ( (accOne.getBalance() * .90) <= tempA && tempA <= (accOne.getBalance() * .99) ) { //will ask for confirmation if requested amount is 90%-99% or more of balance.

                            if (JOptionPane.showConfirmDialog(null, "Are you sure? The requested withdrawal balance is almost all of the money on the account.", "Withdrawal Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

                                accOne.withdrawal(tempA);
                            }
                            else break;
                        }

                        else if (accOne.getBalance() == tempA) { //will ask for confirmation if requested amount is equivalent to balance

                            if(JOptionPane.showConfirmDialog(null, "Are you sure? The requested withdrawal balance is all of the money on the account.", "Withdrawal Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

                                accOne.withdrawal(tempA);
                            }
                            else break;
                        }

                        else accOne.withdrawal(tempA);
                    } 
                }
            }


            if (entry.equalsIgnoreCase("B") ) { // second loop for using checking account
                String entry2 = ""; //temporary variable to avoid runtime errors in using while loops

                while(!entry2.equalsIgnoreCase("C") ) {

                    entry2 = JOptionPane.showInputDialog(null, "Checking Account: " + accTwo.getBalance() + "\nA = Deposit \nB = Withdrawal \nC = Cancel Operation"); //shows you menu options for checking account

                    if (entry2.equalsIgnoreCase("A") ) {

                        double tempA = Double.parseDouble(JOptionPane.showInputDialog(null, "Amount: ") ); //prompts for an amount to deposit
                        accTwo.deposit(tempA);
                    }

                    else if (entry2.equalsIgnoreCase("B") ) {

                        double tempA = Double.parseDouble(JOptionPane.showInputDialog(null, "Amount: ") ); //prompts for an amount to withdraw

                        if (accTwo.getBalance() < tempA) {

                            JOptionPane.showMessageDialog(null, "Withdrawal not possible, please try again.", "Banking Error", JOptionPane.ERROR_MESSAGE); //prints error message if withdrawal is not possible
                        }

                        else if ( (accTwo.getBalance() * .90) <= tempA && tempA <= (accTwo.getBalance() * .99) ) { //will ask for confirmation if requested amount is 90% or more of balance.

                            if(JOptionPane.showConfirmDialog(null, "Are you sure? The requested withdrawal balance is almost all of the money on the account.", "Withdrawal Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

                                accTwo.withdrawal(tempA);
                            }
                            else break;
                        }

                        else if (accTwo.getBalance() == tempA) { //will ask for confirmation if requested amount is equivalent to balance

                            if(JOptionPane.showConfirmDialog(null, "Are you sure? The requested withdrawal balance is all of the money on the account.", "Withdrawal Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

                                accTwo.withdrawal(tempA);
                            }
                            else break;
                        }

                        else accTwo.withdrawal(tempA);
                    } 
                }
            }
        }

    }
}
