package start.condition.ex;

public class CondOpEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b; // 조건을 괄호로 묶어주자..

        System.out.println("더 큰 숫자는 " + max + "입니다.");
    }
}
