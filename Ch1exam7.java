import java.util.Scanner;

public class Ch1exam7 {
    public static void main(String[] args) {
        int n, sum, score;
        double ave;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of student, n: ");
        n = sc.nextInt();
        sum = 0;
        for(int i = 1; i <= n; i++) {
            System.out.print(i + ". Enter score: ");
            score = sc.nextInt();
            sum = sum + score;
        }
        ave = sum / 7.0;
        System.out.println("The average score is " + ave);
    }
}