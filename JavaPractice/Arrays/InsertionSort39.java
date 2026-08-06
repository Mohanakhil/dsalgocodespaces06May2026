import java.util.Arrays;

public class InsertionSort39 {

    public static void insertionSorting(int[] a) {
        for (int i = 1; i <= a.length - 1; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] { 20, 5, 40, 60, 10 };

        insertionSorting(a);
        System.out.println(Arrays.toString(a));
    }
}
