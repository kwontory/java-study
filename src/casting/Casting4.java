package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3/2; //1
        System.out.println(div1);
        double div2 = 3/2; // 1.5 -> 1.0 : int/int = (double)int
        System.out.println(div2);
        double div3 = 3.0/2; // 1.5 : double/int = double/double = double
        System.out.println(div3);
        double div4 = (double) 3/2; // 1.5 : double/int = double/double = double
        System.out.println(div4);

        int a = 3;
        int b = 2;
        double result = (double) a/b; // 1.5
        System.out.println(result);

        // 같은 타입 간 연산은 같은 타입의 결과
        // 서로 다른 타입 간 연산은 큰 범위로 자동 형변환
    }
}
