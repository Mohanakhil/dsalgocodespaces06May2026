import java.util.HashSet;

public class IntersectionOfUnSortedArrays03 {
    public static void printIntersectionUnsortedArrays(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }

    public static void printIntersectionUsingHashSet(int[] a, int[] b) {
        // first put b array into HashSet
        HashSet<Integer> h = new HashSet<Integer>();
        for (int i = 0; i < b.length; i++) {
            h.add(b[i]);
        }
        // now by iterating a array check in hashset
        for (int i = 0; i < a.length; i++) {
            if (h.contains(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] { 10, 15, 20, 25, 30, 50 };
        int[] b = new int[] { 30, 5, 15, 80 };
        printIntersectionUnsortedArrays(a, b);
        System.out.println("using optimized hashset approach");
        printIntersectionUsingHashSet(a, b);
    }
}