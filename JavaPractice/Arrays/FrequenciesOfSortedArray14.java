import java.util.HashMap;
import java.util.Map;
public class FrequenciesOfSortedArray14 {

    public static Map<Integer,Integer> getFrequenciesOfArray2(int[] a){
        Map<Integer,Integer> m1=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(!m1.containsKey(a[i])){
                m1.put(a[i],1);
            }
            else{
                m1.put(a[i],(m1.get(a[i])+1));
            }
        }
        return m1;
    }

    public static void getFrequenciesOfArray1(int[] a){
        int count=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                count++;
            }
            else{
                System.out.print(a[i]+" "+(count+1)+" ");
                System.out.println();
                count=0;
            }
        }
        System.out.print(a[a.length-1]+" "+(count+1));
        System.out.println();
    }
    public static void main(String[] args){
        int[] a=new int[]{10,10,10,25,30,30};

        getFrequenciesOfArray1(a);

        //using efficient solution
        System.out.println("using map solution");
        Map<Integer,Integer> m = getFrequenciesOfArray2(a);
        for(Map.Entry<Integer,Integer> entry:m.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
