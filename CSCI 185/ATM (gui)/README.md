# Project Task

You are tasked with designing an ATM that is used by customers of a bank. Each customer at the bank has two accounts: checking & savings accounts. 

### Customers
> Customers have customer numbers and personal identification numbers (PINs). They are able to view balances on both accounts and deposit or withdraw from both accounts. Once the customer logs in they can repeat these processes until they choose to exit. 

### Accounts
> Accounts have a balance, deposit and withdrawal functions along with validation checks for withdrawals that are not possible.

### ATM
> The ATM is used to read the file and read the customer account number and PIN. Based on the task, I used only one pairing of account number and PIN, but it can be easily refactored to accomodate more pairs.

</br>

## Simulation

In my simulation a user is allowed 3 attempts to login into their account, afterwards they will either be allowed to login or an error will be returned that too many attempts were made. This project differs from the other ATM, as it enchances the capabilities of the application by using the `javax.swing` package, to implement `JOptionPane`. JOption panes are really useful as a simple gui standin if you are not interested in using `JFrame`and whatnot. They are packed with simple options and have 4 different types: message, input, choice, and confirm dialogs.

These types were used to enchance the application since we can use confirm dialogs to confirm applications and also the application will ask a user to confirm a withdrawal that exceeds or is equal to 90% of the account balance.

</br>

Two new accounts are created, simulating that someone does not have an initial balance, but it can be changed in the checkingAccount and savingsAccount classes to accomodate an initial balance.


After account initialization, the user is then prompted to the 3 ATM options which are to access checking and savings accounts or quit the application. The simulations runs infinitely meaning that you can go back to the home screen if you meant to enter a different account.
