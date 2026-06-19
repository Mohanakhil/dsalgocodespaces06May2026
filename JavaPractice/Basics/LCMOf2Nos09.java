import java.util.Scanner;

public class LCMOf2Nos09 {
    public static int getLCM(int a,int b){
        int res=Math.max(a, b);
        while(true){
            if(res%a==0&&res%b==0){
                break;
            }
            else{
                res=res+1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        
        System.out.println("LCM of 2nos is "+getLCM(a,b));
        


        // or we can also do lcm=(a*b)/gcd(a,b)
    }
}
