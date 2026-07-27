import java.util.Arrays;

public class LeftRotateArray11 {
    public static int[] leftRotateArray(int[] b){
        int temp=b[0];
        for(int i=1;i<b.length;i++){
            b[i-1]=b[i];
        }
        b[b.length-1]=temp;
        return b;
    }

    public static void main(String[] args){
        int[] a=new int[]{1,2,3,4,5};
        int[] t1=leftRotateArray(a);
        System.out.println("Array after left rotate = "+Arrays.toString(t1));

        
    }
}
