import java.util.Scanner;

public class PrimeFactorsOfNumber12 {
    public static boolean isPrime(int n){
        if(n==2||n==3) return true;
        else if(n%2==0||n%3==0) return false;
        for(int i=5;i<Math.sqrt(n);i=i+6){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void printPrimeFactors(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                while(n%i==0){
                    System.out.print(i+" ");
                    n=n/i;
                }
            }
        }
        if(n>1) System.out.print(n);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        printPrimeFactors(n);

    }
}
