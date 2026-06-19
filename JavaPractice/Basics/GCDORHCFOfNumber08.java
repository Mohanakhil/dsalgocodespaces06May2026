import java.util.Scanner;

public class GCDORHCFOfNumber08 {
    public static int getGCD(int a,int b){
        int res=Math.min(a, b);
        while(res>0){
            if(a%res==0&&b%res==0){
                break;
            }
            res=res-1;
        }
        return res;
    }
    public static int getGCDEcludiean1(int a,int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }

    public static int getGCDEcludiean2(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return getGCDEcludiean2(b, a%b);
        }
    }
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("GCD/HCF of 2 nos is "+getGCD(a,b));

        System.out.println("gcd using ecludiean v1 "+getGCDEcludiean1(a,b));

        System.out.println("gcd using ecludiean v1 "+getGCDEcludiean2(a,b));

    }
}
