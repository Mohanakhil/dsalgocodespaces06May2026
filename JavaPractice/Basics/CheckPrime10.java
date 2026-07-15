import java.util.Scanner;

public class CheckPrime10 {
    public static  boolean checkPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static boolean checkUsing2And3(int n){
        if(n==1) return false;
        else if(n==2 || n==3) return true;
        else if(n%2==0 || n%3==0){
            return false;
        }
        for(int i=5;i<=Math.sqrt(n);i=i+6){
            if(n%i==0||n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        System.out.println(checkPrime(n));

        System.out.println(checkUsing2And3(n));
    }
}
