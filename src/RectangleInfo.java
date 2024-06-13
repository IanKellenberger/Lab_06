import java.util.Scanner;

public class RectangleInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = 0;
        double height = 0;

        do {
            System.out.print("Enter the width of the rectangle: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                if (width > 0) {
                    break;
                } else {
                    System.out.println("The width must be greater than zero.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numerical value.");
                scanner.next();
            }
        } while (true);

        do {
            System.out.print("Enter the height of the rectangle: ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                if (height > 0) {
                    break;
                } else {
                    System.out.println("The height must be greater than zero.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numerical value.");
                scanner.next();
            }
        } while (true);

        double area = width * height;

        double perimeter = 2 * (width + height);

        double diagonal = Math.sqrt(width * width + height * height);

        System.out.printf("The area of the rectangle is: %.2f%n", area);
        System.out.printf("The perimeter of the rectangle is: %.2f%n", perimeter);
        System.out.printf("The length of the diagonal is: %.2f%n", diagonal);
    }
}