import java.util.Arrays;

public class Merge2SortedArrays37 {
    public static void main(String[] args){
        int[] a=new int[]{10,20,35};
        int[] b=new int[]{5,50,50};
        int[] combined=new int[a.length+b.length];
        int i=0,j=0,index=0;
        while(i<a.length&&j<b.length){
            if(b[j]<a[i]){
                combined[index++]=b[j++];
            }
            else{
                combined[index++]=a[i++];
            }
        }
        while(i<a.length){
            combined[index++]=a[i++];
        }
        while(j<b.length){
            combined[index++]=b[j++];
        }
        System.out.println("After merging "+Arrays.toString(combined));
    }
}
