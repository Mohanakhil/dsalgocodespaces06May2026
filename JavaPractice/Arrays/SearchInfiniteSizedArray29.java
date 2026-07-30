public class SearchInfiniteSizedArray29 {
    public static int findElementX(int[] a,int x){
        int left=0,right=a.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(a[mid]<x) {
                left=mid+1;
            }
            else if(a[mid]>x){
                right=mid-1;
            }
            else return mid;
        }
        return -1;
    }

    public static int findElementXMethod2(int[] a,int x){
        int index=0;
        while(true){
            if(a[index]==x) {return index;}
            else if(a[index]>x) {return -1;}
            index++;
        }
    }
    public static void main(String[] args){
        int[] a=new int[]{1,10,15,20,40,80,90,100,120,500};
        int x=15;
        int index=findElementX(a,x);
        if(index==-1){
            System.out.println("element is not found in array");
        }
        else{
            System.out.println("ele is present at " + index);
        }
       


        index=findElementXMethod2(a,x);
        if (index == -1) {
            System.out.println("element is not found in array");
            return;
        }
        System.out.println("ele is present at " + index);
    }
}
