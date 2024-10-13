package basic.class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[3];

        // 상품 주문 정보를 ProductOrder 타입의 변수로 받아 저장
        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "상품1";
        productOrder1.price = 1;
        productOrder1.quantity = 1;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "상품2";
        productOrder2.price = 2;
        productOrder2.quantity = 2;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "상품3";
        productOrder3.price = 3;
        productOrder3.quantity = 3;

        productOrders[0] = productOrder1;
        productOrders[1] = productOrder2;
        productOrders[2] = productOrder3;

        // 상품 주문 정보와 최종 금액 출력
        int totalAmount = 0;
        for(ProductOrder order : productOrders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
            totalAmount += order.price * order.quantity;
        }

        System.out.println("총 결제 금액: " + totalAmount);

    }
}
