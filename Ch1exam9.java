import java.util.Scanner;

public class Ch1exam9 {
    public static void main(String[] args) {
        int n, i, x, sumX = 0, sumSq = 0, totalSq;
        double aveTotalSq, ave, variance, stddev;   // ← aveTotalSq and ave declared here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of scores, n: ");
        n = sc.nextInt();
        for(int count = 1; count <= n; count++) {
            System.out.print(count + ". Enter a score: ");
            x = sc.nextInt();
            sumX = sumX + x;
            sumSq = sumSq + x * x;
        }
        totalSq = sumX * sumX;
        aveTotalSq = (double)totalSq / n;     // ← now declared
        ave = (double)sumX / n;
        variance = (sumSq - aveTotalSq) / n;  // ← now uses declared variable
        stddev = Math.sqrt(variance);
        System.out.println("The variance is " + variance);
        System.out.println("The standard deviation is " + stddev);
    }
}