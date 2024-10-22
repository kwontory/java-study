package basic.staticvariable;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter(); // Counter 인스턴스를 공동으로 사용

        Data2 data1 = new Data2("A", counter); // 1
        System.out.println(counter.count);
        Data2 data2 = new Data2("B", counter); // 2
        System.out.println(counter.count);
        Data2 data3 = new Data2("C", counter); // 3
        System.out.println(counter.count);
    }
}
