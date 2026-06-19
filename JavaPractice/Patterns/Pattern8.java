package JavaPractice.Patterns;

public class Pattern8{
    public static void main(String[] args){
        int counter=2;
        int c=4;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
            if(c>0){
                System.out.print(" ");
                c--;
            }    
            System.out.print(counter);
            counter=counter+2;
            System.out.print(" ");
            }
            System.out.println();
        }
    }
}