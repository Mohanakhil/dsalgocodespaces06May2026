package JavaPractice.Recursions;

public class PrintNToOne04 {
    public static void printNTo1(int n){
        if(n<=0) return;
        else {
            System.out.print(n+" ");
            printNTo1(n - 1);
        }
    }
    public static void main(String[] args){
        int n=12;
        printNTo1(n);
    }
}
