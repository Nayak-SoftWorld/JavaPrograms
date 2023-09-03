public class Recursion {
    // public static void prinRecNum(int n) {
    // if (n == 6) { // Base case
    // return;
    // }
    // System.out.println(n); // Print
    // prinRecNum(n + 1); // Recursion

    // }
    // public static void main(String[] args) {
    // int n = 1;
    // prinRecNum(n); // call

    // n natural numbers sum
    // public static void printSum(int i, int n, int sum) {
    // if (i == n) {
    // sum += i;
    // System.out.print(sum);
    // return;
    // }

    // sum += i;
    // printSum(i + 1, n, sum);

    // }

    // public static void main(String[] args) {
    // printSum(1, 5, 0);
    // }

    // Calculate Factorial
    // public static int calcFactorial(int n) {
    // if (n == 1 || n == 0) {
    // return 1;
    // }

    // int factNum = n * calcFactorial(n - 1);
    // return factNum;
    // }

    // public static void main(String[] args) {
    // int n = 5;
    // int factAns = calcFactorial(n);
    // System.out.println(factAns);
    // }

    // Calc Fibbonacci
    // public static void printFibo(int a, int b, int n) {
    // if (n == 0) {
    // return;
    // }
    // int c = a + b;
    // System.out.print(c + " ");
    // printFibo(b, c, n - 1);
    // }

    // public static void main(String[] args) {
    // int a = 0, b = 1;
    // System.out.print(a + " ");
    // System.out.print(b + " ");
    // int n = 7;
    // printFibo(a, b, n - 2);
    // }

    // Calc Power x^n (with stack height = n)
    // public static int calcPower(int x, int n) {
    // if (n == 0) {
    // return 1;
    // }
    // if (x == 0) {
    // return 0;
    // }
    // int xPowM = calcPower(x, n - 1);
    // int xPown = x * xPowM;
    // return xPown;
    // }

    // public static void main(String[] args) {
    // int x = 2, n = 5;
    // int ans = calcPower(x, n);
    // System.out.println("The " + x + "^" + n + " is : " + ans);
    // }

    // clac Power x^n (with stack height = log n)
    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) { // n is even
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        } else { // n is odd
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }

    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calcPower(x, n);
        System.out.println("The " + x + "^" + n + " is : " + ans);
    }
}
