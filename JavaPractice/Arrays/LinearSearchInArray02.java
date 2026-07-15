public class LinearSearchInArray02{
    public static int findElementIndexInArray(int[] a,int x){
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] a=new int[]{4,6,5,3,8};

        int x=6;
        int index=findElementIndexInArray(a,x);
        System.out.println("index = "+index);
    }
}