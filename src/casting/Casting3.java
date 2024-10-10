package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxInt = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1(초과)
        int i = 0;

        i = (int) maxInt; // 캐스팅
        System.out.println(i);

        i = (int) maxIntOver; // 캐스팅
        System.out.println(i); // 오버플로우
    }
}
