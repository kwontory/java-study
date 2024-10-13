package start.loop.ex;

public class EvenEx {
    public static void main(String[] args) {
        int num = 1;
        while(num <= 10) {
            System.out.println(num*2);
            num++;
        }
        System.out.println("--------------------------");
        for(num = 1;num <= 10; num ++) {
            System.out.println(num*2);
        }
        System.out.println("--------------------------");
    }
}
