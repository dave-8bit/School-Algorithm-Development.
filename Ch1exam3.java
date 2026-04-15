//package ch1exam3; Highly unnecssary, but I will leave it here for now.

import java.util.Scanner;

public class Ch1exam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;
        String message;
        System.out.print("Enter your score: ");
        score = sc.nextInt();
        if(score < 0 || score > 100) {
            message = "Invalid score";
        } else if(score >= 40) {
            message = "The score is a pass mark";
        } else {
            message = "The score is not a pass mark";
        }
        System.out.println(message);
    }
}