import java.util.HashSet;

public class SubArrayWithGivenSum07 {
    public static boolean findSubArrayWithGivenSum(int[] a, int sum) {

        for (int i = 0; i < a.length; i++) {
            int prefixSum = 0;
            for (int j = i; j < a.length; j++) {
                prefixSum = prefixSum + a[j];
                if (prefixSum == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean findSubArrayGivenSumAndHashing(int[] a, int sum) {
        // using prefix-sum searching in hashset
        int prefixSum = 0;
        HashSet<Integer> h = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            prefixSum = prefixSum + a[i];
            if (prefixSum == sum) {
                return true;
            }
            int target = prefixSum - sum;
            if (h.contains(target)) {
                return true;
            }
            h.add(prefixSum);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 5, 8, 6, 13, 3, -1 };
        int sum = 22;
        boolean flag = findSubArrayWithGivenSum(a, sum);
        System.out.println("using naive way subarray given sum flag= " + flag);
        flag = findSubArrayGivenSumAndHashing(a, sum);
        System.out.println("\nusing hashing and prefixsum flag= " + flag);
    }
}
