package basic.staticmethod;

//import static basic.staticmethod.DecoData.staticCall;
import static basic.staticmethod.DecoData.*; // * 모든 메서드 import

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        System.out.println("4. static 메서드에 인스턴스를 넘기는 경우");
        staticCall(data2);

        // 추가
        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall(); // 인스턴스 메서드인지, 클래스 메서드인지 알기 어렵다.

        // 클래스를 통한 접근
        staticCall(); // 클래스 메서드임을 명확하게 알 수 있다.
    }
}
