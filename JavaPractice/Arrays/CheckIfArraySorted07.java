public class CheckIfArraySorted07 {
    public static boolean checkArraySorted(int[] a){
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] a=new int[]{8,12,2,15};

        boolean flag=checkArraySorted(a);
        System.out.println(flag?"Its non decreasing array":"array is decreasing");
    }
}
