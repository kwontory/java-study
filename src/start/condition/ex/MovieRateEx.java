package start.condition.ex;

import java.util.Scanner;

public class MovieRateEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rating = sc.nextInt();

        // 요청한 평점 이상의 영화
        if(rating <= 9) {
            System.out.println("어바웃타임");
        }
        if(rating <= 8) {
            System.out.println("토이 스토리");
        }
        if(rating <= 7) {
            System.out.println("고질라");
        }
    }
}
