import java.util.Arrays;
import java.util.Collections;

public class FindMaxMinInArray01{

public static int getMaxInArray(int[] a){
    int max=a[0];
        for(int ele:a){
        if(ele>max){
            max=ele;
        }
        }
    return max;
}

public static int getMinInArray(int[] a){
int min=a[0];
    for(int i=1;i<a.length;i++){
        if(a[i]<min){
        min=a[i];
        }
    }
    return min;
}
public static void main(String[] args) {
    int[] a=new int[]{5,4,6,3};
    int max=getMaxInArray(a);
    System.out.println("max is "+max);
    int min=getMinInArray(a);
    System.out.println("min is"+min);

    System.out.println("max using streams "+Arrays.stream(a).sorted().toArray()[a.length-1]);

    System.out.println
    (Arrays.stream(a)
    .boxed()
    .sorted(Collections.reverseOrder())
    .mapToInt(ele->ele.intValue())
    .toArray()[0]);

    System.out.println("min using streams "+Arrays.stream(a).sorted().toArray()[0]);

    System.out.println("mins using inbuilt "+Arrays.stream(a).min().getAsInt());
}
}