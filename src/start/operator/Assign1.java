package start.operator;

public class Assign1 {
    public static void main(String[] args) {
        // 대입 연산자: 값을 변수에 대입하는 연산자로 이 연산자를 사용하면 변수에 값을 할당할 수 있다.
        // 축약(복합) 대입 연산자: +=, -=, /=, %=
        int a = 5;
        a += 3;
        System.out.println(a); // 8
        a -= 2;
        System.out.println(a); // 6
        a /= 2;
        System.out.println(a); // 3
        a %= 3;
        System.out.println(a); // 0
    }
}
