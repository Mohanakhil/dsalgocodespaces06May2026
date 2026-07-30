public class LastOccurrenceOfElement27 {
    public static int getLastOccurrence(int[] a,int x){
        for(int i=a.length-1;i>=0;i--){
            if(a[i]==x) return i;
        }
        return -1;
    }

    public static int getLastOccurrenceUsingBinarySearch(int[] a,int x,int left,int right){
        int mid=left+(right-left)/2;
        if(left>right) return -1;
        if(a[mid]<x) return getLastOccurrenceUsingBinarySearch(a, x,mid+1, right);
        else if(a[mid]>x) return getLastOccurrenceUsingBinarySearch(a, x, left,mid-1);
        else {
            if(mid>=a.length-1||(a[mid]!=a[mid+1])){
                return mid;
            }
            else return getLastOccurrenceUsingBinarySearch(a, x, mid+1, right);
        }
    }
    public static void main(String[] args){
        int[] a=new int[]{10,15,20,20,40,40};
        int x=40;

        //naive solution is to traverse from right and get last occurrence
        int index= getLastOccurrence(a,x);
        System.out.println("last occurrence of element is "+index);


        //using binary search to find the last occurrence of element
        index=getLastOccurrenceUsingBinarySearch(a,x,0,a.length-1);
        System.out.println("last occurrence using binary search is "+index);
    }
}
