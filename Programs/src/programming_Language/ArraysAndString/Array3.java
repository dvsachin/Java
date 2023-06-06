package programming_Language.ArraysAndString;

public class Array3 {
    public static void main (String[] args) {

        int[] numbers = {8, 2, 6, 4, 3};
        int sum = 0, sumSq = 0;

        double mean, stdDev;

        for(int i=0; i<numbers.length; i++)
        {
            sum += numbers[i];
            sumSq += numbers[i] * numbers[i];
        }

        mean = (double)sum / numbers.length;
        stdDev = Math.sqrt( (double)sumSq / numbers.length - mean*mean);

        System.out.printf("Mean is: %.2f%n", mean);
        System.out.printf("Standard deviation is: %.2f%n", stdDev);
    }
}

