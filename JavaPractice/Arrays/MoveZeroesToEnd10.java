import java.util.Arrays;

public class MoveZeroesToEnd10 {
    public static int[] moveZeroesToEndExtraSpace(int[] a){
        int temp[]=new int[a.length];
        int index=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                temp[index]=a[i];
                index++;
            }
        }
        return temp;
    }
    public static int[] moveZeroesToEnd(int[] a){
        int index=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                a[index]=a[i];
                a[i]=0;
                index++;
            }
        }
        return a;
    }

    public static void main(String[] args){
        int[] a=new int[]{0,8,5,0,10,0,20,0,0};

        int[] res=moveZeroesToEndExtraSpace(a);
        System.out.println("after moving zero to end "+Arrays.toString(res));

        System.out.println();

        res=moveZeroesToEnd(a);
        System.out.println("In place moving zeroes to end "+Arrays.toString(res));
    }
}
