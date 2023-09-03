import java.util.Scanner;

public class SumOfEven {
    public static int sumAllEvenNum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i; // sum = sum + i;
            }
        }
        System.out.println("sum of 1 to " + n + " even numbers : " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sumAllEvenNum(a);
        sc.close();

    }
}
