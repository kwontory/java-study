package casting;

public class Casting2 {
    public static void main(String[] args) {
        double d = 1.5;
        int i = 0;


        //i = d;
        // 컴파일 오류 발생
        // java: incompatible types: possible lossy conversion from double to int
        i = (int) d; // 명시적 형변환
        System.out.println(i); // 1, 소수점 버림

        System.out.println((int)10.5);
    }
}
