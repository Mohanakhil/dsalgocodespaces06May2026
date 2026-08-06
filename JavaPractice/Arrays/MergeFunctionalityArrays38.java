import java.util.Arrays;

public class MergeFunctionalityArrays38 {

    public static int[] merge(int[] a,int[] b){
        int i=0,j=0,index=0;
        int[] combined=new int[a.length+b.length];
        while(i<a.length&&j<b.length){
            if (a[i] < b[j]) {
                combined[index++] = a[i++];
            } 
            else {
                combined[index++] = b[j++];
            }
        }
        while(i<a.length){
            combined[index++]=a[i++];
        }
        while(j<b.length){
            combined[index++]=b[j++];
        }
        return combined;
    }
    public static void main(String[] args){
        int[] a=new int[]{10,15,20,40,8,11,55};
        int low=0,high=a.length-1;
        int mid=3;
        int n1=mid-low+1;
        int n2=high-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];

        for(int i=0;i<n1;i++)
        {
            left[i]=a[low+i];
        }
        System.out.println(Arrays.toString(left));

        for(int i=0;i<n2;i++){
            right[i]=a[mid+i+1];
        }
        System.out.println(Arrays.toString(right));

        int[] comb=merge(left,right);
        System.out.println("combined array after merge is "+Arrays.toString(comb));
    }
}
