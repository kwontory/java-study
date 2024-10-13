package method;

public class MethodValue0 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1;
        num2 = 10;

        // **중요** 자바는 항상 변수의 값을 복사한 후 대입을 한다.
        System.out.println(num1); // 5
        System.out.println(num2); // 10
    }

}
