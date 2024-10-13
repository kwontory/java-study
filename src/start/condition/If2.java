package start.condition;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        // if만 사용할 경우에 조건을 중복으로 체크함
        // 독립 조건일 때, 각각 수행해야 할 때
        if(age <= 7) {
            System.out.println("미취학");
        }
        if(age >= 8 && age <= 13) {
            System.out.println("초등학생");
        }
        if(age >= 14 && age <= 16) {
            System.out.println("중학생");
        }
        if(age >= 17 && age <= 19) {
            System.out.println("고등학생");
        }
        if(age >= 20){
            System.out.println("성인");
        }

        // if-else if-else **
        // 여러 조건 중에 하나만 실행이 되어야 할 때
        if(age <= 7) {
            System.out.println("미취학");
        } else if(age <= 13) {
            System.out.println("초등학생");
        } else if(age <= 16) {
            System.out.println("중학생");
        } else if(age <= 19) {
            System.out.println("고등학생");
        } else { // else 는 생략 가능
            System.out.println("성인");
        }
    }
}
