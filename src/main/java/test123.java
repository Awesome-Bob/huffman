import java.util.Arrays;
import java.util.Random;

public class test123 {
    public static void main(String[] args) {
        int arraySize = 10;
        int bound = 100;
        int[] array = arrayInitialise(arraySize, bound);
        printArray(array);
        sort(array);
        printArray(array);
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length-1] +"]");
    }

    private static int[] arrayInitialise(int arraySize,int bound) {
        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(bound);
        }
        return array;
    }

    public static void sort(int array[])
    {
        for (int i = 1; i < array.length; i++)
        {
            int x = array[i];

            // Find location to insert
            // using binary search
            int j = Math.abs(
                    Arrays.binarySearch(array, 0,
                            i, x) + 1);

            // Shifting array to one
            // location right
            System.arraycopy(array, j,
                    array, j + 1, i - j);

            // Placing element at its
            // correct location
            array[j] = x;
        }
    }


}
