import java.util.List;
import java.util.stream.IntStream;

public class PerfectNumber11{
    public static boolean checkPerfectNumber(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                    sum+=i;
            }
        }
        return sum==n;
    }
    public static boolean checkPerfectUsingRec(int n,int acc,int i){
        if(acc==n) return true;
        else if(i>n/2) return false; 
        else if(n%i==0) return checkPerfectUsingRec(n, acc+i, i+1);
        else return checkPerfectUsingRec(n, acc, i+1);
    }
    public static void main(String[] args){
        int n=28;
        boolean flag=checkPerfectNumber(n);
        System.out.println("using loops "+flag);
        System.out.println("using recursion "+checkPerfectUsingRec(n,0,1));
        List<Integer> list_of_perfect = IntStream.rangeClosed(1, 1000)
                  .boxed().filter(ele->checkPerfectUsingRec(ele, 0, 1))
                  .toList();
        System.out.println(list_of_perfect);
    }
}