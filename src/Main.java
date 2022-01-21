import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = -20;
        int b = 60;
        int c = 0b11101;
        int d = 0b1001;
        String text = "Enter number system ('BIN' or 'DEC'):";
        boolean isRepeat = true;
        Scanner scanner = new Scanner(System.in);
        while (isRepeat) {
            System.out.println(text);
            String inputText = scanner.nextLine();
            if (inputText.equals("DEC")) {
                System.out.println("Bitwise 'Complement': " + ~a);
                System.out.println("Bitwise 'AND': " + (a & b));
                System.out.println("Bitwise 'OR': " + (a | b));
                System.out.println("Bitwise 'XOR': " + (a ^ b));
                System.out.println("Bit 'Signed Left shift': " + (b << 4));
                System.out.println("Bit 'Signed Right shift': " + (a >> 1));
                System.out.println("Bit 'Unsigned Right shift': " + (a >>> 1));
                System.out.println("Sum of two numbers in binary: " + (c + d));
                isRepeat = false;
            }
            else if (inputText.equals("BIN")) {
                System.out.println("Sum of two numbers in binary: " + Integer.toBinaryString(c + d));
                System.out.println("Sum of two numbers in binary: " + Integer.toBinaryString(a >>> 1));
                isRepeat = false;
            }
            else {
                text = "Enter 'BIN' or 'DEC':";
            }
        }
    }
}
