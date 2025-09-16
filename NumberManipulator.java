import java.util.Scanner;

public class NumberManipulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.println("Enter a decimal number (e.g 1.5, 3.3)");

        // Store the input in a variable
        double userInput = input.nextDouble();

        // Print the smallest integer greater than or equal to the number
        int Part1Answer = (int)(Math.ceil(userInput));
        System.out.println("the smallest integer greater than or equal to this number is: " + Part1Answer); 
            // I used ceil because this method returns the closest integer that is greater than the input. 

        // Print the largest integer less than or equal to the number
        int Part2Answer = (int)(Math.floor(userInput));
        System.out.println("the largest integer less than or equal to this number is: " + Part2Answer); 
            // I used floor because this method returns the closest integer that is less than the input.

        // Print the integer that is closest to the number (ties go to even)
        int Part3Answer = (int)(Math.rint(userInput));
        System.out.println("the integer that is closest to the number (ties go to even): " + Part3Answer); // I used rint because this method returns the closest integer that leans toward being an even number.

        // Print the integer closest to the number (standard rounding)
        int Part4Answer = (int)(Math.round(userInput));
        System.out.println("the integer closest to the number (standard rounding): " + Part4Answer); 
            // I used round because this method returns the closest lowest integer if the last place value is less than 5 or the largest closest integer if the last place value is greater than 5.

        // BONUS:
        // Cast the number to an int and print the character it represents
        // Add 1 to that number and print the next character
        // Format a summary table using formatted output
        char character = (char)(userInput);

        System.out.println("Character that the number represents: " + character++ + "\nNext Character: " + character);

        System.out.println("\n\nSummary Table:");
        System.out.printf("Math.Ceil\t\t%d\n", Part1Answer);
        System.out.printf("Math.Floor\t\t%d\n", Part2Answer);
        System.out.printf("Math.Rint\t\t%d\n", Part3Answer);
        System.out.printf("Math.Round\t\t%d\n", Part4Answer);
        System.out.printf("ASCII Character\t\t%s\n", Character.toString(--character));
        System.out.printf("Next ASCII Character\t%s\n", Character.toString(++character));

        input.close();
    }
}
