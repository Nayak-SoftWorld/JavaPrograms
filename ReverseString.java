public class ReverseString {
    public static void prinReverStr(String str, int idx) {

        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx) + " ");
        prinReverStr(str, idx - 1);

    }

    public static void main(String[] args) {
        String str = "aldab";
        prinReverStr(str, str.length() - 1);
    }

}