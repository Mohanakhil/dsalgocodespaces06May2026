import java.util.Scanner;
public class FactorialOfNumber06 {
    public static int getFactorialUsingLoop(int n){
        int fact=1;
        while(n>0){
            fact=fact*(n);
            n=n-1;
        }
        return fact;
    }
    public static int calculateFactUsingRec(int n,int fact){
        if(n<=0) return fact;
        else return calculateFactUsingRec(n-1, fact*n);
    }
    public static int getFactorialUsingRecursion(int n){
        return calculateFactUsingRec(n,1);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println("factorial of given no is "+getFactorialUsingLoop(n));

        System.out.println("using recurs factorial is "+getFactorialUsingRecursion(n));
    }
}
