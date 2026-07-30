package JavaPractice.Recursions;

public class NthFibonacci06 {
    public static int calculateNthFib(int n,int first,int second){
        if(n==0) return first;
        else if(n==1) return second;
        else return calculateNthFib(n-1,second,first+second); 
    }

public static int getNthFibNumber(int n){
    int first=0;
    int second=1;
    return calculateNthFib(n,first,second);
}
    public static void main(String[] args){
        int n=3;
        int f=getNthFibNumber(n);
        System.out.println("nth fib no is "+f);
    }
}
