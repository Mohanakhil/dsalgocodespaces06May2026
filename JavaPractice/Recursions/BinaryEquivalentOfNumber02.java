package JavaPractice.Recursions;

public class BinaryEquivalentOfNumber02 {
    public static void printBinaryEq(int n) {
        if (n == 0) {
            return;
        }
        printBinaryEq(n / 2);
        System.out.print(n%2);
    }

    public static void main(String[] args) {
        int n = 13;
        System.out.println("binary eq of n is ");
        printBinaryEq(n);
        System.out.println(" ");
    }
}
