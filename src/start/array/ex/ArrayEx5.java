package start.array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요.: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int sum = 0;

        System.out.println(size + "개의 정수를 입력하세요.");
        for(int i = 0;i < numbers.length;i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        System.out.println("입력한 정수의 합계: " + sum);

//        double avg = (double) sum/ numbers.length;
        double avg = (double) sum/ size;
        System.out.println("입력한 정수의 평균: " + avg);

    }
}
