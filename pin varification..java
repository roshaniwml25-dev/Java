import java.util.Scanner;

public class PINValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your 4-digit PIN: ");
        String pin = sc.nextLine();

        boolean valid = true;

        // Check if PIN contains exactly 4 characters
        if (pin.length() != 4) {
            valid = false;
        } else {
            // Check each character using a loop
            for (int i = 0; i < pin.length(); i++) {
                if (!Character.isDigit(pin.charAt(i))) {
                    valid = false;
                    break;
                }
            }
        }

        // Display result
        if (valid) {
            System.out.println("Valid PIN");
        } else {
            System.out.println("Invalid PIN");
        }

        sc.close();
    }
}