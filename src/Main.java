import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getBinDec();
    }

    public static void getBinDec() {
        Scanner scanner = new Scanner(System.in);
        int a = -20;
        int b = 60;
        int c = 0b11101;
        int d = 0b1001;
        boolean isRepeat = true;
        String text = "Enter number system ('BIN' or 'DEC'):";
        while (isRepeat) {
            System.out.println(text);
            String inputText = scanner.nextLine();
            if (inputText.equals("DEC")) {
                decNumberSystem(a, b, c, d);
                isRepeat = false;
            } else if (inputText.equals("BIN")) {
                binNumberSystem(a, b, c, d);
                isRepeat = false;
            } else {
                text = "Enter 'BIN' or 'DEC':";
            }
        }
    }

    public static void decNumberSystem(int a, int b, int c, int d) {
        System.out.println("Bitwise 'Complement': " + ~a);
        System.out.println("Bitwise 'AND': " + (a & b));
        System.out.println("Bitwise 'OR': " + (a | b));
        System.out.println("Bitwise 'XOR': " + (a ^ b));
        System.out.println("Bit 'Signed Left shift': " + (b << 4));
        System.out.println("Bit 'Signed Right shift': " + (a >> 1));
        System.out.println("Bit 'Unsigned Right shift': " + (a >>> 1));
        System.out.println("Sum of two numbers ('c' and 'd') in binary: " + (c + d));
    }

    public static void binNumberSystem(int a, int b, int c, int d) {
        System.out.println("Sum of two numbers ('c' and 'd') in binary: " + Integer.toBinaryString(c + d));
        System.out.println("Bit 'Unsigned Right shift' in binary: " + Integer.toBinaryString(a >>> 1));
        System.out.println("Bitwise 'Complement': " + Integer.toBinaryString(~a));
        System.out.println("Bitwise 'AND': " + Integer.toBinaryString(a & b));
        System.out.println("Bitwise 'OR': " + Integer.toBinaryString(a | b));
        System.out.println("Bitwise 'XOR': " + Integer.toBinaryString(a ^ b));
        System.out.println("Bit 'Signed Left shift': " + Integer.toBinaryString(b << 4));
        System.out.println("Bit 'Signed Right shift': " + Integer.toBinaryString(a >> 1));
    }
}
