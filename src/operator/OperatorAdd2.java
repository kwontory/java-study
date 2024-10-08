package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        // 전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a; // a의 값을 먼저 증가하고, 그 결과를 b에 대입한다.
        System.out.println("a = " + a + " b = " + b);

        // 후위 증감 연산자 사용 예
        a = 1;
        b = 0;

        b = a++; // a의 현재 값을 b에 먼저 대입한 후 a의 값을 증가한다.
        System.out.println("a = " + a + " b = " + b);

        // 증감 연산자를 단독으로 사용할 경우엔 전위 후위 관계 없이 같은 결과
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
    }
}
