
// 17. OPERATORS IN JAVA

public class day3 {

    public static void main(String[] args) {

        // 17.1 Arithmetic Operators
        int a = 2;
        int b = 10;

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulo = " + (a % b));

        // 17.2 Unary Operators
        int num = 10;

        int preIncrement = ++num;
        System.out.println("Pre-increment: num = " + num);
        System.out.println("Pre-increment result = " + preIncrement);

        num = 10;
        int postIncrement = num++;
        System.out.println("Post-increment result = " + postIncrement);
        System.out.println("Value after post-increment = " + num);

        num = 10;
        int preDecrement = --num;
        System.out.println("Pre-decrement result = " + preDecrement);

        num = 10;
        int postDecrement = num--;
        System.out.println("Post-decrement result = " + postDecrement);
        System.out.println("Value after post-decrement = " + num);

        // 18. Relational Operators
        int x = 10;
        int y = 10;
        int z = 5;

        System.out.println("x == y: " + (x == y));
        System.out.println("x == z: " + (x == z));
        System.out.println("x != y: " + (x != y));
        System.out.println("x != z: " + (x != z));
        System.out.println("x > z: " + (x > z));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < z: " + (x < z));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= z: " + (x >= z));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= z: " + (x <= z));
        System.out.println("x <= y: " + (x <= y));

        // 19. Logical Operators
        System.out.println((3 > 4) && (10 < 20)); // AND
        System.out.println((5 > 4) && (10 > 2));

        System.out.println((3 > 4) || (10 < 20)); // OR
        System.out.println((5 > 4) || (10 > 2));

        System.out.println(!(5 > 4)); // NOT

        // 20. Assignment Operators
        int value = 10;

        value += 10;
        System.out.println("After += : " + value);

        value -= 10;
        System.out.println("After -= : " + value);

        value *= 10;
        System.out.println("After *= : " + value);

        value /= 10;
        System.out.println("After /= : " + value);

        value %= 10;
        System.out.println("After %= : " + value);
    }
}
