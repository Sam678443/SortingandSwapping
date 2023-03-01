import java.util.Arrays;

public class App {
    final static int[] unsorted = { 11, 25, 31, 7, 88, 33, 67, 5, 12, 55 };

    public static void main(String[] args) throws Exception {
        System.out.println("Unsorted: " + Arrays.toString(unsorted));
        swap(unsorted, 2, 6);
        System.out.println("Sorted: " + Arrays.toString(unsorted));
    }

    final static public void swap(int[] array, int firstIndex, int secondIndex) {
        int tempVar = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tempVar;
    }
}
