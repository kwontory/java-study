package start.loop.ex;

public class CountEx {
    public static void main(String[] args) {
        int count = 10;
        // 1. while
        System.out.println("while start");
        int num = 1;
        while (num <= count) {
            System.out.println(num);
            num++;
        }
        System.out.println();

        // 2. for
        System.out.println("for start");
        for(int i = 1;i <= count;i++) {
            System.out.println(i);
        }
    }
}
