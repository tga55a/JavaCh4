import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a full sentence
        System.out.print("Enter a full sentence: ");

        // Store the sentence in a String variable
        String stringVariable = input.nextLine();

        // Print the number of characters in the sentence
        System.out.println("\nNumber of characters in sentence: " + stringVariable.length() + "\n");


        // Print the first and last characters
        System.out.println("First Character: " + stringVariable.substring(0, 1) + "\nLast Character: " + stringVariable.substring(stringVariable.length() - 1, stringVariable.length()) + "\n");

        // Print the sentence with whitespace removed from both ends
        System.out.println("Whitespace removed from both ends: " + stringVariable.trim() + "\n");

        // Print the sentence in all uppercase
        System.out.println("Sentence in all uppercase: " + stringVariable.toUpperCase() + "\n");

        // Print the sentence in all lowercase
        System.out.println("Sentence in all lowercase: " + stringVariable.toLowerCase() + "\n");

        // Prompt the user to enter a single character
        System.out.println("Enter a single character: ");
        char singleCharacter = input.nextLine().charAt(0);


        // Determine if it is a letter, digit, or neither
        // If it's a letter, check if it's uppercase or lowercase
        // Print the decimal code of the character

        if (Character.isDigit(singleCharacter)) {
            System.out.println("The letter you provided is a digit.");
        } else if(Character.isLetter(singleCharacter)) {
            boolean isUppercase = Character.isUpperCase(singleCharacter);
            if (isUppercase) {
                System.out.println("The letter your provided is an UPPERCASE letter.");
            } else if (!isUppercase) {
                System.out.println("the letter you provided is a lowercase letter.");
            }  
        } else {
            System.out.println("The letter you provided is neither a digit or letter.");
        }
        System.out.println("The decimal code of the provided character is " + (int)(singleCharacter) + ".");

        // BONUS:
        // Prompt the user for a substring to search for
        // Display the index of the first occurrence or -1 if not found

        System.out.println("Select a part of the text your provided");
        String substring = input.nextLine();
        System.out.println("The index of the first occurence is: " + stringVariable.toLowerCase().indexOf(substring.toLowerCase()));

    }
}
