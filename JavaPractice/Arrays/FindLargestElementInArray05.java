public class FindLargestElementInArray05 {
    public static void main(String[] args){
        int[] a=new int[]{5,8,10,20};
        int largest=a[0];
        int index=0;
        for(int i=1;i<a.length;i++){
            if(a[i]>largest){
                largest=a[i];
                index=i;
            }
        }
        System.out.println("max is "+largest+" its present at index ="+index);
    }
}
