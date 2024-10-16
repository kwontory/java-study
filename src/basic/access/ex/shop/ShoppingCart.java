package basic.access.ex.shop;

public class ShoppingCart {
    private final int MAX_ITEM_COUNT = 10;
    private Item[] items = new Item[MAX_ITEM_COUNT];
    private int count = 0;

    public ShoppingCart() {
        //items = new Item[MAX_ITEM_COUNT];
    }
    public void addItem(Item item) {
        if(count >= MAX_ITEM_COUNT) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[count] = item;
        count++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for(int i = 0;i<count;i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + getCartPrice());
    }

    private int getCartPrice() {
        int cartPrice = 0;
        for(int i = 0;i<count;i++) {
            Item item = items[i];
            cartPrice += item.getTotalPrice();
        }
        return cartPrice;
    }
}
