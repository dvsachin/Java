package programming_Language.ArraysAndString;

public class Array4 {
    public static void main (String[] args) {

        int[] marks = {8, 2, 6, 4, 3};
        int sum = 0, sumSq = 0;

        double mean, stdDev;

        for(int items: marks)
        {
            sum += items;
            sumSq += items * items;
        }

        mean = (double)sum / marks.length;
        stdDev = Math.sqrt( (double)sumSq / marks.length - mean*mean);

        System.out.printf("Mean is: %.2f%n", mean);
        System.out.printf("Standard deviation is: %.2f%n", stdDev);
    }
}
