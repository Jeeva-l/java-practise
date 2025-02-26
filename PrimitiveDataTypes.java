public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // Integer types
        byte b = 127;       // 8-bit signed integer
        short s = 32000;    // 16-bit signed integer
        int i = 100000;     // 32-bit signed integer
        long l = 10000000000L; // 64-bit signed integer

        // Floating-point types
        float f = 10.5f;    // 32-bit floating-point
        double d = 20.99;   // 64-bit floating-point

        // Character type
        char c = 'A';       // 16-bit Unicode character

        // Boolean type
        boolean bool = true; // Can be true or false

        // Printing all values
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + bool);
    }
}