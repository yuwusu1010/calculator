import java.util.Scanner;


/**
 * PasswordCorrecter checks if a user's password meets minimum requirements:
 * - at least 8 characters
 * - contains at least one uppercase letter
 * - contains at least one lowercase letter
 * - contains at least one digit
 */
public class passwordCorrecter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correct = false;

        while (!correct) {
            System.out.println("Please enter a password:");

            String password = sc.nextLine();

            boolean length = password.length() >= 8;
            boolean hasUpperCase = password.matches(".*[A-Z].*");
            boolean hasLowerCase = password.matches(".*[a-z].*");
            boolean hasDigit = password.matches(".*[0-9].*");

            if (length && hasUpperCase && hasLowerCase && hasDigit) {
                System.out.println(" Your password is correct.");
                correct = true;
            } else {
                System.out.println(" Invalid password. Please fix the following:");
                if (!length) {
                    System.err.println("- Password must be at least 8 characters long.");
                }
                if (!hasUpperCase) {
                    System.err.println("- Password must contain at least one uppercase letter.");
                }
                if (!hasLowerCase) {
                    System.err.println("- Password must contain at least one lowercase letter.");
                }
                if (!hasDigit) {
                    System.err.println("- Password must contain at least one number.");
                }
                System.out.println("\nExample of a valid password: Abracadabra187\n");
            }
        }

        sc.close();
    }
}
