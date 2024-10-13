package start.array.ex;

import java.util.Scanner;

public class ArrayEx6_1 {
    public static void main(String[] args) { // 조건 체크가 하나 줄어서 이 방법이 더 빠르다..
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요.: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int max, min;

        System.out.println(size + "개의 정수를 입력하세요.");
        for(int i = 0;i < numbers.length;i++) {
            numbers[i] = scanner.nextInt();
        }
        max = min = numbers[0]; // 초기화
        for(int num : numbers) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        System.out.println("가장 큰 정수: " + max);
        System.out.println("가장 작은 정수: " + min);

    }
}
