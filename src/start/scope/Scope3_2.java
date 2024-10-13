package start.scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;
//        int temp = 0;
        if(m > 0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        } // temp 변수를 if 문 내에서만 고려하면 된다.
        System.out.println("m = " + m);
    }
}
