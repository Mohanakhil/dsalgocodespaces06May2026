
public class IntersectionOf2SortedArrays41 {
    // public static void printArray(int[] arr, int length) {
    // for (int i = 0; i < length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // }

    // public static int removeDuplicates(int[] arr) {
    // int index = 0;
    // for (int i = 0; i < arr.length - 1; i++) {
    // if (arr[i] != arr[i + 1]) {
    // arr[index++] = arr[i];
    // }
    // }
    // arr[index] = arr[arr.length - 1];
    // int len = index + 1;
    // printArray(arr, len);
    // System.out.println("removed duplicates ");
    // return len;
    // }

    public static void intersection(int[] a, int[] b) {
        // naive method
        // int aLength = removeDuplicates(a);
        // int bLength = removeDuplicates(b);

        int i = 0, j = 0;
        while (i < a.length && j < b.length) {

            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (a[i] < b[j]) {
                i++;
            } else if (b[j] < a[i]) {
                j++;
            } else { // equals condition
                System.out.print(a[i] + " ");
                i++;
                j++;
            }

        }
    }

    public static void intersection2(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i > 0 && a[i] == a[i - 1])
                continue;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] { 1, 20, 20, 21, 40, 40, 60 };
        int[] b = new int[] { 2, 20, 20, 20, 21, 40 };

        System.out.println("using 2 iterators");
        intersection(a, b);

        System.out.println();
        System.out.println("using second way naive method of using 2 loops checking each one");
        intersection2(a, b);
    }
}
