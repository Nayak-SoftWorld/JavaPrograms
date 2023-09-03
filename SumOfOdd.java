import java.util.*;

public class SumOfOdd {
    public static void sumOfOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) { // i+=2 or i=i+2
            sum += i;
        }
        System.out.println(sum);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sumOfOdd(a);
        sc.close();

    }
}
