import java.util.Arrays;

public class FindMedianOf2SortedArrays34 {
    public static float getMedianByCombining(int[] a1, int[] a2) {
        int[] combined = new int[a1.length + a2.length];
        // we can do like below to combine or simply combine and use Arrays.sort() also
        int i = 0, j = 0, k = 0;
        while (i < a1.length && j < a2.length) {
            if (a1[i] <= a2[j]) {
                combined[k] = a1[i];
                k++;
                i++;
            } else {
                combined[k] = a2[j];
                k++;
                j++;
            }
        }
        while (i < a1.length) {
            combined[k++] = a1[i++];
        }
        while (j < a2.length) {
            combined[k++] = a2[j++];
        }

        System.out.println("combined array is " + Arrays.toString(combined));
        if (combined.length % 2 != 0) {
            return combined[combined.length / 2];
        } else
            return ((combined[combined.length / 2] + combined[combined.length / 2 - 1]) / 2);
    }

    public static void main(String[] args) {
        int[] a1 = new int[] { 10, 20, 30, 40, 50 };
        int[] a2 = new int[] { 5, 15, 25, 35, 45 };

        float median = getMedianByCombining(a1, a2);
        System.out.println("median is " + median);
    }
}
