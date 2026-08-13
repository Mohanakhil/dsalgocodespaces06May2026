import java.util.HashMap;

public class FrequencyOfArrayElements02 {
    public static void printFrequencyOfEach(int[] a) {
        HashMap<Integer, Integer> h1 = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            h1.put(a[i], h1.getOrDefault(a[i], 0) + 1);
        }
        System.out.println("frequencies of eles are ");
        System.out.println(h1);
    }

    public static void main(String[] args) {
        int[] a = new int[] { 10, 12, 15, 10, 20, 12, 12 };

        printFrequencyOfEach(a);

    }
}
