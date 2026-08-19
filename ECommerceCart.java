class ShoppingCart {

    // Calculate total for a single item
    double calculateTotal(double price) {
        return price;
    }

    // Calculate total for multiple items of the same type
    double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    // Calculate total after applying a discount
    double calculateTotal(double price, int quantity, double discount) {
        double total = price * quantity;
        return total - (total * discount / 100);
    }
}

public class ECommerceCart {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        // Single item
        double total1 = cart.calculateTotal(500);
        System.out.println("Single item total: Rs. " + total1);

        // Multiple items of the same type
        double total2 = cart.calculateTotal(500, 3);
        System.out.println("Multiple items total: Rs. " + total2);

        // Multiple items with 10% discount
        double total3 = cart.calculateTotal(500, 3, 10);
        System.out.println("Total after 10% discount: Rs. " + total3);
    }
}
