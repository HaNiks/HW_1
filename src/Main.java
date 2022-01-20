
public class Main {
    public static void main(String[] args) {
        int a = -20;
        int b = 60;
        int c = 0b11101;
        int d = 0b1001;
        System.out.println(~a);
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(b << 4);
        System.out.println(a >> 1);
        System.out.println(a >>> 1);
        System.out.println(c + d);
        System.out.println(Integer.toBinaryString(c + d));
        System.out.println(Integer.toBinaryString(a >>> 1));
    }
}
