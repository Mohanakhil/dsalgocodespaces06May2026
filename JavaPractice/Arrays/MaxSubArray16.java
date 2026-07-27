import java.util.Arrays;

public class MaxSubArray16{

public static int getMaxSubArray(int[] a){
    int max=a[0];
    for(int i=0;i<a.length;i++){
       int sum=a[i]; 
        for(int j=i+1;j<a.length;j++){
            sum=sum+a[j];
            if(sum>max){
                max=sum;
            }
        }
        max=Math.max(sum,max);
    }
    return max;
}

public static int getMaxSubArrayOptimized(int[] a){
    int sum=a[0];
    int max=a[0];
    for(int i=1;i<a.length;i++){
        sum=sum+a[i];
        if(sum>a[i]){
            max=sum;
        }
        else{
            max=a[i];
            sum=a[i];
        }
    }
    return max;
}
public static void main(String[] args){
    int[] a=new int[]{-3,8,-2,4,-5,6};
    //should only take contiguous elements of array

    int max=getMaxSubArray(a);
    System.out.println("max subarray is "+max);


    max=getMaxSubArrayOptimized(a);
    System.out.println("max subarray o(1) " + max);

}
}