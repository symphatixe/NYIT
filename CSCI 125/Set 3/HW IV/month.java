import java.util.Scanner;

public class month {
    private String[] months = {"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"};
    private int select;

    public month(int n) {

        select = n;
    }

    public String getDays() {

        return months[select - 1];
    }

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter month.");
        int n = input.nextInt();

        month sample = new month(n);
        System.out.println(sample.getDays() );
    }

}
