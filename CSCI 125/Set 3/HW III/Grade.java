import java.util.Scanner;

public class Grade {
    private double grade;

    public Grade(double g) {

        grade = g;
    }

    public String getLetterGrade() {

        if (4 >= grade && grade >= 3.8) return "A";
        else if (3.8 > grade && grade >= 3.5) return "A-";
        else if (3.5 > grade && grade >= 3.2) return "B+";
        else if(3.2 > grade && grade >= 3) return "B";
        else if (3 > grade && grade >= 2.8) return "B-";
        else if (2.8 > grade && grade >= 2.5) return "C+";
        else if (2.5 > grade && grade >= 2.2) return "C";
        else if (2.2 > grade && grade >= 2) return "C-";
        else if (2 > grade && grade >= 1.8) return "D+";
        else if (1.8 > grade && grade >= 1.5) return "D";
        else if (1.5 > grade && grade >= 1.2) return "D-";
        else return "F";
    }

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your GPA.");
        double temp = input.nextDouble();

        Grade sample = new Grade(temp);

        System.out.println(sample.getLetterGrade());
        
    }
}
