import java.util.Arrays;

public class InsertEleInArray03 {
    public static void insertElementInArray(int[] a,int ele,int pos){
        int index=pos-1;
        for(int i=a.length-1;i>index;i--){
            a[i]=a[i-1];
        }
        a[index]=ele;
        return;
    }
    public static void main(String[] args){
        int[] a=new int[]{5,10,20,25,0};

        int ele=7;
        int pos=2;
        insertElementInArray(a,ele,pos);
        System.out.println(Arrays.toString(a));
    }
}
