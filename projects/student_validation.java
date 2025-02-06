import java.util.Scanner;

public class student_validation {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        while (true) {
        System.out.println("Welcome to student registration! ");

        System.out.println("Please state your name (Ex. Last name, First name Middle initial): ");
        String usr_name = user_input.next();

        System.out.println("Please state your age: ");
        int usr_age = user_input.nextInt();

        System.out.println(usr_name + " & " + usr_age + " is now registered to our system!");

        System.out.println("Continue registering? Y/N");
        char choice = user_input.next().charAt(0);

        if (choice == 'Y' || choice == 'y') {
            continue;
        } else if (choice =='N' || choice == 'n') {
            System.out.println("Thank you for using us!");
            break;
        }

    }
}
}
