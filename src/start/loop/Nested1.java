package start.loop;

public class Nested1 {
    public static void main(String[] args) {
        // 중첩 반복문
        for(int i = 0; i < 2;i++) {
            System.out.println("outside start " + i);
            for(int j = 0; j < 3;j++) {
                System.out.println("    inside " + j);
            }
            System.out.println("outside end " + i);
            System.out.println();
        }
    }
}
