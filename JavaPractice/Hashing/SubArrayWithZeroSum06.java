import java.util.HashSet;

public class SubArrayWithZeroSum06 {
    public static boolean findSubArrayWithZeroSum(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int sum = a[i];
            for (int j = i + 1; j < a.length; j++) {
                sum = sum + a[j];
                if (sum == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean findSubArrayWithZeroSumHashing(int[] a) {
        // calculate prefix sum and keep checking in hash
        int prefixSum = 0;
        HashSet<Integer> h = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            prefixSum = prefixSum + a[i];
            if (h.contains(prefixSum)) {
                return true;
            }
            if (prefixSum == 0) {
                return true;
            }
            h.add(prefixSum);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 1, 4, 13, -3, -10, 5 };
        boolean flag = findSubArrayWithZeroSum(a);
        System.out.println("sub array with zero sum flag= " + flag);

        flag = findSubArrayWithZeroSumHashing(a);
        System.out.println("\nSub Array with prefix sum hashing tech is flag= " + flag);
    }
}
