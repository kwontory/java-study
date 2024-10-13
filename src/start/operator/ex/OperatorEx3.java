package start.operator.ex;

import java.util.Scanner;

public class OperatorEx3 {
    public static void main(String[] args) {
        // 문제3 - 합격 범위
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        System.out.println(80 <= score && score <= 100);
    }
}
