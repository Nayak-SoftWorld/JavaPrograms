public class Permitation {

    public static void printPermu(String str, String permutaion) {

        if (str.length() == 0) {
            System.out.println(permutaion);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermu(newStr, permutaion + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPermu(str, " ");

    }
}
