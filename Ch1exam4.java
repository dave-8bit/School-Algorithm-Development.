//package ch1exam4;

import java.util.Scanner;

public class Ch1exam4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int examscore, caScore;
        String message;
        System.out.print("Enter continuous assessment score: ");
        caScore = sc.nextInt();
        System.out.print("Enter exam score: ");
        examscore = sc.nextInt();
        if(examscore < 0 || examscore > 70) {
            message = "Invalid exam score";
        } else if(caScore < 0 || caScore > 30) {
            message = "Invalid continuous assessment score";
        } else {
            int totalScore = caScore + examscore;
            if(totalScore >= 40) {
                message = "The total is Pass mark";
            } else {
                message = "The total is not Pass mark";
            }
        }
        System.out.println(message);
    }
}