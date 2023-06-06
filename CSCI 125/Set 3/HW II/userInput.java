import java.util.Scanner;

public class userInput {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to continue?");
        String temp = input.next();

        if(temp.equalsIgnoreCase("Y") || temp.equalsIgnoreCase("ok") || temp.equalsIgnoreCase("sure") || temp.equalsIgnoreCase("why not?") || temp.equalsIgnoreCase("yes")) {

            System.out.println("OK.");
        }
        
        else if(temp.equalsIgnoreCase("n") || temp.equalsIgnoreCase("no") ) {

            System.out.println("Terminating.");
        }

        else System.out.println("Bad input.");
    }
}
