import java.util.Scanner;

/**
 * A simple Console Application that captures user details
 * using the Scanner class and prints a structured summary.
 */
public class UserProfileApp {
    public static void main(String[] args) {
        // Initialize the Scanner to read input from the console
        Scanner scanner = new Scanner(System.in);

        // --- 1. USER INPUT COLLECTION ---

        // Capture a String (Full Name)
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Capture an Integer (Age)
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Capture a Double (GPA)
        System.out.print("What is your GPA: ");
        double gpa = scanner.nextDouble();

        // Capture a Boolean (Student Status)
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("\n---------------------------------"); // Visual separator for output

        // --- 2. OUTPUT GENERATION ---

        System.out.println("Hello, " + name + "!");
        System.out.println("Age: " + age + " years old");
        System.out.println("GPA: " + gpa);

        // Conditional check to display enrollment status smoothly
        if (isStudent) {
            System.out.println("Status: You are currently enrolled as a student.");
        } else {
            System.out.println("Status: You are not currently enrolled as a student.");
        }

        System.out.println("---------------------------------");

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}
