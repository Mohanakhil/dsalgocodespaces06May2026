public class LeadersOfArray13 {
    public static void printLeadersOfArray1(int[] a){
        for(int i=0;i<a.length;i++){
            boolean flag = true;
            for(int j=i+1;j<a.length;j++){
                if(a[j]>=a[i]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(a[i] + " ");
            }
        }
    }

    public static void printLeadersOfArrayOptimized(int[] a){
        System.out.print(a[a.length-1]+" ");
        int currentLeader=a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            if(a[i]>currentLeader){
                System.out.print(a[i]+" ");
                currentLeader=a[i];
            }
        }
    }
    public static void main(String[] args){
        int[] a=new int[]{7,10,4,10,6,5,2};

        printLeadersOfArray1(a);
        System.out.println();
        int[] b=new int[]{30,20,10};
        printLeadersOfArray1(b);

        System.out.println();
        printLeadersOfArrayOptimized(a);
    }
}
