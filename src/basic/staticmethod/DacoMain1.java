package basic.staticmethod;

public class DacoMain1 {
    public static void main(String[] args) {
        String s = "hello";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s); // 인스턴스 메서드, deco() 메서드 뿐인데 인스턴스를 생성해서 사용해야 한다.

        System.out.println("before " + s);
        System.out.println("after " + deco);
    }
}
