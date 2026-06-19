import java.util.Scanner;
class EvenOdd01{
    public static boolean checkIfEven(int n){
        if(n%2==0) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        boolean flag=checkIfEven(n);
        if(flag)System.out.println("its even no");
        else System.out.println("its an odd no");
    }
}