package start.method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }

    public static void checkAge(int age) {
        if(age < 18) {
            System.out.println("미성년자는 입장할 수 없습니다.");
            return;
        }
        System.out.println(age + "살 입장하세요.");
    }
}
