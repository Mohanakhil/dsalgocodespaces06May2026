import java.util.Scanner;

public class CheckPalindrome07 {

    public static String getReverse(String s){
        String rev="";
        for(int i=0;i<s.length();i++){
            rev=rev+s.charAt(i);
        }
        return rev;
    }
    public static boolean checkPalindromeUsingReversal(String s){
        String rev= getReverse(s);
        System.out.println("obtained reverse from 1st method is "+rev);
        if(rev.equals(s)) return true;
        else return false;
    }

    public static boolean checkPalindromeUsingRec(String s,int index){
        if(index>s.length()/2) return true;
        else if(s.charAt(index)!=s.charAt(s.length()-1-index)){
            return false;
        }
        else return checkPalindromeUsingRec(s,index+1); 
    }

    public static boolean checkPalindromeUsingRev2(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();

        System.out.println("palindrome checking using reversal "+checkPalindromeUsingReversal(s));

        System.out.println("palindrome checking using reverse 2nd way "+checkPalindromeUsingRev2(s));


        System.out.println("palindrome checking using recursion "+checkPalindromeUsingRec(s,0));

    }
}
