package start.loop.ex;

import java.util.Scanner;

public class NestedEx {
    public static void main(String[] args) {
        // 단 입력
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();

        // 구구단 출력
        for(int i = 1;i<=dan;i++) {
            System.out.println(i+"단");
            for(int j = 1;j <= 9;j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
    }

}
