package projects_java;
import java.util.Scanner;

public class quiz_let {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] correct_ans = {'a', 'b', 'c', 'a', 'b'};
        boolean is_run = true;

        while (is_run) {
            
        
        // Number 1
        System.out.println("1. What is Java?");
        System.out.println("A. Rice");
        System.out.println("B. Soil");
        System.out.println("C. Manufacturer");
        System.out.println("D. Programming language");
        System.out.println("Type the right letter: ");
        char num1 = input.next().charAt(0);

        // Number 2
        System.out.println("1. What is Java?");
        System.out.println("A. Rice");
        System.out.println("B. Soil");
        System.out.println("C. Manufacturer");
        System.out.println("D. Programming language");
        System.out.println("Type the right letter: ");
        char num2 = input.next().charAt(0);

        // Number 3
        System.out.println("1. What is Java?");
        System.out.println("A. Rice");
        System.out.println("B. Soil");
        System.out.println("C. Manufacturer");
        System.out.println("D. Programming language");
        System.out.println("Type the right letter: ");
        char num3 = input.next().charAt(0);

        // Number 4
        System.out.println("1. What is Java?");
        System.out.println("A. Rice");
        System.out.println("B. Soil");
        System.out.println("C. Manufacturer");
        System.out.println("D. Programming language");
        System.out.println("Type the right letter: ");
        char num4 = input.next().charAt(0);

        // Number 5
        System.out.println("1. What is Java?");
        System.out.println("A. Rice");
        System.out.println("B. Soil");
        System.out.println("C. Manufacturer");
        System.out.println("D. Programming language");
        System.out.println("Type the right letter: ");
        char num5 = input.next().charAt(0);
        
        // Checking 
        if (Character.toLowerCase(num1) == correct_ans[0]) {
            System.out.println("1. Correct");
        } else {
            System.out.println("1. Wrong");
        }

        if (Character.toLowerCase(num1) == correct_ans[1]) {
            System.out.println("2. Correct");
        } else {
            System.out.println("2. Wrong");
        }

        if (Character.toLowerCase(num1) == correct_ans[2]) {
            System.out.println("3. Correct");
        } else {
            System.out.println("3. Wrong");
        }

        if (Character.toLowerCase(num1) == correct_ans[3]) {
            System.out.println("4. Correct");
        } else {
            System.out.println("4. Wrong");
        }

        if (Character.toLowerCase(num1) == correct_ans[4]) {
            System.out.println("5. Correct");
        } else {
            System.out.println("5. Wrong");
        }

        System.out.println("Try again? Y/N");
        char choice1 = input.next().charAt(0);

        if (Character.toUpperCase(choice1) == 'Y') {
            continue;
        } else if (Character.toUpperCase(choice1) == 'N') {
            break;
        } else {
            
        }

        }
    }
}
