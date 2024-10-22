package basic.staticvariable;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println(Data3.count); // 1
        Data3 data2 = new Data3("B");
        System.out.println(Data3.count); // 2
        Data3 data3 = new Data3("C");
        System.out.println(Data3.count); // 3

        // Class명.변수명 -> 클래스에 직접 접근하는 느낌
        // static이 붙은 변수는 메서드 영역에서 관리한다.
        // 붕어빵 틀은 1개이다.
        // 틀로 찍어낸 붕어빵은 여러개 존재할 수 있다.

        // 추가 - 인스턴스를 통해서 클래스 변수 접근
        Data3 data4 = new Data3("D");
        // 힙 영역에 갔더니 없네? > static 영역 확인
        // 인스턴스 변수인지 클래스 변수인지 알기 어렵다.
        System.out.println(data4.count);

        // 클래스를 통해서 클래스 변수 접근
        // 클래스 변수인 것이 명확하다.
        System.out.println(Data3.count);
    }
}
