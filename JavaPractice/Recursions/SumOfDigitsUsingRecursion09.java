package JavaPractice.Recursions;

public class SumOfDigitsUsingRecursion09 {
    public static int calculateSum(int n, int acc) {

        if (n == 0)
            return acc;
        else
            return calculateSum(n / 10, (acc + (n % 10)));
    }

    public static int getSumOfDigits(int n) {
        return calculateSum(n, 0);
    }

    public static void main(String[] args) {
        int n = 9987;
        int sum = getSumOfDigits(n);
        System.out.println("sum of digitis  is "+sum);
    }
}