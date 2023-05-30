public class Main {

    public static String forLoopReplace(String s) {
        String temp = "";

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'i') temp += "!";
            else if (s.charAt(i) == 's') temp += "$";
            else temp += s.substring(i, i + 1);
        }

        return temp;
    }
    public static void main (String [] args) {

        String sample = "Mississippi";
        String sample2 = "Mississippi";

        System.out.println("Before, using replace(): " + sample);
        
        sample = sample.replace('l', '!');
        sample = sample.replace('s', '$');

        System.out.println("After, using replace(): " + sample + "\n");


        System.out.println("Before, using for loop: " + sample2);

        sample2 = forLoopReplace(sample2);

        System.out.println("After, using for loop: " + sample2);
    }
}
