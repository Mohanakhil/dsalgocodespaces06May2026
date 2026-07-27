public class MaxCircularSubArray18 {

    public static int getMaxCircularSubArray(int[] a){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            int sum=a[i];
            for(int j=(i+1)%(a.length);j!=i;j=(j+1)%(a.length)){
                sum=sum+a[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] a=new int[]{8,-4,3,-5,4};
        int m=getMaxCircularSubArray(a);
        System.out.println("max circular subarray is "+m);
    }
}
