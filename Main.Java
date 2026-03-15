import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        double[] data = new double[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += data[i];
        }
        double mean = sum / n;

        double squaredDiffSum = 0;
        for (int i = 0; i < n; i++) {
            double diff = data[i] - mean;
            squaredDiffSum += diff * diff;
        }

        double variance = squaredDiffSum / n;
        double stdDev = Math.sqrt(variance);

        System.out.println("Mean: " + mean);
        System.out.println("Variance: " + variance);
        System.out.println("Standard Deviation: " + stdDev);

        scanner.close();
    }
}