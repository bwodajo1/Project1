/*
 * Class: CMSC203
 * Instructor: Prof. Gary Thai
 * Due: 09/22/2023
 * Platform/Compiler: Eclipse
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Signed: Binyam Wodajo

 */
import java.util.Random;
import java.util.Scanner;

public class ESPGame {

    public static void main(String[] args) {
        // List of color names 
    	// Will read through its contexts by indexing the colors
    	// For example colors[0] will be Red
        final String[] colors = {"Red", "Green", "Blue", "Orange", "Yellow", "Purple", "Pink"};

        int noColors = 7;
        // Initialize a variable of user's correct guesses
        int correctGuesses = 0;

        // Number of rounds
        int rounds = 11;

        // Create a random number generator
        Random random = new Random();

        // Create a scanner for user input
        Scanner keyboard = new Scanner(System.in);

        // Ask for user's information
        System.out.print("Enter your name: ");
        String userName = keyboard.nextLine();

        System.out.print("Enter your MC M#: ");
        String mcNumber = keyboard.nextLine();

        System.out.print("Describes yourself: ");
        String description = keyboard.nextLine();

        System.out.print("Enter a due date (MM/DD/YY format): ");
        String dueDate = keyboard.nextLine();

        System.out.println("\nCMSC203 Assignment1: Test your ESP skills!"); 
        
        for (int i = 0; i < rounds; i++) {
            // Get a random index to select a color
            int randomIndex = random.nextInt(noColors);

            // Get the randomly selected color by iterating through the list
            String randomColor = colors[randomIndex];

            // Ask the user to guess the color
            System.out.println("I am thinking of a color. ");
            System.out.println("Is it Red, Green, Blue, Orange, Yellow, Purple, or Pink?");
            System.out.print("Enter your guess: ");
            String userGuess = keyboard.nextLine();

            // Display the randomly selected color
            System.out.println("I was thinking of : " + randomColor + ".");

            // Check if the user's guess is correct
            if (userGuess.equalsIgnoreCase(randomColor)) {
                correctGuesses++;
            } 
        }

        // Display number of correct guesses
        System.out.println("You guessed " + correctGuesses + " out of " + rounds + " correctly.");
        // Display user info
        System.out.println("User Name: " + userName);
        System.out.println("User Description: " + description);
        System.out.println("Due Date: " + dueDate); 
    }
}
