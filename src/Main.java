import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter a temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a numerical value.");
                scanner.next();
            }
        }

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("The equivalent temperature in Fahrenheit is: " + fahrenheit);
    }
}