package start.operator;

public class Operator2 {
    public static void main(String[] args) {
        // 문자열 더하기
        String str = " Hello" + "Java";
        System.out.println(str);
        String str2 = "str2";
        String str3 = "str3";
        System.out.println(str2 + str3);

        // 문자열과 숫자 더하기
        // 숫자를 문자열로 변경한 후 문자열끼리 더한다.
        // 문자열에 더하는 경우 모두 문자열이 된다.
        int a = 10;
        String result = a + str;
        System.out.println(result);
    }
}
