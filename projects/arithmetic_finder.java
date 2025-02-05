import java.util.Scanner;

public class arithmetic_finder {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = user_input.nextInt();

        System.out.println("Enter second number: ");
        int num2 = user_input.nextInt();
  
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("\nResults:");
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
        System.out.println("Modulus: " + remainder);

        user_input.close();
    }
}
