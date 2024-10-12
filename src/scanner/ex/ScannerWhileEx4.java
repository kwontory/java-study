package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalCost = 0;
        while(true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();
            if(option == 1) { // 상품 입력
                input.nextLine(); // 이전 개행 문자 제거

                System.out.print("상품명을 입력하세요.: ");
                String product = input.nextLine();

                System.out.print("상품 가격을 입력하세요.: ");
                int price = input.nextInt();

                System.out.print("구매 수량을 입력하세요.: ");
                int quantity = input.nextInt();

                System.out.println("상품명: " + product + " 가격: " + price + " 수량: " + quantity + " 합계: " + (price * quantity));

                totalCost += (price * quantity);
            } else if(option == 2) { // 결제
                System.out.println("총 결제 금액: " + totalCost);
                totalCost = 0; // 초기화
            } else if (option == 3) { // 프로그램 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
