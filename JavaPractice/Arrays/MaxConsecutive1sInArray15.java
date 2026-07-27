public class MaxConsecutive1sInArray15 {
    public static int getMaxConsecutive1(int[] a){
        int count=0;
        int maxCount=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                count++;
                maxCount=Math.max(count,maxCount);
            }
            else{
                count=0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args){
        int[] arr=new int[]{1,0,1,1,1,1,0,1,1};

        int maxConsecutive=getMaxConsecutive1(arr);
        System.out.println("max consecutive 1s are "+maxConsecutive);
    }
}
