public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello world");

        System.out.println(sb);
        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'L');
        System.out.println(sb);

        sb.insert(5, 'B');
        System.out.println(sb);

        sb.delete(5, 6);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
        
    }
}
