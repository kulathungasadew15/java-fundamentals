import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // MAD LIBS GAME
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        // --- User Input Phase ---
        System.out.print("Enter an adjective: ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun: ");
        noun1 = scanner.nextLine();

        System.out.print("Enter another adjective: ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a verb: ");
        verb1 = scanner.nextLine();

        System.out.print("Enter one last adjective: ");
        adjective3 = scanner.nextLine();

        System.out.println(); // Prints a blank line for spacing

        // --- Story Output Phase ---
        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("I saw a giant " + noun1 + " eating a computer!");
        System.out.println("It looked incredibly " + adjective2 + " while trying to " + verb1 + ".");
        System.out.println("Overall, it was a " + adjective3 + " day of coding!");
        
        scanner.close();
    }
}
