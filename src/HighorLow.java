import java.util.Random;
import java.util.Scanner;

public class HighorLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1;
        int guess = 0;

        do {
            System.out.print("Guess a number between 1 and 10: ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                if (guess >= 1 && guess <= 10) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 10.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numerical value.");
                scanner.next();
            }
        } while (true);

        System.out.println("The random number was: " + randomNumber);

        if (guess < randomNumber) {
            System.out.println("Your guess was too low.");
        } else if (guess > randomNumber) {
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("Your guess was on the money!");
        }
    }
}