package mypack;

public class ShoppingCartItem {
    private Object item;
    private int quantity;

    public ShoppingCartItem(Object anItem) {
        item = anItem;
        quantity = 1;
    }

    public void incrementQuantity() {
        quantity++;
    }

    public void decrementQuantity() {
        quantity--;
    }

    public Object getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }
}