package JavaPractice.Recursions;

public class Factorial05 {
public static int calculateFactorial(int n,int acc){
    if(n==1) return acc;
    else return calculateFactorial(n-1,acc*n);
}

public static int getFactorial(int n){
    return calculateFactorial(n,1);
}
    public static void main(String[] args){
        int n=9;
        int fact=getFactorial(n);
        System.out.println("factorial of given no is "+fact);
    }
}
