import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray09 {
    public static int removeDuplicatesSortedArray(int[] a){
        int index=1;
        for(int i=1;i<a.length;i++){
            if(a[i]!=a[i-1]){
               a[index]=a[i];
               index++;
            }
        }
        return index;
    }

    public static int[] removeDuplicatesUsingExtraSpace(int[] a){
        int[] tempArray=new int[a.length];
        tempArray[0]=a[0];
        int index=1;
        for(int i=1;i<a.length-1;i++){
            if(tempArray[index-1]==a[i]){
                tempArray[index]=a[i];
                index++;
            }
        }
        return tempArray;
    }

    public static void main(String[] args){
        int[] a=new int[]{10,20,20,30,30,30};

        int index=removeDuplicatesSortedArray(a);

        System.out.println("Array after removing duplicates ");
        for(int i=0;i<index;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        int[] t=removeDuplicatesUsingExtraSpace(a);
        System.out.println("After removing duplicates "+Arrays.toString(t));
    }
}
