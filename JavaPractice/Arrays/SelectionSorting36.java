import java.util.Arrays;

public class SelectionSorting36 {

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            // swap a[i] and a[minIndex]
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] { 10, 5, 8, 2, 5, 18 };
        selectionSort(a);
        // selection sort fails for same elements no stability
        System.out.println("Arr ater selection sort is " + Arrays.toString(a));
    }
}
