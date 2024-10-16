package basic.access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public 호출 가능, 외부 접근 모두 허용
        data.publicField = 1;
        data.publicMethod();

        // default 호출 가능, 같은 패키지 내에서만 접근 허용
        data.defaultField = 2;
        data.defaultMethod();

        // private 호출 불가, 같은 클래스 내에서만 접근 허용
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();
    }
}
