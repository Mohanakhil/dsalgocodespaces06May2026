package JavaPractice.Patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        for(int i=5;i>0;i--){
            for(int j=0;j<5;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
