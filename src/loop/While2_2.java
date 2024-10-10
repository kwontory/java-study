package loop;

public class While2_2 {
    public static void main(String[] args) {
        int endNum = 7; // endNum만 교체하면 된다.
        int i = 0;
        int sum = 0;
        while(i < endNum) {
            sum += ++i;
            System.out.println(i);
        }
        System.out.println("합계 " + sum);
    }
}
