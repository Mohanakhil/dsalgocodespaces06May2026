public class SubArrayWithGivenSum21 {

    public static boolean isSubArrayPresent(int[] a,int sum){
        for(int i=0;i<a.length;i++){
            int sCalc = a[i];
            for(int j=i+1;j<a.length;j++){
                if (sCalc == sum) {
                    return true;
                }
                sCalc = sCalc + a[j];
            }
        }
        return false;
    }

    public static boolean isSubArrayPresentDynamicWindow(int[] a,int sum){
        int current=0,start=0;
        for(int end=0;end<a.length;end++){
            current=current+a[end];
            while(current>sum){
                current=current-a[start];
                start++;
            }
            if(current==sum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] a=new int[]{1,4,0,0,3,10,5};
        int givenSum=7;
        boolean flag=isSubArrayPresent(a,givenSum);
        if(flag){
            System.out.println("subarray is present");
        }
        else{
            System.out.println("subarray not present");
        }

        flag=isSubArrayPresentDynamicWindow(a,givenSum);
        if (flag) {
            System.out.println("subarray is present");
        } else {
            System.out.println("subarray not present");
        }
        
    }
}
