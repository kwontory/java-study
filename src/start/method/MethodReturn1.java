package start.method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if(i % 2 == 1) {
            return true; // return을 만나면 method를 바로 빠져나간다.
        } else {
            return false;
        }
    }
}
