import java.util.HashSet;
import java.util.Iterator;

public class CreateHashSet {
public static void printSet(HashSet<String> s1){
    Iterator<String> h=s1.iterator();
    while(h.hasNext()){
        System.out.println(h.next());
    }
}
    public static void main(String[] args) {
        HashSet<String> s1 = new HashSet<String>();
        s1.add("abc");
        s1.add("efg");
        s1.add("gfg");

        System.out.println(s1);

        System.out.println(s1.contains("gfg"));
        
        printSet(s1);


    }
}