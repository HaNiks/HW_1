
public class Main {
    public static void main(String[] args) {
        int a = -20;
        int b = 60;
        int c = 0b11101;
        int d = 0b1001;
        System.out.println("Bitwise 'Complement (DEC)': " + ~a);
        System.out.println("Bitwise 'AND'(DEC): " + (a & b));
        System.out.println("Bitwise 'OR' (DEC): " + (a | b));
        System.out.println("Bitwise 'XOR' (DEC): " + (a ^ b));
        System.out.println("Bit 'Signed Left shift' (DEC): " + (b << 4));
        System.out.println("Bit 'Signed Right shift' (DEC): " + (a >> 1));
        System.out.println("Bit 'Unsigned Right shift' (DEC): " + (a >>> 1));
        System.out.println("Sum of two numbers in binary (DEC): " + (c + d));
        System.out.println("Sum of two numbers in binary (BIN): " + Integer.toBinaryString(c + d));
        System.out.println("Sum of two numbers in binary (BIN): " + Integer.toBinaryString(a >>> 1));
    }
}
