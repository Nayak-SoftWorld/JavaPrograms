public class Recursion2 {

    // public static void moveAllx(String str, int idx, int count, String newString)
    // {

    // if (idx == str.length()) {
    // for (int i = 0; i < count; i++) {
    // newString += 'x';
    // }

    // System.out.println(newString);
    // return;

    // }

    // char currChar = str.charAt(idx);
    // if (currChar == 'x') {
    // count++;
    // moveAllx(str, idx + 1, count, newString);
    // } else {
    // newString += currChar;
    // moveAllx(str, idx + 1, count, newString);
    // }

    // }

    // public static void main(String[] args) {
    // String str = "axbcxxd";
    // moveAllx(str, 0, 0, "");

    // }

    // Remove Duplicates from the string
    public static boolean[] map = new boolean[26];

    public static void removeDuplicate(String str, int idx, String newString) {

        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicate(str, idx + 1, newString);
        } else {
            newString = newString + currChar;
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "aabccdaccd";
        removeDuplicate(str, 0, "");

    }

}
