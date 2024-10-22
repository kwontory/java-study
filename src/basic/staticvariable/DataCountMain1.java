package basic.staticvariable;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println(data1.count); // 1
        Data1 data2 = new Data1("B");
        System.out.println(data1.count); // 1
        Data1 data3 = new Data1("C");
        System.out.println(data1.count); // 1

        // 인스턴스에 사용되는 count 값은 인스턴스끼리 공유하지 않는다.
    }
}
