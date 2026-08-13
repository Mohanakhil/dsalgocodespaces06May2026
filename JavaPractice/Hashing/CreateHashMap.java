import java.util.HashMap;
import java.util.Map;

public class CreateHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> h1 = new HashMap<String, Integer>();
        h1.put("gfg", 10);
        h1.put("ide", 15);
        h1.put("courses", 20);
        System.out.println(h1);
        System.out.println(h1.size());

        for (Map.Entry<String, Integer> e : h1.entrySet()) {
            System.out.print(e.getKey() + " " + e.getValue() + " , ");
        }

        System.out.println(h1.containsKey("ide"));
    }
}
