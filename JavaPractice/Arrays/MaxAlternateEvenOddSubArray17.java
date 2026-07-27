public class MaxAlternateEvenOddSubArray17 {

    public static int getLongestEvenOddSubArray(int[] a){
        int max=0,count=1;
        for(int i=1;i<a.length;i++){
            if((a[i]%2==0&&a[i-1]%2!=0)||(a[i]%2!=0&&a[i-1]%2==0)){
                count++;
            }
            else{
                count=1;
            }
            if(count>max){
                max=count;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a = new int[] {7,10,15,17,16,15,14,13,12,11};

        int max=getLongestEvenOddSubArray(a);
        System.out.println("longest even odd subarray length = "+max);
    }
}