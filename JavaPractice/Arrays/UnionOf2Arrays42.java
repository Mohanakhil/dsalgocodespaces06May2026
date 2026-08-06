public class UnionOf2Arrays42 {

    public static void unionOf2Arrays(int[] a, int[] b) {
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (i > 0 && a[i] == a[i - 1]) {
                continue;
            }

            if (j > 0 && a[j] == a[j - 1]) {
                continue;
            }

            if (a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else if (b[j] < a[i]) {
                System.out.print(b[j] + " ");
                j++;
            } else {
                System.out.print(a[i] + " "); // if both are equal print either any one
                i++;
                j++;
            }
        }
        while (i < a.length) {
            System.out.print(a[i] + " ");
            i++;
        }
        while (j < b.length) {
            System.out.print(b[j] + " ");
            j++;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] { 3, 5, 8, 9 };
        int[] b = new int[] { 2, 8, 9, 10, 15 };

        unionOf2Arrays(a, b);
        System.out.println("\nunion of 2 arrays printed above\n");
    }
}
