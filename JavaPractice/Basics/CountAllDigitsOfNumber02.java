import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CountAllDigitsOfNumber02 {
    public static int getCountOfDigits(int n){
        int count=0;
        while(n>0){
            count=count+1;
            n=n/10;
        }
        return count;
    }
    public static int getCountUsingRecursion(int n,int count){
        if(n<=0) return count;
        else return getCountUsingRecursion(n/10, count+1);
    }
    public static int getCountUsingLog(int n){
        return (int)(Math.log10(n)+1);
    }
    public static int getCountUsingList(int n){
        char[] c1=String.valueOf(n).toCharArray();
        return c1.length;
    }
    public static void main(String[] args){
     Scanner scanner=new Scanner(System.in);
     int number=scanner.nextInt();
     int count=getCountOfDigits(number);
     System.out.println("count of digits is "+count);
     count=getCountUsingRecursion(number,0);
     System.out.println("count of digits using rec is "+count);
     
     count=getCountUsingLog(number);
     System.out.println("count of digits using log is "+count);

     System.out.println("count using Array "+getCountUsingList(number));

    }
}
