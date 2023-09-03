public class BackTracking {
    // Backtracking ==> Find all possible solutions and use one what you wnat.
    public static void printPremutation(String str, String permu, int idx) {
        if (str.length() == 0) {
            System.out.println(permu);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // permu = permu + curChar;
            printPremutation(newStr, permu + curChar, idx + 1);

        }
    }
    // time complexity = O(n*n!)
    // n! = total ans , n = total steps

    public static void main(String[] args) {
        String str = "ABC";
        printPremutation(str, "", 0);
    }

}
