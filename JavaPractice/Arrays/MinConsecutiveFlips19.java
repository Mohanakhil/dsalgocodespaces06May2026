public class MinConsecutiveFlips19 {

    public static int getMinConsecutiveFlips(int[] a){
        int zeros_grp_count=0,ones_grp_count=0;
        for(int i=1;i<a.length-1;i++){
            if(a[i-1]==0&&a[i-1]==a[i]){
                zeros_grp_count++;
            }
            else if(a[i-1]==1&a[i-1]==a[i]){
                ones_grp_count++;
            }
        }
        return Math.min(zeros_grp_count, ones_grp_count);
    }
    public static void main(String[] args){
        int[] a=new int[]{1,0,0,0,1,0,0,1,1,1,1};

        int min=getMinConsecutiveFlips(a);
        System.out.println("min flips are "+min);
    }
}
