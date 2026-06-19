import java.util.Scanner;

public class FibonacciSeries05 {
    public static int fibonacci(int n){
        if(n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void printFib(int n,int prev,int current){
        if(n<2) return;
        else {
            System.out.print(current+" ");
            printFib(n-1, current, prev+current);
        } 
    }
    public static void printFibUsingTailRec(int n){
        int prev=0;
        int current=1;
        System.out.print(prev+" ");
        printFib(n,prev,current);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i)+" ");
        }
        System.out.println("\nusing for loop ");
        int n1=0;
        int n2=1;
        for(int i=0;i<n;i++){
            System.out.print(n1+" ");
            int n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        System.out.println("\nusing recursion below");
        printFibUsingTailRec(n);

    }
}
