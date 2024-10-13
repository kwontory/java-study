package start.variable;

public class Var6 {
    public static void main(String[] args) {
        // 변수 초기화를 해야 하는 이유
        int a;
        // System.out.println(a);
        // java: start.variable a might not have been initialized -> 컴파일 에러
        // 컴퓨터 메모리는 여러 시스템이 함께 사용하는 공간이므로 어떠한 값들이 계속 저장된다.
        // 초기화를 하지 않으면 쓰레기 값이 남아 있어서 문제가 될 수 있다.

        int b = 2;
        System.out.println(b);
    }
}
