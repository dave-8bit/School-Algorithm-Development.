import java.util.Scanner;

public class Ch1exam5 {
    public static void main(String[] args) {
        int n, i, sumX = 0;
        int x;
        double ave;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of scores, n: ");
        n = sc.nextInt();
        for(i = 1; i <= n; i++) {
            System.out.print(i + ". Enter a score: ");
            x = sc.nextInt();
            sumX = sumX + x;
        }
        ave = (double)sumX / n;
        System.out.println("The average score is: " + ave);
    }
}