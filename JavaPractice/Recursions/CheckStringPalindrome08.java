package JavaPractice.Recursions;

public class CheckStringPalindrome08 {
    public static boolean checkPalindrome(String s,int left,int right){
        if (left >= right) return true;
        else if(right<=0) return false;
        else if(s.charAt(left)!=s.charAt(right)) return false;
        else return checkPalindrome(s, left+1, right-1);
    }
    public static boolean isPalindrome(String s){
        return checkPalindrome(s,0,s.length()-1);
    }
    public static void main(String[] args){
        String s="madam";
        boolean flag=isPalindrome(s);
        System.out.println("flag is "+flag);
    }
}
