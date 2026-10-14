
import java.util.*;

public class DAY4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Question 1: Data Types in Java
        // Write a Java program to declare variables of different
        // data types and display their values.

        byte a = 1; // 1 byte
        System.out.println(a);

        char b = 's'; // 2 bytes
        System.out.println(b);

        boolean k = true;
        System.out.println(k);

        float price = 1.4f; // 4 bytes
        System.out.println(price);

        int no = 4754; // 4 bytes
        System.out.println(no);

        long num = 563456475L; // 8 bytes
        System.out.println(num);

        double p = 46534.345; // 8 bytes
        System.out.println(p);

        short s = 857; // 2 bytes
        System.out.println(s);


        // Question 2: Sum of num1 and num2
        // Write a Java program to calculate and display the sum,
        // multiplication, division, remainder, and difference
        // of two numbers.

        int num1 = 50;
        int num2 = 50;

        int add = num1 + num2;

        System.out.println("Addition = " + add);
        System.out.println("Multiplication = " + (num1 * num2));
        System.out.println("Division = " + (num1 / num2));
        System.out.println("Remainder = " + (num1 % num2));
        System.out.println("Subtraction = " + (num1 - num2));


        // Question 3: Bank Balance Transactions
        // Ganesh has a bank balance of ₹5,200.00.
        // He spends ₹500.00 on a T-shirt.
        // Later, he receives a cashback of ₹200.00.
        // Display the bank balance after each transaction.
        //
        // Expected Output:
        // Initial Balance: ₹5200.00
        // After T-shirt Purchase: ₹4700.00
        // After Cashback: ₹4900.00

        double balance = 5200.00;

        System.out.printf("Initial Balance: ₹%.2f%n", balance);

        balance = balance - 500.00;
        System.out.printf("After T-shirt Purchase: ₹%.2f%n", balance);

        balance = balance + 200.00;
        System.out.printf("After Cashback: ₹%.2f%n", balance);


        // Question 4: Salary Hike Calculation
        // Rahul has a monthly salary of ₹80,000.
        // His company gives him a 40% salary hike.
        // Write a Java program to calculate and display
        // his salary after the 40% hike.

        double salary = 80000.00;

        System.out.println("Initial Salary: " + salary);

        salary = salary + (salary * 40 / 100);

        System.out.println("Salary after 40% hike: " + salary);


        // Question 5: ATM Note Calculation
        // An ATM has a total balance of ₹6,400.
        // If the ATM dispenses only ₹500 notes, write a Java
        // program to calculate and display the total number
        // of ₹500 notes available in the balance.

        int balance1 = 6400;
        int note = 500;

        System.out.println(
            "Total number of ₹500 notes = " + (balance1 / note)
        );

        System.out.println(
            "Remaining balance = " + (balance1 % note)
        );


        // Question 6: Total Marks Calculation
        // A student has scored the following marks in five subjects:
        // Mathematics = 90
        // Science = 45
        // History = 90
        // English = 46
        // Geography = 98
        //
        // Write a Java program to calculate and display
        // the total marks obtained by the student.

        int math = 90;
        int sci = 45;
        int history = 90;
        int english = 46;
        int geo = 98;

        int total = math + sci + history + english + geo;

        System.out.println("Total Marks = " + total);


        // Question 7: BMI Calculation
        // A person has a height of 1.77 meters and a weight
        // of 87.3 kg. Write a Java program to calculate and
        // display the person's BMI using the formula:
        //
        // BMI = Weight / (Height * Height)

        float height = 1.77f;
        float weight = 87.3f;

        float bmi = weight / (height * height);

        System.out.printf("BMI = %.2f%n", bmi);


        // Question 8: Area of Circle
        // Write a Java program to take the radius of a circle
        // as input from the user and calculate and display
        // its area using the formula:
        //
        // Area = π × radius × radius

        System.out.print("Enter the radius of the circle: ");

        float rad = sc.nextFloat();

        float area = 3.14f * rad * rad;

        System.out.printf("Area of Circle = %.2f%n", area);


    }
}
