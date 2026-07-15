import java.util.Arrays;

public class DeleteEleInArray04 {
    public static boolean deleteEleInArray(int[] a,int x){
        for(int i=0;i<a.length;i++){
            if(x==a[i]){
                int j=i;
                for(j=i;j<a.length-1;j++){
                    a[j]=a[j+1];
                }
                a[j]=0;
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] a=new int[]{3,8,12,5,6,9,11,14,1};
        int x=3;
        boolean deleted=deleteEleInArray(a,x);
        if(deleted){
            System.out.println("ele deleted successfully");
            System.out.println(Arrays.toString(a));
        }
        else{
            System.out.println("ele not found and cannot be deleted");
        }
    }
}
