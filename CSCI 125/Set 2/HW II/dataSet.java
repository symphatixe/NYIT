public class dataSet {
    private int[] data;
    private int position = 0;

    public dataSet() {

        data = new int [4];
    }

    public void addValue(int x) {

        data[position] = x;
        position++;
    }

    public int getSum() {

        int sum = 0;

        for (int i = 0; i < 4; i++) {

            sum += data[i];
        }

        return sum;
    }

    public double getAverage() {

        double average = 0;

        for (int i = 0; i < 4; i++) {

            average += data[i];
        }

        return average / 4;
    }

    public static void main (String [] args) {

        dataSet sample = new dataSet();

        for (int i = 0; i < 4; i++) {

            int temp = (int) (Math.random() * 10) + 1;

            sample.addValue(temp);
        }

        System.out.println(sample.getSum() );
        System.out.println(sample.getAverage() );
    }
}
