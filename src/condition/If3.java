package condition;

public class If3 {
    public static void main(String[] args) {
        // 문제, 할인을 중복으로 받을 수 있을 경우
        int price = 10000;
        int age = 10;
        int discount = 0;

        if(price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매 시 1000원 할인");
        }

        if(age <= 10) {
            discount += 1000;
            System.out.println("10살 이하 1000원 할인");
        }

        System.out.println("총 할인 금액: " + discount + "원");
    }
}
