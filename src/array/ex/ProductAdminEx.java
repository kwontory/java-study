package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        // 1. 상품 등록 : 상품 이름과 가격을 입력 받아 저장
        // 2. 상품 목록 : 지금까지 등록한 모든 상품 목록을 출력한다.
        // 3. 종료 : 프로그램을 종료한다.
        // 상품은 최대 10 개까지 등록할 수 있다.

        Scanner scanner = new Scanner(System.in);
        final int MAX_PRODUCTS = 10;
        String[] productName = new String[10];
        int[] productPrice = new int[10];
        int productCount = 0;

        System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요.: ");
        while(true) {
//            System.out.print("메뉴를 선택하세요.: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); // 개행 제거
            if(menu == 1) { // 상품 등록
                if(productCount >= MAX_PRODUCTS) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                } else {
                    System.out.print("상품명을 입력하세요.: ");
                    productName[productCount] = scanner.nextLine();
                    System.out.print("상품 가격을 입력하세요.: ");
                    productPrice[productCount] = scanner.nextInt();
//                    scanner.nextLine(); // 개행 제거
                    productCount++; // 상품 개수 증가
                }

            } else if(menu == 2) {
                if(productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
//                showProductList(productName, productPrice);
                for(int i = 0;i < productCount;i++) {
                    System.out.println(productName[i] + ": " + productPrice[i] + "원");
                }
            } else if(menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }
    }
    // productCount..
    /*public static void showProductList(String[] productName, int[] productPrice) {
        *//*if(productName[0] == null) {
            System.out.println("등록된 상품이 없습니다.");
            return;
        }*//*

        for (int i = 0; i < productName.length; i++) {
            if(productName[i] == null) break;
            System.out.println(productName[i] + ": " + productPrice[i] + "원");
        }
    }*/
}
