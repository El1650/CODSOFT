import java.util.Random;
import java.util.Scanner;

public class NumberGame {
  public static void main(String[] args) {
    int startRange = 1, endRange = 100, attemptLimit = 10, roundsWon = 0;
    String choice;
    
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    System.out.println("\n************Welcome to the Number Guessing Game!************");

    do {
      int scoreNumber = random.nextInt(endRange - startRange + 1) + startRange;
      int guess = 0;
      int maxAttempt = 0;

      System.out.println("\nGuess a number between " + startRange + " and " + endRange);

      while (guess < attemptLimit) {
        System.out.print("Enter your guess: ");
        int playerNumber = sc.nextInt();
        guess++;

        if (playerNumber == scoreNumber) {
          System.out.println("\nHurrayyy!!! You got the number in " + guess + " guesses.");
          roundsWon++;
          maxAttempt++;
          break;
        } else if (playerNumber < scoreNumber) {
          System.out.println("\nToo Low! Try again.");
        } else {
          System.out.println("\nToo High! Try again.");
        }

      }

      if (maxAttempt == 0) {
        System.out.println("\nYou ran out of attempts");
        System.out.print("The correct number was " + scoreNumber);
      }

      System.out.print("\nDo you wish to continue(Yes/No): ");
      choice = sc.next();

    } while (choice.equals("Yes"));

    System.out.println("\n\nGame Over! You won " + roundsWon + " rounds.");
  }
}
