import java.util.Scanner;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        int attempts = 5;
        while (attempts > 0) {
            
            System.out.print("Guess a number between 1 and 100: ");
            Scanner scanner = new Scanner(System.in);
            int guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("Correct! You win!");
                break;
            } else if (guess > randomNumber) {
                System.out.println("It's higher than the secret number!");
            } else {
                System.out.println("It's lower than the secret number low!");
            }
            attempts--;
        }
        if (attempts == 0) {
            System.out.println(" Sorry!!You have no attempts left. The number was " + randomNumber + ".");
        }
    }
}
