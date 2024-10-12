package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요.: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int max = 0;
        int min = 0;

        System.out.println(size + "개의 정수를 입력하세요.");
        for(int i = 0;i < numbers.length;i++) {
            numbers[i] = scanner.nextInt();
            if(i == 0) {
                max = min = numbers[i];
                continue;
            }
            if(numbers[i] > max) {
                max = numbers[i];
            }
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("가장 큰 정수: " + max);
        System.out.println("가장 작은 정수: " + min);

    }
}
