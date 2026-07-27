public class FindMaxSumOfKConsecutiveEle20 {

    public static int getMaxSumOfKConsec(int[] a,int k){
        int max=0;
        for(int i=0;i<a.length-k;i++){
            int j=i;
            int sum=0,temp=k;
            while(temp>0){
                sum=sum+a[j];
                j++;
                temp--;
            }
            max=Math.max(max,sum);
        }
        return max;
    }
    public static int getMaxSumSlidingWind(int[] a,int k){
        //calculate intial window sum
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+a[i];
        }
        //move through the elements using window
        int max=sum;
        for(int i=k;i<a.length;i++){
            sum=sum-a[i-k]+a[i];
            max=Math.max(sum,max);
        }
        return max;
    }
    public static void main(String[] args){
        int[] a=new int[]{5,-10,6,90,3};
        int k=2;//k can be anything
        int max=getMaxSumOfKConsec(a,k);
        System.out.println("max sum of K consecutive is "+max);

        max=getMaxSumSlidingWind(a,k);
        System.out.println("max sum of k consecut using window sliding technique "+max);
    }
}
