import java.util.Arrays;

public class PrefixSum22 {
    public static int getPrefixSum(int[] a,int left,int right){
        int sum=0;
        for(int i=left;i<=right;i++){
            sum=sum+a[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] a=new int[]{2,8,3,9,6,5,4};


        int s1=getPrefixSum(a,0,2);
        System.out.println("sum is "+s1);
        int s2=getPrefixSum(a,1,3);
        System.out.println("sum is " + s2);
        int s3=getPrefixSum(a,2,6);
        System.out.println("sum is " + s3);


        //using extra array which contains prefix sum
        int[] prefixSum=new int[a.length];
        prefixSum[0]=a[0];
        for(int i=1;i<a.length;i++){
            prefixSum[i]=prefixSum[i-1]+a[i];
        }
        System.out.println("prefix sum array is  "+Arrays.toString(prefixSum));

        int left=0,right=2;
        System.out.println(prefixSum[2]);
        
        left=1;right=3;
        System.out.println(prefixSum[right]-prefixSum[left-1]);

        left=2;right=6;
        System.out.println(prefixSum[right]-prefixSum[left-1]);

    }
}
