import java.util.Scanner;

public class FuelCosts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallons = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;

        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (scanner.hasNextDouble()) {
                gallons = scanner.nextDouble();
                if (gallons > 0) {
                    break;
                } else {
                    System.out.println("The number of gallons must be greater than zero.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numerical value.");
                scanner.next();
            }
        } while (true);

        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (scanner.hasNextDouble()) {
                fuelEfficiency = scanner.nextDouble();
                if (fuelEfficiency > 0) {
                    break;
                } else {
                    System.out.println("Fuel efficiency must be greater than zero.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numerical value.");
                scanner.next();
            }
        } while (true);

        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                pricePerGallon = scanner.nextDouble();
                if (pricePerGallon > 0) {
                    break;
                } else {
                    System.out.println("The price of gas must be greater than zero.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numerical value.");
                scanner.next();
            }
        } while (true);

        double costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;

        double distanceWithCurrentGas = gallons * fuelEfficiency;

        System.out.printf("The cost per 100 miles is: $%.2f%n", costPer100Miles);
        System.out.printf("The car can go %.2f miles with the gas in the tank.%n", distanceWithCurrentGas);
    }
}