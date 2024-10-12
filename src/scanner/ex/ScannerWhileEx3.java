package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        System.out.println("입력한 숫자의 합과 평균을 출력하는 프로그램");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int input = 0;

        /*while(true) {
            System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요.: ");
            input = scanner.nextInt();
            if(input == -1) {
                System.out.println("입력한 숫자의 합계: " + sum);
                double avg = (double) sum / count;
                System.out.println("입력한 숫자의 평균: " + avg);
                break;
            }

            sum += input;
            count++;
        }*/

        // while(true) 대신 종료 조건을 넣을 수도 있다.
        while((input = scanner.nextInt()) != -1) {
            sum += input;
            count++;
        }

        // 결과 출력
        System.out.println("입력한 숫자의 합계: " + sum);
        double avg = (double) sum / count;
        System.out.println("입력한 숫자의 평균: " + avg);
    }
}
