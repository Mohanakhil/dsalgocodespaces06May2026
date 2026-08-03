import java.util.Arrays;

public class RepeatingElement35 {

    public static int getRepeatedEle1(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    return a[i];
                }
            }
        }
        return -1;
    }

    public static int getRepeatedEle2(int[] a) {
        Arrays.sort(a);
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i - 1] == a[i]) {
                return a[i];
            }
        }
        return -1;
    }

    public static int getRepeatedEle3(int[] a) {
        boolean[] b = new boolean[a.length - 1]; // we are taking max size a.length-2, given
        for (int i = 0; i < b.length; i++) {
            if (b[a[i]] == true) {
                System.out.println("boolean array formed is " + Arrays.toString(b));
                return a[i];
            }
            b[a[i]] = true;
        }
        return -1;
    }

    public static int getRepeatedEle4(int[] a) {
        boolean flag = false;
        int next = 0;
        while (flag != true) {
            int ele = a[next];
            next = a[ele];
            if (ele == next) {
                flag = true;
                return ele;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 0, 2, 1, 3, 2, 2 };

        // using o(n2) approach
        int repeated = getRepeatedEle1(a);
        System.out.println("repeated ele is " + repeated);

        // using O(n) but sorting the array
        repeated = getRepeatedEle2(Arrays.copyOf(a, a.length));
        System.out.println("repeated ele using 2nd way is " + repeated);

        // using O(logn) but taking extra space
        repeated = getRepeatedEle3(a);
        System.out.println("repeated ele using 3rd way is " + repeated);

        int[] arr = new int[] { 1, 3, 2, 4, 6, 5, 7, 3 };
        repeated = getRepeatedEle4(arr);
        System.out.println("repeated ele using 4th way is " + repeated);

    }
}
