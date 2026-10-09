import java.util.Scanner;

public class day1 {
public static void main(String[] args) {

    // 1. Printing output using print()
    System.out.print("Hello Bappa");
    System.out.print("1 2 3 4 5 6 7");

    // 2. Printing output using println()
    // println() prints the output and moves to the next line.
    System.out.println("Ganpati");
    System.out.println("Bappa");
    System.out.println("Morya");

    // 3. Using \n to move to the next line
    System.out.print("Ganpati\n");
    System.out.print("Bappa\nMorya");
    System.out.println();

    // 4. Printing a pattern
    System.out.println("****");
    System.out.println("***");
    System.out.println("**");
    System.out.println("*");

    // 5. Variables in Java
    int a = 5;
    int b = 10;

    System.out.println(a);
    System.out.println(b);

    String name = "Bappa";
    System.out.println(name);

    a = 50;
    System.out.println(a);

    a = b;
    System.out.println(a);

    // 6. Data types in Java
    byte byteValue = 1;
    System.out.println(byteValue);

    char character = 's';
    System.out.println(character);

    boolean isFalse = false;
    boolean isTrue = true;
    System.out.println(isFalse);
    System.out.println(isTrue);

    float price = 1.5f; // Use 'f' to declare a float value.
    System.out.println(price);

    int number = 32;
    System.out.println(number);

    long longNumber = 265616456L; // Use 'L' for a long value.
    System.out.println(longNumber);

    double decimalValue = 556.5656;
    System.out.println(decimalValue);

    short shortValue = 2424;
    System.out.println(shortValue);

    // 7. Sum of two numbers
    int firstNumber = 10;
    int secondNumber = 29;
    int sum = firstNumber + secondNumber;

    System.out.println(sum);

    // 8. Taking input in Java
    Scanner sc = new Scanner(System.in);

    // Read a single word
    String input = sc.next();
    System.out.println(input);

    // Read a complete line
    String fullName = sc.nextLine();
    System.out.println(fullName);

    // Read a float value
    float inputPrice = sc.nextFloat();
    System.out.println(inputPrice);

    // Read an integer
    int inputNumber = sc.nextInt();
    System.out.println(inputNumber);

    // Read a boolean value
    boolean inputBoolean = sc.nextBoolean();
    System.out.println(inputBoolean);

    // 9. Sum and difference of two numbers
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int resultSum = num1 + num2;
    int difference = num1 - num2;
    System.out.println(resultSum);
    System.out.println(difference);

    // 10. Product of two numbers
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int product = num1 * num2;
    System.out.println(product);

    // 11. Area of a circle
    System.out.print("Enter the radius of the circle: ");

    float radius = sc.nextFloat();
    float area = 3.14f * radius * radius;

    System.out.println("Area of the circle: " + area);

    // Close the Scanner after completing all input operations.
    sc.close();
}

}
