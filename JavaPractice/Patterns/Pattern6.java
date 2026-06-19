package JavaPractice.Patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int counter=1;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i<2){
                    System.out.print(" ");
                }
                System.out.print((counter)+" ");
                counter++;
            }
            System.out.println();
        }
    }
}
