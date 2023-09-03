import java.util.*;

public class circumference {

    public static void circumferenceOfCircle(int r) {
        double pi = 3.145;
        double circumference = 2 * pi * r;
        System.out.println(circumference);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        circumferenceOfCircle(num);
        sc.close();
    }

}
