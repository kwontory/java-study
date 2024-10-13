package start.operator;

public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 * 3);
        // 위 아래 동일하지만,
        // 가독성을 위해 괄호를 넣어주는게 좋다.

        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

        // 연산자 우선순위 암기법
        // 1. 상식 선에서 우선순위를 사용하자.
        // 2. 애매하면 괄호()를 사용하자.
        // * 코드 작성은 항상 명확하고 이해하기 쉽게!
    }
}
