import java.util.*;

public class Manish {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int num[] = new int[size];

        // // input
        // for (int i = 0; i < num.length; i++) {
        // num[i] = sc.nextInt();
        // }

        // int max = num[0];

        // // output
        // for (int i = 0; i < num.length; i++) {
        // if (num[i] > max) {
        // max = num[i];
        // }
        // }
        // System.out.println(max);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] num = new int[row][col];

        // input

        // row index
        for (int i = 0; i < row; i++) {
            // column index
            for (int j = 0; j < col; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        // output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (num[i][j] == x) {
                    System.out.print("(" + i + "," + j + ")");

                }
            }
            System.out.println();
        }

        sc.close();

    }
}
