package scanner;

import java.util.Arrays;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        System.out.print("Hello\n");
        System.out.print("Java!\n");

        // 사용자 입력을 받아보자.
        // System.in 으로 사용자 입력을 받기에 상당히 불편해서
        // Scanner 클래스를 제공한다.
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine(); // 입력을 String 으로 가져온다.
        System.out.println("입력한 문자열: " +  str);

        System.out.print("정수를 입력하세요: ");
        int i = scanner.nextInt();
        System.out.println("입력한 정수: " + i);

        System.out.print("실수를 입력하세요: ");
        double d = scanner.nextDouble();
        System.out.println("입력한 실수: " + i);

        // 타입이 다를 경우.. InputMismatchException 예외 발생하고 프로그램 종료
    }
}
