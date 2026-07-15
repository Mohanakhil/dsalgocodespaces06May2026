import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray09_v2 {

    public static int[] removeDuplicatesUsingExtraSpace(int[] a){
        int[] temp=new int[a.length];
        temp[0]=a[0];
        int index=1;
        for(int i=0;i<a.length;i++){
            if(a[i]!=temp[index-1]){
                temp[index]=a[i];
                index++;
            }
        }
        return temp;
    }

    public static int[] removeDuplicates(int[] a){
        int index=1;
        for(int i=1;i<a.length;i++){
            if(a[i]!=a[i-1]){
                a[index]=a[i];
                index++;
            }
        }
        return a;
    }
    public static void main(String[] args){
        int[] a=new int[]{10,20,20,20,20,30,30,30};

        int[] t=removeDuplicatesUsingExtraSpace(a);

        System.out.println("given array was "+Arrays.toString(a));

        System.out.println("array after removing duplicates is "+Arrays.toString(t));

        int[] t2=removeDuplicates(a);
        System.out.println("using second way inplace removing "+Arrays.toString(t2));



    }
}
