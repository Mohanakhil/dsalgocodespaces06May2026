import java.util.Arrays;

public class MaxDifferenceInArray14 {

    public static int getMaxDifference1(int[] a){
        // max(a[j]-a[i]) but j>i
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[j] - a[i]) > max) {
                    max = a[j] - a[i];
                }
            }
        }
        return max;
    }

    public static int getMaxDifference2(int[] c){
        int min=c[0];
        int maxDifference=c[1]-c[0];
        for(int i=1;i<c.length;i++){
            int diff=c[i]-min;
            if(diff>maxDifference){
                maxDifference=diff;
            }
            if(c[i]<min){
                min=c[i];
            }
        }
        return maxDifference;
    }

    public static void main(String[] args){
        int[] a=new int[]{2,3,10,6,4,8,1};
        int max=getMaxDifference1(a);
        System.out.println("max difference is "+max);

        int[] b=new int[]{7,9,5,6,3,2};
        System.out.println(getMaxDifference1(b));

        //efficient solution below
        int[] c=new int[]{30,10,8,2};
        System.out.println("second way maxDiff is"+getMaxDifference2(c));
        System.out.println("second way maxDiff is" + getMaxDifference2(a));
        System.out.println("second way maxDiff is" + getMaxDifference2(b));
    }
}
