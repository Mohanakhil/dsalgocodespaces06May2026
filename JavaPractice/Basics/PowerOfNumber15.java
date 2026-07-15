import java.util.Scanner;

public class PowerOfNumber15{
    public static long getPower(int n,int x){
        long result=1;
        for(int i=0;i<x;i++){
            result=result*n;
        }
        return result;
    }
    public static long getPower2(int n,int x){
        long result=1;
        if(x%2==0){
            result=getPower(n, x/2)*getPower(n, x/2);
        }
        else{
            result=getPower(n, x-1)*n;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int x=scanner.nextInt();
        System.out.println("power of n raised to x is "+getPower(n,x));

        System.out.println("power in optimum way "+getPower2(n,x));
    }
}