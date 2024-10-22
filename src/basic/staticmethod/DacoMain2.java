package basic.staticmethod;

public class DacoMain2 {
    public static void main(String[] args) {
        String s = "hello";
        String deco = DecoUtil2.deco(s); // static 메서드, 정적 메서드, 클래스 메서드

        System.out.println("before " + s);
        System.out.println("after " + deco);
    }
}
