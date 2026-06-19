package JavaPractice.Patterns;
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int cols=scanner.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
