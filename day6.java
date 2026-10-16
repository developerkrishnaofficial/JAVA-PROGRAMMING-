
import java.util.*;

public class day6 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Ternary Operator
        // Q: Check whether a number is even or odd.

        System.out.print("Enter a number: ");
        int no = sc.nextInt();

        String type = (no % 2 == 0) ? "even" : "odd";
        System.out.println(type);


        // Q: Check if a student will pass or fail.

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        String result = (marks >= 33 && marks <= 100)
                ? "pass"
                : (marks >= 0) ? "fail" : "Invalid marks";

        System.out.println(result);


        // 24. Switch Statement

        int choice = 1;

        switch (choice) {
            case 1:
                System.out.println("pass");
                break;
            case 2:
                System.out.println("fail");
                break;
            case 3:
                System.out.println("promoted");
                break;
            default:
                System.out.println("Invalid choice");
        }


        // Q: Calculator using Switch Statement.

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Result: " + ((double) a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            case '%':
                if (b != 0) {
                    System.out.println("Result: " + (a % b));
                } else {
                    System.out.println("Cannot calculate remainder with zero");
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
        }


        //Q1. Find the smallest of two numbers using ternary.

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        int smallest = (n1 < n2) ? n1 : n2;
        System.out.println("Smallest number: " + smallest);


        // Q2. Check positive, negative, or zero using ternary.

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String numberType = (num > 0) ? "Positive"
                : (num < 0) ? "Negative" : "Zero";

        System.out.println(numberType);


        // Q3. Check divisibility by 5 using ternary.

        System.out.print("Enter a number: ");
        int value = sc.nextInt();

        String answer = (value % 5 == 0)
                ? "Divisible by 5"
                : "Not divisible by 5";

        System.out.println(answer);


        //  Q4. Find the largest of three numbers using ternary.

        System.out.print("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int max = (x > y)
                ? ((x > z) ? x : z)
                : ((y > z) ? y : z);

        System.out.println("Largest number: " + max);


        //  Q5. Check pass or fail using ternary.

        System.out.print("Enter marks out of 100: ");
        int studentMarks = sc.nextInt();

        String status = (studentMarks < 0 || studentMarks > 100)
                ? "Invalid marks"
                : (studentMarks >= 33) ? "Pass" : "Fail";

        System.out.println(status);


        //  Q6. Display a season using switch.

        System.out.print("Enter season number (1-3): ");
        int season = sc.nextInt();

        switch (season) {
            case 1:
                System.out.println("Summer");
                break;
            case 2:
                System.out.println("Rainy");
                break;
            case 3:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Invalid season number");
        }


        //  Q7. Select a drink using switch.

        System.out.print("Choose drink (1-3): ");
        int drink = sc.nextInt();

        switch (drink) {
            case 1:
                System.out.println("You selected Tea");
                break;
            case 2:
                System.out.println("You selected Coffee");
                break;
            case 3:
                System.out.println("You selected Milk");
                break;
            default:
                System.out.println("Invalid choice");
        }


        //  Q8. Display the number of days in a month.

        System.out.print("Enter month number (1-12): ");
        int monthNo = sc.nextInt();

        switch (monthNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            default:
                System.out.println("Invalid month number");
        }


        //Q9. Perform arithmetic operations using switch.

        System.out.print("Enter first number: ");
        int firstNo = sc.nextInt();

        System.out.print("Enter second number: ");
        int secondNo = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result: " + (firstNo + secondNo));
                break;
            case '-':
                System.out.println("Result: " + (firstNo - secondNo));
                break;
            case '*':
                System.out.println("Result: " + (firstNo * secondNo));
                break;
            case '/':
                if (secondNo != 0) {
                    System.out.println("Result: "
                            + ((double) firstNo / secondNo));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }


        //  Q10. Display a grade using switch.

        System.out.print("Enter grade code (1-5): ");
        int grade = sc.nextInt();

        switch (grade) {
            case 1:
                System.out.println("A Grade");
                break;
            case 2:
                System.out.println("B Grade");
                break;
            case 3:
                System.out.println("C Grade");
                break;
            case 4:
                System.out.println("D Grade");
                break;
            case 5:
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade code");
        }

  
    }
}
