import java.util.Arrays;

public class MergeSorting39 {
    public static void merge(int[] a,int low,int mid,int high){
        int left=low,right=mid+1;
        int index=0;
        int[] temp=new int[high-low+1];
        while(left<=mid&&right<=high){
            if(a[left]<=a[right]){
                temp[index++]=a[left++];
            }
            else{
                temp[index++]=a[right++];
            }
        }
        while(left<=mid){
            temp[index++]=a[left++];
        }
        while(right<=high){
            temp[index++]=a[right++];
        }

        //copy back to array a
        for(int i=0;i<temp.length;i++){
            a[low+i]=temp[i];
        }
    }

    public static void mergeSort(int[] a, int left, int right) {
        if (right > left) {
            int mid = left + (right - left) / 2;
            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] { 30, 10, 18, 3, 2, 16, 50, 1 };
        mergeSort(a, 0, a.length - 1);
        System.out.println("Array after merge sorting "+Arrays.toString(a));
    }
}
