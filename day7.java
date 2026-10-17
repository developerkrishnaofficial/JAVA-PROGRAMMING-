import java.util.Scanner;

public class day7 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Q1();
        // Q2();
        // Q3();
        // Q4();
        // Q5();
        Q6();
        // Q7();
        // Q8();
        // Q9();
        // Q10();
        // Q11();
        // Q12();
        // Q13();
        // Q14();
        // Q15();
        // Q16();
        // Q17();
        // Q18();
        // Q19();
        // Q20();


    }
    // Q1. Calculate arithmetic operations on two integers.
    static void Q2() {
        int a = 20, b = 10;

        System.out.println("Sum: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }

    // Q3. Take two numbers and calculate their sum.
    static void Q3() {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum: " + (a + b));
    }

    // Q4. Calculate the area of a rectangle.
    static void Q4() {
        System.out.print("Enter length and breadth: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        System.out.println("Area: " + (length * breadth));
    }

    // Q5. Check whether a number is even or odd.
    static void Q5() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    // Q6. Check whether a number is positive, negative, or zero.
    static void Q6() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    // Q7. Find the largest of two numbers.
    static void Q7() {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Largest: " + a);
        } else if (b > a) {
            System.out.println("Largest: " + b);
        } else {
            System.out.println("Both numbers are equal");
        }
    }

    // Q8. Find the smallest of two numbers.
    static void Q8() {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) {
            System.out.println("Smallest: " + a);
        } else if (b < a) {
            System.out.println("Smallest: " + b);
        } else {
            System.out.println("Both numbers are equal");
        }
    }

    // Q9. Check voting eligibility.
    static void Q9() {
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    // Q10. Check pass or fail (35 marks required).
    static void Q10() {
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 35 && marks <= 100) {
            System.out.println("Pass");
        } else if (marks >= 0 && marks < 35) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid marks");
        }
    }

    // Q11. Categorize a person by age.
    static void Q11() {
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age < 13) {
            System.out.println("Child");
        } else if (age <= 19) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }
    }

    // Q12. Find the largest of three numbers.
    static void Q12() {
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Largest: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest: " + b);
        } else {
            System.out.println("Largest: " + c);
        }
    }

    // Q13. Check divisibility by both 3 and 5.
    static void Q13() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else {
            System.out.println("Not divisible by both 3 and 5");
        }
    }

    // Q14. Check whether a year is a leap year.
    static void Q14() {
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year <= 0) {
            System.out.println("Invalid year");
        } else if (year % 400 == 0) {
            System.out.println("Leap year");
        } else if (year % 100 == 0) {
            System.out.println("Not a leap year");
        } else if (year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }

    // Q15. Display grade according to marks.
    static void Q15() {
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        } else if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else if (marks >= 35) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }

    // Q16. Check divisibility by 5 or 11.
    static void Q16() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 5 == 0 || n % 11 == 0) {
            System.out.println("Divisible by 5 or 11");
        } else {
            System.out.println("Not divisible by 5 or 11");
        }
    }

    // Q17. Check whether a character is a vowel or consonant.
    static void Q17() {
        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') ||
            (ch >= 'a' && ch <= 'z')) {

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' || ch == 'A' ||
                ch == 'E' || ch == 'I' || ch == 'O' ||
                ch == 'U') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }

        } else {
            System.out.println("Invalid alphabet");
        }
    }

    // Q18. Check bonus eligibility.
    static void Q18() {
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        if (salary >= 50000) {
            System.out.println("Eligible for bonus");
        } else if (salary >= 0) {
            System.out.println("Not eligible for bonus");
        } else {
            System.out.println("Invalid salary");
        }
    }

    // Q19. Calculate total and percentage for three subjects.
    static void Q19() {
        System.out.print("Enter marks for three subjects: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < 0 || a > 100 || b < 0 || b > 100 ||
            c < 0 || c > 100) {
            System.out.println("Invalid marks");
        } else {
            int total = a + b + c;
            double percentage = total / 3.0;

            System.out.println("Total: " + total);
            System.out.println("Percentage: " + percentage + "%");

            if (a >= 35 && b >= 35 && c >= 35) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }
    }

    // Q20. Display ticket category according to age.
    static void Q20() {
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age < 5) {
            System.out.println("Free ticket");
        } else if (age <= 17) {
            System.out.println("Child ticket");
        } else if (age <= 59) {
            System.out.println("Adult ticket");
        } else {
            System.out.println("Senior ticket");
        }
    }


    }
}
