package basic.ref;

public class InitMain {
    public static void main(String[] args) {
        InitTest init = new InitTest();
        System.out.println(init.value1); // 0으로 자동 초기화
        System.out.println(init.value2); // 10으로 초기화
    }
}
