package start.scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단을 출력합니다. 출력할 단 수를 입력해 주세요.: ");
        int dan = scanner.nextInt();

        for (int i = 1;i <= 9;i++) {
            System.out.println(dan + " x " + i +" = " + (dan*i));
        }
    }
}
