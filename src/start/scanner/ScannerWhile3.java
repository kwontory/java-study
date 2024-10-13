package start.scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력한 숫자의 합을 출력하는 프로그램");
        System.out.println("0 입력 시 합계를 출력합니다.");
        int sum = 0;
        while(true) {
            System.out.print("정수를 입력하세요.: ");
            int add = scanner.nextInt();
            if(add == 0) {
                System.out.println("입력한 숫자의 합: " + sum);
                break;
            }
            sum += add;
        }
    }
}
