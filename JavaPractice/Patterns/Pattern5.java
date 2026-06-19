package JavaPractice.Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        for(int i=5;i>0;i--){
            for(int j=5;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
