package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        b = ++a; // a를 먼저 증가시키고, 그 결과를 b에 대입한다.
        System.out.println("a = " + a + " b = " + b);

    }
}
