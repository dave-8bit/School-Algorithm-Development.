//package ch1exam2;

import java.util.Scanner;

public class Ch1exam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;
        String decision;
        System.out.print("Enter your score: ");
        score = sc.nextInt();
        if(score >= 40) {
            decision = "The score is a pass mark";
        } else {
            decision = "The score is not a pass mark";
        }
        System.out.println(decision);
    }
}