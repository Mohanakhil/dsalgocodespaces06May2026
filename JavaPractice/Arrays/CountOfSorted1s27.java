public class CountOfSorted1s27 {
    public static int getCountOf1s(int[] a){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                count++;
            }
        }
        return count;
    }
    public static int getCountOf1sOptimized(int[] a){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                count++;
            }
            else{
                return a.length-count;
            }
        }
        return a.length-count;
    }

    public static int getFirstOccurrenceOf1(int[] a,int x,int left,int right){
        int mid=left+(right-left)/2;
        if(left>right) return -1;
        if(a[mid]<x) return getFirstOccurrenceOf1(a, x,mid+1, right);
        else if(a[mid]>x) return getFirstOccurrenceOf1(a, x, left, mid-1);
        else{
            if(mid==0|| (a[mid-1]!=a[mid])){
                return mid;
            }
            else return getFirstOccurrenceOf1(a, x, left, mid-1);
        }
    }
    public static void main(String[] args){
        int[] a=new int[]{0,0,0,0,1,1,1};
        int count=getCountOf1s(a);
        System.out.println("count of 1s = "+count);
        //given array is sorted binary 
        count=getCountOf1sOptimized(a);
        System.out.println("count of 1s using optimized = " + count);

        // using first occurrence of 1
        int index=getFirstOccurrenceOf1(a,1,0,a.length-1);
        System.out.println("using binsearch = "+(a.length-index));

    }
}
