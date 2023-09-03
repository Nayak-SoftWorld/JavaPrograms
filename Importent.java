import java.util.HashSet; // import for Unique SUbsequence in java

public class Importent {

    // subSequence
    // public static void subSequence(String str, int idx, String newString) {

    // if (idx == str.length()) {
    // System.out.println(newString);
    // return;

    // }
    // char currChar = str.charAt(idx);
    // // to be
    // subSequence(str, idx + 1, newString + currChar);

    // // or not to be
    // subSequence(str, idx + 1, newString);
    // }

    // public static void main(String[] args) {
    // String str = "abc";
    // subSequence(str, 0, " ");

    // }

    // Unique Subsequence
    public static void uniqueSubSequence(String str, int idx, String newString, HashSet<String> set) {

        if (idx == str.length()) {

            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }

        }
        char currChar = str.charAt(idx);
        // to be
        uniqueSubSequence(str, idx + 1, newString + currChar, set);

        // or not to be
        uniqueSubSequence(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "abc";

        HashSet<String> set = new HashSet<>();

        uniqueSubSequence(str, 0, " ", set);

    }
}
