public class FindPairWithGivenSum32 {
    public static boolean findPairGivenSum(int[] a,int sum){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==sum){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean findPairsGivenSumTwoPointer(int[] a,int sum){
       int i=0,j=a.length-1;
       while(i<j){
        if(a[i]+a[j]==sum){
            return true;
        }
        else if(a[i]+a[j]>sum){
            j=j-1;
        }
        else if(a[i]+a[j]<sum){
            i=i+1;
        }
       }
       return false;
    }
    public static void main(String[] args){
        int[] a=new int[]{2,5,8,12,30};
        int sum=17;
        boolean flag=findPairGivenSum(a,sum);
        System.out.println("naive solution boolean result= "+flag);

        //given is a sorted array so trying binarysearch for optimum
        flag=findPairsGivenSumTwoPointer(a,sum);
        System.out.println("using 2 pointer "+flag);
    }
}
