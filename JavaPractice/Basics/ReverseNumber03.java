import java.util.Scanner;
import java.util.Collections;
import java.util.List;

public class ReverseNumber03 {
    private static List<Integer> reversed;
    public static int getReverse(int n){
        int reverse=0;
        while(n>0){
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        return reverse;
    }
    public static int getReverseUsingRecursion(int n,int rev){
        if(n<=0) return rev;
        else return getReverseUsingRecursion(n/10, (rev*10+n%10));
    }
    // public static int getReverseUsingDirectRev(int n){
    //     if(n<10) {
    //         return n;
    //     }
    //     int countOfDigitsMinus1=(int)(Math.log10(n));
    //     return ((n%10)*(int)Math.pow(10,countOfDigitsMinus1))+(getReverseUsingDirectRev(n/10));
    // }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int reverse=getReverse(n);
        System.out.println("reverse of a no is "+reverse);
        reverse=getReverseUsingRecursion(n,0);
        System.out.println("reverse of a no using recursion is "+reverse);

        // reverse=getReverseUsingDirectRev(n);
        // System.out.println("reverse  using direct reverse of no is but not optimum "+reverse);

        List<Integer> list1=String.valueOf(n)
                                .chars()
                                .map(c->c-'0')
                                .boxed()
                                .collect(java.util.stream.Collectors.toList());
        Collections.reverse(list1);
        int num=0;
        for (int digit : list1)
        {
            num=num*10+digit;
        }
        System.out.println("reversed num is "+num);
        int result= list1.stream().reduce(0,(a,b)->a*10+b);
        System.out.println("reversed result using func progra is "+result);
    }
}