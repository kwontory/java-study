package start.method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        final String MESSAGE = "Hello, world!";
        printMessage(MESSAGE,3);
        printMessage(MESSAGE,5);
        printMessage(MESSAGE,7);
    }

    /**
     * message를 times번 출력
     * @param message 출력 내용
     * @param times 출력 횟수
     */
    public static void printMessage(String message, int times) {
        for(int i = 0;i < times;i++) {
            System.out.println(message);
        }
    }

}
