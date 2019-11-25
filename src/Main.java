import java.util.Arrays;

public class Main {

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;


        int middle = low + (high - low) / 2;
        int opora = array[middle];


        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
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
        int[] x = { 15, -7, 10, 7, 3, -2, 0, 12, 6 };
        System.out.println("Было");
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        quickSort(x, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
    }
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
    public static void main2 (String[] args) {
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