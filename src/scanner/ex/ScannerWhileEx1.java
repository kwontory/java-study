package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("이름을 입력하세요.(종료를 입력하면 종료): ");
            String name = input.nextLine(); // (2) \n이 남아있음
            if(name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이를 입력하세요.: ");
            int age = input.nextInt(); // (1) 10\n -> 10만 가져가고 개행 문자가 남아있음
            input.nextLine(); // 숫자 입력 후 개행문자 처리

            System.out.println("당신의 이름은 " + name + "이고, " + "당신의 나이는 " + age + "살입니다.");
        }
    }
}
