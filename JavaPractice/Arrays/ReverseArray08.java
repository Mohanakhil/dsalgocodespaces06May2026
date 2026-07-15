import java.util.Arrays;

public class ReverseArray08 {
    public static int[] reverseArrayExtraSpace(int[] a){
        int helper[]=new int[a.length];
        int index=0;
        for(int i=a.length-1;i>=0;i--){
            helper[index]=a[i];
            index++;
        }
        return helper;
    }
    public static int[] reverseArray(int[] a){
        int left=0,right=a.length-1;
        while(left<right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
        return a;
    }
    public static void main(String[] args){
        int[] a=new int[]{10,5,7,30,222};

        int[] b=reverseArrayExtraSpace(a);
        System.out.println("reversed array is "+Arrays.toString(b));

        b=reverseArray(a);
        System.out.println("array after reversal is "+Arrays.toString(b));
    }
}
