import java.util.Arrays;

public class LeftRotateArrayDPlaces12 {

    public static int[] leftRotate(int[] b){
        int temp = b[0];
        for (int i = 1; i < b.length; i++) {
            b[i - 1] = b[i];
        }
        b[b.length - 1] = temp;
        return b;
    }
    public static int[] leftRotateByDPlaces(int[] b,int d){
        while(d>0){
           b=leftRotate(b);
            d--;
        }
        return b;
    }

    public static int[] leftRotateDPlacesExtraSpace(int[] a,int d){
        int[] t=new int[a.length];
        int index=0;
        for(int i=d;i<a.length;i++){
            t[index]=a[i];
            index++;
        }
        for(int i=0;i<d;i++){
            t[index]=a[i];
            index++;
        }
        return t;
    }

    public static void reverse(int[] arr,int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;right--;
        }
    }

    public static int[] leftRotate(int[] a,int d){
        reverse(a,0,d-1);
        reverse(a,d,a.length-1);
        reverse(a,0,a.length-1);
        return a;
    }

    public static void main(String[] args){
        int[] a=new int[]{1,2,3,4,5,6};

        int d=3;
        d=d%(a.length);

        int[] copy=Arrays.copyOf(a,a.length);
        int[] copy2=Arrays.copyOf(a, a.length);

        int[] t1=leftRotateByDPlaces(a,d);
        System.out.println("array rot after "+d+" times is "+Arrays.toString(t1));

        int[] t2=leftRotateDPlacesExtraSpace(copy,d);
        System.out.println("array rotation second way "+Arrays.toString(t2));

        //most efficient solution

        int[] t3=leftRotate(copy2,d);
        System.out.println("array rotation third efficient way "+Arrays.toString(t3));


    }
}
