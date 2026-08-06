import java.util.Arrays;

public class BubbleSorting35 {
    public static void bubbleSort(int[] a) {
        for(int i=0;i<a.length-1;i++){
            boolean swap=false;
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap=true;
                }
            }
            if(swap==false){
                break ;  
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] { 2, 10, 8, 7 ,3,1,5,4,9,8,6};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}