import java.math.BigInteger;
import java.util.Scanner; // We need this import to accommodate large factorials that can exceed the range of primitive types.

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a  whole number: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            scanner.close();
            return;
        }

        // Start with 1, but as a BigInteger object
        BigInteger result = BigInteger.ONE; 

        for (int i = 1; i <= n; i++) {
            // I will multiply the result by 'i' converted to BigInteger
            result = result.multiply(BigInteger.valueOf(i));
        }

        System.out.println(n + "! = " + result);
        scanner.close();
    }
}