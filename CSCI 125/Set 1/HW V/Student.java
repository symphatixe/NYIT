public class Student {
    private String name;
    private double totalScore;
    private int quizzes;

    public Student() {

        name = "default";
        totalScore = 65;
        quizzes = 0;
    }

    public Student(String n, double s) {

        name = n;
        totalScore = s;
        quizzes++;
    }

    public void addQuiz(double q) {

        totalScore += q;
        quizzes++;
    }

    public String getName() {

        return name;
    }

    public int getQuizzes() {

        return quizzes;
    }

    public double getAverageScore() {

        return totalScore / quizzes;
    }

    public double getTotalScore() {

        return totalScore;
    }

    public static void main(String [] args) {

        Student sample = new Student("vadim", 85);

        sample.addQuiz(65);
        sample.addQuiz(40);
        sample.addQuiz(105);

        System.out.println("Name: " + sample.getName() + " Average Quiz Score: " + sample.getAverageScore() + " of " + sample.getQuizzes() + " total quizzes and a total cumulative score of " + sample.getTotalScore());
    }
}
