import java.util.Scanner;
public class PalindromeNumber04 {
    public static int reverse(int n,int rev){
        if(n<=0) return rev;
        return reverse(n/10,((rev*10)+n%10));
    }
    public static int reverseNumber(int n){
        return reverse(n,0);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int rev=reverseNumber(n);
        System.out.println("obtained reverse is "+rev);
        if(rev==n) System.out.println("true");
        else System.out.println("false");
    }
}
