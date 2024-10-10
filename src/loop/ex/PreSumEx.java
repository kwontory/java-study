package loop.ex;

import java.util.Scanner;

public class PreSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int sum = 0;
        for(int i = 1;i <= max;i++) {
            sum += i;
        }
        System.out.println(max+ "까지의 누적 합은 " + sum+ "입니다.");
        System.out.println("------------------------------------");

        int i = 1;
        sum = 0; // 초기화
        while(i <= max) {
            sum+=i;
            i++;
        }
        System.out.println(max+ "까지의 누적 합은 " + sum+ "입니다.");
        System.out.println("------------------------------------");
    }
}
