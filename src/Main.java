import java.util.Arrays;

public class Main {

    public static void quickSort(long[] array, long low, long high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;


        long middle = low + (high - low) / 2;
        long opora = array[(int) middle];


        long i = low, j = high;
        while (i <= j) {
            while (array[(int) i] < opora) {
                i++;
            }

            while (array[(int) j] > opora) {
                j--;
            }

            if (i <= j) {
                long temp = array[(int)i];
                array[(int)i] = array[(int)j];
                array[(int)j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
    public static void main(String[] args) {
        long[] x = { 15, -7, 10, 7, 3, -2, 0, 12, 6 };
        System.out.println("Было");
        System.out.println(Arrays.toString(x));

        long low = 0;
        long high = x.length - 1;

        quickSort(x, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
    }
}