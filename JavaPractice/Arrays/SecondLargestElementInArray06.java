public class SecondLargestElementInArray06 {
    public static int getSecondLargestElementIndex(int[] a){
        int max=a[0],secondMax=a[1];
        int index=0,secondMaxIndex=-1;
        for(int i=2;i<a.length;i++){
            if(a[i]>max){
                secondMax=max;
                secondMaxIndex=index;
                max=a[i];
                index=i;
            }
            else if(a[i]>secondMax&&a[i]<max){
                secondMax=a[i];
                secondMaxIndex=i;
            }
        }
        return secondMaxIndex;
    }
    public static void main(String[] args){
        int a[]=new int[]{10,5,8,20,12,20};

        int index=getSecondLargestElementIndex(a);
        if(index==-1){
            System.out.println("no second largest ele in array");
        }
        else{
            System.out.println("second max ele in arr index = " + index + " and ele= " + a[index]);
        }
    }
}
