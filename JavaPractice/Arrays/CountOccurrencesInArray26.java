public class CountOccurrencesInArray26 {

    public static int getCountOfX(int[] a,int x){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==x) count++;
        }
        return count;
    }

    public static int getFirstOccurrence(int[] a,int x,int left,int right){
        int mid=left+(right-left)/2;
        if(left>right) return -1;
        if(a[mid]<x) return getFirstOccurrence(a, x, mid+1, right);
        else if(a[mid]>x) return getFirstOccurrence(a, x, left, mid-1);
        else {
            if(mid==0||a[mid]!=a[mid-1]){
                return mid;
            }
            else return getFirstOccurrence(a, x,left,mid-1);
        }
    }

    public static int getLastOccurrence(int[] a,int x,int left,int right){
        int mid=left+(right-left)/2;
        if(left>right) return -1;
        else if(a[mid]<x) return getLastOccurrence(a, x,mid+1, right);
        else if(a[mid]>x) return getLastOccurrence(a, x, left, mid-1);
        else{
            if(mid==a.length-1||(a[mid]!=a[mid+1])){
                return mid;
            }
            else return getLastOccurrence(a, x, mid+1, right);
        }
    }

    //given is a sorted array
    public static void main(String[] args){
        int[] a=new int[]{10,20,20,20,30,30,30,30,30,30};
        int x=30;
        int c=getCountOfX(a,x);
        System.out.println("ele is present "+c+" times");

        //given sorted array only
        //we can also get by get last occurence - get first occurrence index
        int firstOccurrence=getFirstOccurrence(a,x,0,a.length-1);
        int lastOccurrence=getLastOccurrence(a,x,0,a.length-1);
        System.out.println("count of occurrences of ele is "+(lastOccurrence-firstOccurrence+1));
    }
}
