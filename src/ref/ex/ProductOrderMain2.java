package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 갯수를 입력하세요: ");
        int N = sc.nextInt();
        ProductOrder[] orders = new ProductOrder[N];

        for (int i = 0; i < N; i++) {
            System.out.println( i+1 + "번째 주문 정보를 입력 하세요.");
//            orders[i].productName = sc.next();
//            System.out.println("상품명: ");
//            orders[i].price = sc.nextInt();
//            System.out.println("가격: ");
//            orders[i].quantity = sc.nextInt();
//            System.out.println("수량: ");
            System.out.print("상품명: ");
            String productName = sc.next();
            System.out.print("가격: ");
            int price = sc.nextInt();
            System.out.print("수량: ");
            int quantity = sc.nextInt();

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders){
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
        System.out.println("총 결제 금액: " + getTotalAmount(orders));
    }


    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.quantity * order.price;
        }
        return totalAmount;
    }
}
