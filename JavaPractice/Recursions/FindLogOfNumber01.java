package JavaPractice.Recursions;

public class FindLogOfNumber01 {
    public static int getLog(int n){
        if(n==1){
            return 0;
        }
        else return 1+getLog(n/2); 
    }
    public static void main(String[] args){
        int n=8; //which is 2^3
        int logn=getLog(n);
        System.out.println("log base 2 of given no is "+logn);

        //for base 3 or base 4 of log we need to use 1+fun(n/3) and 1+func(n/4)
    }
}
