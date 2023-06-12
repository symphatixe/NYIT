import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class ATM {
    
    //instance variables
    private static int account;
    private static int pin;
    private String file;

    public ATM(String n) {

        file = n; // initializes the "filepath" instance variable to the entered one
    }

    public void open () throws IOException {
        FileReader reader = new FileReader(file); // file is read using FileReader and the Scanner wil; return values and store them in an ArrayList to access them
        Scanner input = new Scanner(reader);
        ArrayList <String> temp = new ArrayList<String>();

        for (int i = 0 ; i < 2; i++) {

            temp.add(input.nextLine() );
        }

        account = Integer.parseInt(temp.get(0));
        pin = Integer.parseInt(temp.get(1));
    }

    public static Boolean match (int a, int p) { // very simple check of matching user values to entered ones

        if (a == account) {
            if (p == pin) return true;
            else return false;
        }
        else return false;
    }
}