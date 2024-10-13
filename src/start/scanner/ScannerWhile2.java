package start.scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("두 숫자의 합을 출력하는 프로그램");
            System.out.println("두 숫자가 모두 0이면 프로그램을 종료합니다.");
            System.out.println("첫번째 숫자를 입력하세요.");
            int num1 = scanner.nextInt();
            System.out.println("두번째 숫자를 입력하세요.");
            int num2 = scanner.nextInt();

            if(num1 == 0 && num2 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("두 숫자의 합은 " + (num1 + num2) + "입니다.");
        }
    }
}
