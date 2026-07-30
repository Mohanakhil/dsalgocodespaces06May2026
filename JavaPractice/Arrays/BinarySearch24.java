public class BinarySearch24 {

    public static int binarySearch(int[] a, int x) {
        int left = 0, right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == x) {
                return mid;
            }
            else if(a[mid]<x){
                left = mid + 1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] a,int x,int left,int right){
        int mid=left+(right-left)/2;
        if(left>right) return -1;
        else if(a[mid]==x) return mid;
        else if(a[mid]<x) return binarySearchRecursive(a,x,mid+1,right);
        else return binarySearchRecursive(a,x,left,mid-1);
    }

    public static void main(String[] args) {
        int[] a = new int[] { 10, 20, 30, 40, 50, 60 };
        int x = 10;
        int index = binarySearch(a, x);
        System.out.println("ele is present at index= " + index);

        index=binarySearchRecursive(a,x,0,a.length-1);
        System.out.println("ele is present at index= " + index);
    }
}
