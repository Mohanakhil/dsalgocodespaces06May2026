import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class DivisorsOfNumber13{

    public static void printDivisors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i+" ");
            }
        }
    }

    public static void getDivisors(int n){
        int i=1;
            for(i=1;i<Math.sqrt(n);i++){
                if(n%i==0){
                    System.out.print(i+" ");
                }
            }
            for(;i>=1;i--){
                if(n%i==0){
                    System.out.print(n/i+" ");
                }
            }
    }


    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        printDivisors(n);
        System.out.println("second way");
        getDivisors(n);
        
    }
}