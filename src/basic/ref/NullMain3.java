package basic.ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // 2. data에 실제 인스턴스 할당
        System.out.println(bigData.value); // 0
        System.out.println(bigData.data); // null

        System.out.println(bigData.data.value); // 1. NullPointerException 예외 발생
    }
}
