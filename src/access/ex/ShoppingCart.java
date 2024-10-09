package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;
    //TODO 나머지 코드를 완성해라

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getToTalPrice());
        }
        System.out.println(calcualateTotalPrice());
    }

    private int calcualateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getToTalPrice();
        }
        return totalPrice;
    }
}

// 참조자 자꾸 헷갈려버림 왜지?.. => 해결 필요.
