import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class CountDistinctElements01 {
    public static int getDistinctCount1(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == a[i]) {
                    flag = false;
                }
            }
            if (flag == true) {
                count++;
            }
        }
        return count;
    }

    public static int getDistinctCount2(int[] a) {
        HashSet<Integer> h1 = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            h1.add(a[i]);
        }
        return h1.size();
    }

    public static void main(String[] args) {
        int[] a = new int[] { 15, 12, 13, 12, 13, 18 };

        int count = getDistinctCount1(a);
        System.out.println("count of distinct eles is " + count);

        // using Set add all elements to Set and get back the size
        count = getDistinctCount2(a);
        System.out.println("Size of hashset gives distinct elements " + count);

        HashSet<Integer> s1 = Arrays.stream(a)
                .boxed()
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(s1);
    }
}
