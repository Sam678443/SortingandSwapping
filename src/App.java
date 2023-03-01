import java.util.Arrays;

public class App {
    // Basic array
    final static int[] unsorted = { 11, 25, 31, 7, 88, 33, 67, 5, 12, 55 };

    public static void main(String[] args) throws Exception {
        // Prints unsorted array
        System.out.println("Swapped: " + Arrays.toString(unsorted));
        // Runs swap method with array unsorted
        swap(unsorted, 2, 6);
        // Prints swapped list
        System.out.println("Swapped: " + Arrays.toString(unsorted));
        sort(unsorted);
        System.out.println("Sorted: " + Arrays.toString(unsorted));
    }

    final static public void swap(int[] array, int firstIndex, int secondIndex) {
        //
        int tempVar = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tempVar;
    }

    static void sort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1]
                    swap(array, j, j + 1);
                }
            }
        }
    }
}
