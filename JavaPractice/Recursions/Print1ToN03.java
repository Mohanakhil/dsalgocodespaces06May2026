package JavaPractice.Recursions;

public class Print1ToN03 {
    public static void print1ToN(int n,int counter){
        if(counter>n){
            return;
        }
        System.out.print(counter+" ");
        print1ToN(n, counter+1);
    }
    public static void main(String[] args){
        int n=16;
        print1ToN(n,1);
        System.out.println(" ");
    }
}
