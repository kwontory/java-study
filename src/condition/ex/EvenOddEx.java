package condition.ex;

import java.util.Scanner;

public class EvenOddEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String result = (x % 2 == 0) ? "짝수" : "홀수"; // 조건에 괄호..하자..
        System.out.println("x = " + x + ", " + result);
    }
}
