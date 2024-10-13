package start.method;

public class MethodValue3 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(number); // 5
        number = changeNumber(number);
        System.out.println(number); // 10
    }

    public static int changeNumber(int number) {
        return number * 2;
    }
}
