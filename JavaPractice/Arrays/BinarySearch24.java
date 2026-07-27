public class BinarySearch24 {

    public static int binarySearch(int[] a, int x) {
        int left = 0, right = a.length - 1;
        int mid = (left + (right - left)) / 2;
        while (left < right) {
            if (x > a[mid]) {
                left = mid + 1;
            } else if (x < a[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 10, 20, 30, 40, 50, 60 };
        int x = 20;
        int index = binarySearch(a, x);
        System.out.println("ele is present at index= " + index);
    }
}
