import java.util.Scanner;

public class CheckPrime10 {
    public static  boolean checkPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        System.out.println(checkPrime(n));
    }
}
