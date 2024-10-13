package start.variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32768 ~ 32767
        int i = 214733777; // 약 20억
        long l = 92394273647863L; // 대문자 L을 권장

        // 실수
        float f = 10.0f;
        double d = 10.0; // d 생략 가능, 정밀도가 더 높다

        // 큰수를 저장 -> 더 많은 메모리 공간 필요
        // + 파일은 byte 단위로 다룸

        // 자주 사용하는 타입
        // 정수: int, long,  byte - 파일
        // 실수: double
        // 불리언: boolean - 조건문
        // 문자열: String - 문자든 문자열이든 String 사용하는 것이 좋다

        // 변수 명명 규칙(필수), 관례(권장) 지켜서 개발
        // Camel Case
        // 클래스는 첫글자 대문자, 나머지는 소문자로 명명하고 Camel Case 적용
        // 상수는 모두 대문자로 작성하고 Snake Case 적용
        // 패키지는 모두 소문자로 작성한다.
    }
}
