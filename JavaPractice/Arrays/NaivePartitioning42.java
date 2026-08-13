import java.util.Arrays;

public class NaivePartitioning42 {

    public static void partition(int[] a, int low, int high, int p) {
        int temp[] = new int[high - low + 1];
        int index = 0;
        for (int i = low; i <= high; i++) {
            if (a[i] <= a[p] && i != p) {
                temp[index++] = a[i];
            }
        }
        temp[index++] = a[p];

        for (int i = low; i <= high; i++) {
            if (a[i] > a[p]) {
                temp[index++] = a[i];
            }
        }

        // copy back to array a
        for (int i = low; i <= high; i++) {
            a[i] = temp[i - low];
        }

    }

    public static void main(String[] args) {
        int[] a = new int[] { 5, 3, 6, 9, 11, 8 };
        int low = 0, high = a.length - 1, p = a.length - 1;
        // we are assuming partition as p as last element

        partition(a, low, high, p);
        System.out.println("array a after naive partitioning is " + Arrays.toString(a));
    }
}