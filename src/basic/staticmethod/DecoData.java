package basic.staticmethod;

public class DecoData {
    public int instanceValue;
    public static int staticValue;

    public static void staticCall() {
        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근

//        instanceValue++; // 인스턴스 변수 접근, compile error
//        instanceMethod(); // 인스턴스 메서드 접근, compile error
    }
    public void instanceCall() {
        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근

        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근
    }

    public static void staticCall(DecoData data) { // 외부의 참조값을 받아올 경우 인스턴스에 접근 가능하다.
        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근

        data.instanceValue++; // 인스턴스 변수 접근, compile error
        data.instanceMethod(); // 인스턴스 메서드 접근, compile error
    }

    public void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }
    public static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
