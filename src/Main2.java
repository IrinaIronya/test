import java.util.Arrays;

public class Main2 {

    public static void bubbleSort (String[] args, int b) {

        int [] array = {54, 13, 7, 1, 10, 25, 3, 8, 17, 5};

        boolean isSorted = false;
        int t;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array [i+1]){
                    isSorted = false;

                    t = array[i];
                    array [i] = array [i+1];
                    array [i+1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort (String[] args,long b) {

        long [] array = {54, 13, 6, 1, 10, 25, 3, 8, 17, 5};

        boolean isSorted = false;
        long t;
        while(!isSorted) {
            isSorted = true;
            for (long i = 0; i < array.length-1; i++) {
                if(array[(int)i] > array [(int)i+1]){
                    isSorted = false;

                    t = array[(int)i];
                    array [(int)i] = array [(int)i+1];
                    array [(int)i+1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}