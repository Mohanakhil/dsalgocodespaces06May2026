import java.util.Arrays;

public class InsertionSortingPractice40 {
    public static void insertionSorting(int[] a) {
        // assume left side is sorted and bring all the eles to left side
        // first iterate and capture key to store because we move all els it gets
        // overridden
        // iterate j and move a[j]
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] { 6, 5, 7, 4, 8, 3, 9, 2, 1 };
        insertionSorting(a);
        System.out.println(Arrays.toString(a));
    }
}
