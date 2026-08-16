import java.util.HashSet;

public class PairWithGivenSumInArray05 {
    public static boolean findPairWithGivenSum(int[] a, int sum) {
        // using naive solution
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean findPairWithGivenSumUsingHashing(int[] a, int sum) {
        HashSet<Integer> h1 = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            int target = sum - a[i];
            if (h1.contains(target)) {
                return true;
            } else {
                h1.add(a[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 3, 2, 8, 15, -8 };
        int sum = 17;
        boolean flag = findPairWithGivenSum(a, sum);
        System.out.println("using naive solution flag =  " + flag);

        flag = findPairWithGivenSumUsingHashing(a, sum);
        System.out.println("\n using hashing technique flag= " + flag);
    }
}
