package start.scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요. ");
        int num1 = scanner.nextInt();

        System.out.print("숫자를 입력해 주세요. ");
        int num2 = scanner.nextInt();

        System.out.println("sum = " + (num1+num2));

    }
}
