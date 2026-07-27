import java.util.Arrays;

public class EquilibriumPointArray23 {
    public static boolean isEqPointPresent(int[] a){
        for(int i=0;i<a.length;i++){
            int leftSum=0;
            for(int left=0;left<i;left++){
                leftSum=leftSum+a[left];
            }
            int rightSum=0;
            for(int right=i+1;right<a.length;right++){
                rightSum=rightSum+a[right];
            }
            if(leftSum==rightSum){
                return true;
            }
        }           
        return false;
    }

    public static boolean isEquPointPresentOptimized(int[] a){
        int leftSum=0;
        int rightSum=0;
        for(int right=a.length-1;right>0;right--){
            rightSum=rightSum+a[right];
        }
        if(leftSum==rightSum){
            return true;
        }
        for(int k=1;k<a.length-1;k++){
            leftSum=leftSum+a[k-1];
            rightSum=rightSum-a[k];
            if(leftSum==rightSum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] a=new int[]{3,4,8,-9,9,7};

        boolean flag=isEqPointPresent(a);
        if(flag){
            System.out.println("Equ point exists ");
        }
        else{
            System.out.println("Equ point does not exists ");
        }

        flag=isEquPointPresentOptimized(a);
        if (flag) {
            System.out.println("Equ point exists in 2nd way also");
        } else {
            System.out.println("Equ point does not exists in 2nd way");
        }
        //using computing prefix sum and suffix sum arrays
        int[] prefix=new int[a.length];
        prefix[0]=a[0];
        int index=1;
        for(int i=1;i<a.length;i++){
            prefix[index]=prefix[index-1]+a[i];
            index++;
        }
        System.out.println("prefix array is "+Arrays.toString(prefix));
        int[] suffix=new int[a.length];
        suffix[a.length-1]=a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]+a[i];
            index--;
        }
        System.out.println("Suffix array is "+Arrays.toString(suffix));

    }
}
