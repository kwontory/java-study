package method;

public class Overloading1 {
    public static void main(String[] args) {
        add(1,2);
        add(1,2,3);
    }
    public static int add(int a, int b) {
        System.out.println("1번 출력");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 출력");
        return a + b + c;
    }
}
