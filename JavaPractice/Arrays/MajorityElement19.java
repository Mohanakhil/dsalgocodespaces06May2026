public class MajorityElement19 {
    public static int getMajorityEle(int[] a){
        //majority ele is which appears more than n/2 times in array
        int index=-1;
        for(int i=0;i<a.length;i++){
            int count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }  
            }
            if(count>a.length/2){
                index=i;
                return index;
            }
        }
        return index;
    }
    public static void main(String[] args){
        int[] arr=new int[]{2,3,4,5,5,5,5};

        int index=getMajorityEle(arr);
        if(index==-1){
            System.out.println("no majority ele ");
            return;
        }
        System.out.println("majority ele is "+arr[index]);
    }
}
