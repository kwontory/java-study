package start.loop;

public class While2_1 {
    public static void main(String[] args) {
        int sum = 0;
        int add = 1;
        while (add < 4) {
            sum += add++;
        }
        System.out.println("합계: " + sum);
    }
}
