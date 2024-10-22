package basic.staticvariable;

public class Data3 {
    public String name;
    public static int count; // static 변수, 정적 변수, 클래스 변수

    public Data3(String name) {
        this.name = name;
        count++; // 내 클래스 내부이기 때문에 클래스명 생략 가능
        // Data3.count
    }
}
