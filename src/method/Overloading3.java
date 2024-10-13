package method;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println(add(1.2,1.3));
        System.out.println(add(1,2)); // 1번 method 주석 처리 후 호출 가능, 자동 형변환
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }
    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
