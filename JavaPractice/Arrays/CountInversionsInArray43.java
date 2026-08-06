public class CountInversionsInArray43 {
    public static int getCountOfInversions(int[] a) {
        // naive method using 2 loops
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 2, 4, 1, 3, 5 };
        int count = getCountOfInversions(a);

        // 2,1 and 4,1 and 4,3 total 3 inversions

        System.out.println("\n using naive way count of  inversions is "+count);

    }
}
