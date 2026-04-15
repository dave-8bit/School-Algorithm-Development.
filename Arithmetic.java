import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Temperature Converter ===");
        System.out.print("Enter temperature in Celsius: ");
        
        // Check if input is a valid number to prevent error
        if (input.hasNextDouble()) {
            double celsius = input.nextDouble();

            // Formulas
            double fahrenheit = (celsius * 9 / 5) + 32;
            double kelvin = celsius + 273.15;

            // Output results
            System.out.println("\n--- Results ---");
            System.out.printf("%.2f°C is equal to %.2f°F\n", celsius, fahrenheit);
            System.out.printf("%.2f°C is equal to %.2fK\n", celsius, kelvin);
        } else {
            System.out.println("Error: Please enter a valid numerical value.");
        }

        input.close();
    }
}