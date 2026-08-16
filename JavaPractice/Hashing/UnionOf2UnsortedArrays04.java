import java.util.HashSet;
import java.util.Iterator;

public class UnionOf2UnsortedArrays04 {

    public static void printUnionOfUnsortedArrays(int[] a, int[] b) {
        // naive solution is take help of distinct extra array
        int[] distinct = new int[a.length + b.length];
        // iterate a and put the unique elements into distinct array
        int res = 0, k = 0;
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < distinct.length; j++) {
                if (a[i] == distinct[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                res++;
                distinct[k++] = a[i];
            }
        }

        // similarly do for array b also
        for (int i = 0; i < b.length; i++) {
            boolean flag = false;

            for (int j = 0; j < distinct.length; j++) {
                if (b[i] == distinct[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                res++;
                distinct[k++] = b[i];
            }
        }

        // now union is the distinct array just print distinct till res elements
        System.out.println("\ncount of elements of distinct array is " + res);
        for (int i = 0; i < k; i++) {
            System.out.print(distinct[i] + " ");
        }
    }

    public static void printUnionUsingHashSet(int[] a, int[] b) {
        // take hash set and keep adding elements a and b
        HashSet<Integer> h = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            h.add(a[i]);
        }
        // similarly add array b also
        for (int i = 0; i < b.length; i++) {
            h.add(b[i]);
        }
        // now iterate and print set
        Iterator<Integer> itr = h.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] { 10, 30, 10 };
        int[] b = new int[] { 5, 10, 5 };

        printUnionOfUnsortedArrays(a, b);
        System.out.println("\n using hashing technique");
        printUnionUsingHashSet(a, b);
    }
}
