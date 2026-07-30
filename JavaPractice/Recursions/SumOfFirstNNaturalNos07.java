package JavaPractice.Recursions;

public class SumOfFirstNNaturalNos07 {
    public static int calculateSumOfN(int n,int acc){
        if(n<=0) return acc;
        else return calculateSumOfN(n-1, acc+n);
    }
    public static int getSumOfN(int n){
        return calculateSumOfN(n,0);
    }
    public static void main(String[] args){
        int n=5;
        int sum=getSumOfN(n);
        System.out.println("sum of n Natural nos is "+sum);
    }
}
