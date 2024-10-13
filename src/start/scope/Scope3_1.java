package start.scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if(m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
        // temp 변수는 if문 내에서만 필요하다. 이렇게 사용할 경우 불필요한 메모리 소모가 발생한다.
        // 코드 복잡도가 증가한다.
        // 왜냐하면 temp 변수를 main 블록 내에 선언 했으므로 프로그램 종료 시까지 계속 해당 변수를 생각해야한다.
    }
}
