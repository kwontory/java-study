package start.loop;

public class Break1 {
    public static void main(String[] args) {
        // break : 즉시 반복문을 종료
        // continue : 즉시 조건식으로 이동
        int sum = 0;
        int i = 0;

        while (true) { // 무한 반복
            if(sum > 10) {
                System.out.println("i = " + i + " sum = " + sum);
                break;
            }
            sum += ++i;
        }
    }
}
