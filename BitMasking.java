import java.util.*;

public class BitMasking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num - > 0 or 1 : ");
        int oper = sc.nextInt();

        int n = 5; // 0101
        int pos = 1;
        int bitmask = 1 << pos;

        // Update Bit Operation
        if (oper == 1) {
            // set bit
            int newNumber = bitmask | n;
            System.out.println(newNumber);
        } else {
            // clear bit
            int newBitMask = ~(bitmask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

        // Clear Bit Operation
        // int notBitMask = ~(bitmask);
        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);

        // Set Bit Opperation
        // int newNumber = bitmask | n;
        // System.out.println(newNumber);

        // Get Bit Opperation
        // if ((bitmask & n) == 0) {
        // System.out.println("Bit is Zero. ");
        // } else {
        // System.out.println("Bit is one.");
        // }
        sc.close();
    }
}
