public class FirstOccurrenceSearch25 {

    public static int firstOccurrence(int[] a,int x,int left,int right){
        int mid=left+(right-left)/2;
        if(left>right) return -1;
        else if(a[mid]<x) return firstOccurrence(a, x,mid+1, right);
        else if(a[mid]>x)return firstOccurrence(a, x, left, mid-1);
        else {
            if(mid==0 || (a[mid-1]!=a[mid])){
                return mid;
            }
            else return firstOccurrence(a, x, left, mid-1);
        }
    }
    public static void main(String[] args){
        int[] a=new int[]{20,20,20,20,20,20,20,20};
        int x=20;
        int index=firstOccurrence(a,x,0,a.length-1);
        System.out.println("first occurrence of ele is "+index);
    }
}
