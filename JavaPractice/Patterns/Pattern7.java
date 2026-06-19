package JavaPractice.Patterns;

public class Pattern7 {
    public static void main(String[] args){
        int counter=1;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(counter+" ");
                counter=counter+2;
            }
            System.out.println();
        }
    }
}
