public class FindPeakElement31 {

    //naive solution  peak ele is greater than or equal to its neighbours there can be more than 1 peak eles
    public static void printPeakElements(int[] a){
        for(int i=1;i<a.length-1;i++){
            if(a.length==1){
                System.out.println(a[0]);
            }
            if(a[0]>a[1]){
                System.out.print(a[0]+" ");
            }
            if(a[a.length-1]>a[a.length-2]){
                System.out.print(a[a.length-1]);
            }
            if(a[i]>=a[i-1]&&a[i]>=a[i+1]){
                System.out.print(a[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        int[] a=new int[]{80,70,90};
        System.out.println("peak eles are ");
        printPeakElements(a);
        System.out.println();
    }
}
