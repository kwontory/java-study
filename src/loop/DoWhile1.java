package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;
        do { // 최초 한번은 코드블럭을 실행한다.
            System.out.println("현재 숫자는 " + i);
            i++;
        } while(i < 3); // 실행 후 조건을 검사, 조건이 거짓이 될 때까지 진행한다.
    }
}
