package condition;

public class If4 {
    public static void main(String[] args) {
        // 문제, 할인을 한번만 받을 수 있는 경우
        int price = 10000;
        int age = 10;
        int discount = 0;

        if(price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매 시 1000원 할인");
        } else if(age <= 10) {
            discount += 1000;
            System.out.println("10살 이하 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액: " + discount + "원");

        if(true)
            System.out.println("코드가 한 줄일 때 코드 블럭 생략 가능");
            System.out.println("if와 무관하게 실행됩니다."); // 가독성, 유지보수 측면에서 생략하지 않는 것이 좋다.
    }
}
