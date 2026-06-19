package JavaPractice.Patterns;

public class Pattern9 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
           int c=i;
            for(int j=1;j<=5;j++){
                System.out.print(c+" ");
                c=c+i;
            }
            System.out.println();
        }
    }
}
