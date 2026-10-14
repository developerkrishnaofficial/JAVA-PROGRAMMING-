
import java.util.Scanner;

public class day2 {

    public static void main(String[] args) {

        // 13-1 Type Conversion
        int a = 35;
        long b = a;
        System.out.println("Type Conversion: " + b);

        // 13-2 Taking Integer Input and Converting to Float
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        float no = sc.nextInt();
        System.out.println("Float value: " + no);

        // 14 Type Casting
        long longValue = 35;
        int intValue = (int) longValue;
        System.out.println("Long to Int: " + intValue);

        float decimal = 23.45f;
        int castedValue = (int) decimal;
        System.out.println("Float to Int: " + castedValue);

        float marks = 99.99f;
        int marks2 = (int) marks;
        System.out.println("Casted Marks: " + marks2);

        char ch1 = 'a';
        int charValue1 = (int) ch1;
        System.out.println("ASCII of a: " + charValue1);

        char ch2 = 'b';
        int charValue2 = (int) ch2;
        System.out.println("ASCII of b: " + charValue2);

        // 15-1 Type Promotion in Expressions
        char x = 'a';
        char y = 'b';

        System.out.println("ASCII of x: " + (int) x);
        System.out.println("ASCII of y: " + (int) y);
        System.out.println("Difference: " + (y - x));
        System.out.println("Character x: " + x);

        byte byteNumber = 5;
        byteNumber = (byte) (byteNumber * 2);
        System.out.println("Byte result: " + byteNumber);

        short shortNumber = 5;
        byte anotherByte = 26;
        char character = 'c';

        // Arithmetic promotes byte, short, and char to int.
        int result = shortNumber + anotherByte + character;
        System.out.println("Promoted result: " + result);

        // 15-2 Type Promotion with Different Data Types
        int num1 = 10;
        float num2 = 20.45f;
        long num3 = 25;
        double num4 = 29;

        double answer = num1 + num2 + num3 + num4;
        System.out.println("Final answer: " + answer);

    }
}
