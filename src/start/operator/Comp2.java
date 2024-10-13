package start.operator;

public class Comp2 {
    public static void main(String[] args) {
        // 문자열이 같은지 비교할 때는 equals() 사용
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello");
        boolean result2 = str1.equals(str2);

        System.out.println(result1);
        System.out.println(result2);
    }
}
