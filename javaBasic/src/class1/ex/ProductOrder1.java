package class1.ex;

public class ProductOrder1 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "떡볶이";
        order1.price = 15;
        order1.quantity = 1;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "참치김밥";
        order2.price = 18;
        order2.quantity = 1;
        orders[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "군만두";
        order3.price = 9;
        order3.quantity = 1;
        orders[2] = order3;

        int totalAmount = 0;
        for (ProductOrder order : orders) {
            System.out.println( "Product Name: " + order.productName + " Price: " + order.price + " Quantity: " + order.quantity);
            totalAmount += order.price * order.quantity;
        }
        System.out.println("Total: " + totalAmount);
    }
}
