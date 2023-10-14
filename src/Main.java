import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {

    public static String printStrongNess(String input) {
        // Checking lower alphabet in string
        int n = input.length();
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray()) {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }

        // Strength of password
        System.out.print("Strength of password:- ");

        if (hasDigit && hasLower && hasUpper && specialChar && (n >= 8)) {
            System.out.print("Strong\nPassword Saved\n");
        return "Strong";
        } else if ((hasLower || hasUpper || specialChar) && (n >= 6)) {
            System.out.print("Moderate");
            return "Moderate";
        } else
            System.out.print("Weak");
        return "Weak";
    }

    // Main Code

    public static void main(String[] args) {

        System.out.println("..:: PASSWORD STRENGTH CHECKER ::..");
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a password:");
            String password = scan.nextLine();
            String strength = printStrongNess(password);

            if ("Strong".equals(strength)) {
                System.out.println("Password Strength: " + strength);
                break; // Exit the loop if the password is strong
            } else {
                System.out.println("\nPassword is "+strength+". Please try again.");
            }

        }
    }
}

