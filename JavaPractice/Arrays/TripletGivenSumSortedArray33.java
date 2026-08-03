public class TripletGivenSumSortedArray33 {
    public static boolean findIfTripletExists1(int[] a, int sum) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == sum) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean findIfTripletExistsBy2Pointer(int[] a, int sum) {
        for (int i = 0; i < a.length; i++) {
            int left = i + 1, right = a.length - 1;
            while (left < right) {
                int target = sum - a[i];
                if (a[left] + a[right] == target) {
                    return true;
                } else if (a[left] + a[right] > target) {
                    right = right - 1;
                } else if (a[left] + a[right] < target) {
                    left = left + 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 2, 3, 4, 8, 9, 20, 40 };
        int sum = 32;
        boolean flag = findIfTripletExists1(a, sum);
        System.out.println("triplets with given sum in array " + flag);

        // given sorted array
        // iterate each ele and for remaining array apply 2 pointer approach
        flag = findIfTripletExistsBy2Pointer(a, sum);
        System.out.println("triplets with given sum using 2 pointer approach " + flag);
    }
}
