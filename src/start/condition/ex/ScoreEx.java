package start.condition.ex;

import java.util.Scanner;

public class ScoreEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score =  sc.nextInt();

        if(score >= 90) {
            System.out.println("A학점");
        } else if(score >= 80) {
            System.out.println("B학점");
        } else if (score >= 70) {
            System.out.println("C학점");
        } else if (score >= 60) {
            System.out.println("D학점");
        } else {
            System.out.println("F학점");
        }
    }
}
