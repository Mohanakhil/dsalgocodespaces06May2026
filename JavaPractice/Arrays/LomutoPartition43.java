import java.util.Arrays;

public class LomutoPartition43 {

    public static void partition(int[] a, int low, int high) {
        int pivot = a[a.length - 1];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 10, 80, 30, 90, 40, 50, 70 };

        // in this algo we assume last ele as partition ele
        partition(a, 0, a.length - 1);
        System.out.println("Array after Lomuto Partition is "+Arrays.toString(a));
    }
}
