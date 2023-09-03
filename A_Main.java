import java.util.*;

public class A_Main {

    // public static int countPath(int i, int j, int n, int m) {

    // if (i == n || j == m) {
    // return 0;
    // }
    // if (i == n - 1 && j == m - 1) {
    // return 1;
    // }
    // // move down
    // int downPath = countPath(i + 1, j, n, m);
    // // move right
    // int rightPath = countPath(i, j + 1, n, m);

    // return downPath + rightPath;
    // }

    // public static void main(String[] args) {
    // int n = 3, m = 3;
    // int totalPath = countPath(0, 0, n, m);
    // System.out.println("The total condition paths are available : " + totalPath);
    // }

    // Place Tiles in the FLoor n x m .
    // public static int placeTiles(int n, int m) {
    // if (n == m) {
    // return 2;
    // }
    // if (n < m) {
    // return 1;
    // }

    // // vertically place tiles
    // int vertPlacement = placeTiles(n - m, m);

    // // horizontal place tiles
    // int horiPlacement = placeTiles(n - 1, m);
    // return vertPlacement + horiPlacement;
    // }

    // // n=m --> 2 we can place to tiles horizontally and vertically in this case.
    // // n<m --> 1 only horizontal we can place tiles in this case.
    // public static void main(String[] args) {

    // int n = 4, m = 2;
    // int placeMent = placeTiles(n, m);
    // System.out.println("We have all possible ways , place to tiles : " +
    // placeMent);
    // }

    // All possible ways to invite n Guest.
    // public static int callGuest(int n) {

    // if (n <= 1) {
    // return 1;
    // }
    // // singal
    // int way1 = callGuest(n - 1);
    // // pair
    // int way2 = (n - 1) * callGuest(n - 2);
    // return way1 + way2;
    // }

    // public static void main(String[] args) {

    // int n = 4;
    // int totalWays = callGuest(n);
    // System.out.println("================================================");
    // System.out.println("To invite " + n + " Guest, All possible ways : " +
    // totalWays);
    // System.out.println("================================================");
    // }

    // Find SubSet of Set and Print them.
    public static void printSubSet(ArrayList<Integer> subSet) {

        for (int i = 0; i < subSet.size(); i++) {
            System.out.println(subSet.get(i) + "");
        }
        System.out.println();
    }

    public static void findSubSet(int n, ArrayList<Integer> subSet) {
        if (n == 0) {
            System.out.println(subSet);
            return;
        }
        // add hoga
        subSet.add(n);
        findSubSet(n - 1, subSet);

        // add nahi hoga
        subSet.remove(subSet.size() - 1);
        findSubSet(n - 1, subSet);
    }

    public static void main(String[] args) {

        int n = 3;
        ArrayList<Integer> subSet = new ArrayList<>();
        System.out.println("The SubSet of the Set are : ");
        findSubSet(n, subSet);
    }
}
