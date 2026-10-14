
import java.util.Scanner;

public class DAY5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q1. Conditional Statements: Check Age
        // Question: Check whether a person is an adult,
        // teenager, or child.

        int age = 17;

        if (age >= 18) {
            System.out.println("Adult: Can vote");
        } else if (age >= 13) {
            System.out.println("Teenager");
        } else {
            System.out.println("Child");
        }


        // Q2. Print the Largest of Two Numbers
        // Example: a = 1, b = 3

        int a = 1;
        int b = 3;

        if (a >= b) {
            System.out.println("Largest number is: " + a);
        } else {
            System.out.println("Largest number is: " + b);
        }


        // Q3. Check Whether a Number Is Odd or Even

        System.out.print("Enter a number to check odd/even: ");
        int no = sc.nextInt();

        if (no % 2 == 0) {
            System.out.println(no + " is EVEN");
        } else {
            System.out.println(no + " is ODD");
        }


        // Q4. Check Age Using Else-If Statements

        System.out.print("Enter your age: ");
        int userAge = sc.nextInt();

        if (userAge < 0) {
            System.out.println("Invalid age");
        } else if (userAge >= 18) {
            System.out.println("Adult");
        } else if (userAge >= 13) {
            System.out.println("Teenager");
        } else {
            System.out.println("Child");
        }


        // Q5. Income Tax Calculator
        // Income < 5 lakh       = 0% tax
        // Income 5 to < 10 lakh = 20% tax
        // Income >= 10 lakh     = 30% tax
        // Simplified practice example; tax is calculated
        // on the entire income, not actual tax rules.

        System.out.print("Enter your annual income in rupees: ");
        double income = sc.nextDouble();

        double tax;

        if (income < 0) {
            System.out.println("Invalid income");
        } else if (income < 500000) {
            tax = 0;
            System.out.println("Your tax is: " + tax);
        } else if (income < 1000000) {
            tax = income * 0.20;
            System.out.println("Your tax is: " + tax);
        } else {
            tax = income * 0.30;
            System.out.println("Your tax is: " + tax);
        }


        // Q6. Print the Largest of Three Numbers

        int x = 1;
        int y = 20;
        int z = 9;

        if (x >= y && x >= z) {
            System.out.println("Largest number is: " + x);
        } else if (y >= x && y >= z) {
            System.out.println("Largest number is: " + y);
        } else {
            System.out.println("Largest number is: " + z);
        }


        // Q7. Check Positive, Negative, or Zero

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Number is zero");
        }


        // Q8. Check Divisibility by 5 and 3

        System.out.print("Enter a number for divisibility: ");
        int value = sc.nextInt();

        if (value % 5 == 0 && value % 3 == 0) {
            System.out.println("Divisible by both 5 and 3");
        } else {
            System.out.println("Not divisible by both 5 and 3");
        }


        // Q9. Check Whether a Student Passed or Failed
        // Passing marks = 35

        System.out.print("Enter your marks out of 100: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        } else if (marks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


        // Q10. Check Whether a Year Is a Leap Year

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year <= 0) {
            System.out.println("Invalid year");
        } else if (year % 400 == 0 ||
                  (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }


        // Q11. Grade Calculator
        // 90-100 = A, 75-89 = B, 60-74 = C
        // 35-59 = D, Below 35 = Fail

        System.out.print("Enter your marks for grade: ");
        int gradeMarks = sc.nextInt();

        if (gradeMarks < 0 || gradeMarks > 100) {
            System.out.println("Invalid marks");
        } else if (gradeMarks >= 90) {
            System.out.println("A Grade");
        } else if (gradeMarks >= 75) {
            System.out.println("B Grade");
        } else if (gradeMarks >= 60) {
            System.out.println("C Grade");
        } else if (gradeMarks >= 35) {
            System.out.println("D Grade");
        } else {
            System.out.println("Fail");
        }


        // Q12. Find the Smallest of Two Numbers

        int a1 = 25;
        int b1 = 10;

        if (a1 < b1) {
            System.out.println("Smallest: " + a1);
        } else {
            System.out.println("Smallest: " + b1);
        }


        // Q13. Check Voting Eligibility

        System.out.print("Enter age to check voting eligibility: ");
        int votingAge = sc.nextInt();

        if (votingAge < 0) {
            System.out.println("Invalid age");
        } else if (votingAge >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }


        // Q14. Check Whether a Character Is a Vowel or Consonant

        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') ||
            (ch >= 'A' && ch <= 'Z')) {

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }

        } else {
            System.out.println("Please enter an alphabet");
        }


        // Q15. Calculate Discount Based on Purchase Amount
        // Amount >= 2000 = 20% discount
        // Amount >= 1000 = 10% discount
        // Otherwise = no discount

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        double discount;

        if (amount < 0) {
            discount = 0;
            System.out.println("Invalid purchase amount");
        } else {
            if (amount >= 2000) {
                discount = amount * 0.20;
            } else if (amount >= 1000) {
                discount = amount * 0.10;
            } else {
                discount = 0;
            }

            System.out.println("Discount: " + discount);
            System.out.println("Final amount: " + (amount - discount));
        }


        // Q16. Simple Calculator Using If-Else

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        if (operator == '+') {
            System.out.println("Result: " + (first + second));
        } else if (operator == '-') {
            System.out.println("Result: " + (first - second));
        } else if (operator == '*') {
            System.out.println("Result: " + (first * second));
        } else if (operator == '/') {
            if (second != 0) {
                System.out.println("Result: " + ((double) first / second));
            } else {
                System.out.println("Cannot divide by zero");
            }
        } else {
            System.out.println("Invalid operator");
        }


        // Q17. Check Whether a Number Is Divisible by 7

        System.out.print("Enter a number to check divisibility by 7: ");
        int divNumber = sc.nextInt();

        if (divNumber % 7 == 0) {
            System.out.println("Divisible by 7");
        } else {
            System.out.println("Not divisible by 7");
        }


        // Q18. Find the Middle Value Among Three Numbers
        // Print the number that is neither largest nor smallest.

        System.out.print("Enter first number: ");
        int m1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int m2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int m3 = sc.nextInt();

        if ((m1 >= m2 && m1 <= m3) ||
            (m1 <= m2 && m1 >= m3)) {
            System.out.println("Middle value: " + m1);
        } else if ((m2 >= m1 && m2 <= m3) ||
                   (m2 <= m1 && m2 >= m3)) {
            System.out.println("Middle value: " + m2);
        } else {
            System.out.println("Middle value: " + m3);
        }


        // Q19. Check Whether a Character Is Uppercase or Lowercase

        System.out.print("Enter an alphabet: ");
        char letter = sc.next().charAt(0);

        if (letter >= 'A' && letter <= 'Z') {
            System.out.println("Uppercase letter");
        } else if (letter >= 'a' && letter <= 'z') {
            System.out.println("Lowercase letter");
        } else {
            System.out.println("Not an alphabet");
        }


        // Q20. Electricity Bill Calculator
        // First 100 units = Rs. 5 per unit
        // Next 100 units = Rs. 7 per unit
        // Above 200 units = Rs. 10 per unit
        // Simplified practice example.

        System.out.print("Enter electricity units consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units < 0) {
            System.out.println("Invalid units");
        } else if (units <= 100) {
            bill = units * 5;
            System.out.println("Electricity bill: Rs. " + bill);
        } else if (units <= 200) {
            bill = (100 * 5) + ((units - 100) * 7);
            System.out.println("Electricity bill: Rs. " + bill);
        } else {
            bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
            System.out.println("Electricity bill: Rs. " + bill);
        }
    }
}
