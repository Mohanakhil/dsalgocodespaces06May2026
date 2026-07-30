public class SearchInSortedRotatedArray30 {

    public static int findIndexOfX(int[] a,int x){
        int left=0,right=a.length-1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(a[mid]==x){
                return mid;
            }
            else if(a[left]<=a[mid]){
                //left side of array is sorted
                if(x>=a[left]&&x<a[mid]){
                    //do linear search in left array
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else{
                //right side of array is sorted
                if(x>a[mid]&&x<=a[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] a=new int[]{100,200,300,400,20,30,40};
        int x=30;
        int index=findIndexOfX(a,x);
        System.out.println("ele is present at "+index);
    }
}
