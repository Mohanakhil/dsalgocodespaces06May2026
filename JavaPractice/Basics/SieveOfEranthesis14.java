import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SieveOfEranthesis14 {

    public static boolean checkPrime(int p){
        for(int i=2;i<=p/2;i++){
            if(p%i==0) return false;
        }
        return true;
    }

    public static void printPrimesBelowN(int n){
        for(int i=2;i<=n;i++){
            if(checkPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static void printPrimesBelowNUsingSievesAlgo(int n){
        boolean[] b=new boolean[n];
        Arrays.fill(b,true);

        for(int i=4;i<=n;i=i+2){
            b[i]=false;
        }
        for(int i=6;i<=n;i=i+3){
            b[i]=false;
        }
        for(int i=10;i<=n;i=i+5){
            b[i]=false;
        }

        IntStream.range(2, b.length)
                .filter(i->(b[i]==true))
                .forEach(i->System.out.println(i));
        
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        printPrimesBelowN(n);

        System.out.println("using sieveoferanthesis method");
        printPrimesBelowNUsingSievesAlgo(n);
    }
}
