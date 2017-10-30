package mypack;

import java.util.*;

public class ShoppingCart {
    HashMap items = null;
    int numberOfItems = 0;

    public ShoppingCart() {
        items = new HashMap();
    }

    public synchronized void add(String bookId, BookDetails book) {
        if(items.containsKey(bookId)) {
            ShoppingCartItem scitem = (ShoppingCartItem) items.get(bookId);
            scitem.incrementQuantity();
        } else {
            ShoppingCartItem newItem = new ShoppingCartItem(book);
            items.put(bookId, newItem);
        }

        numberOfItems++;
    }

    public synchronized void remove(String bookId) {
        if(items.containsKey(bookId)) {
            ShoppingCartItem scitem = (ShoppingCartItem) items.get(bookId);
            scitem.decrementQuantity();

            if(scitem.getQuantity() <= 0) {
                items.remove(bookId);
            }
        }

        numberOfItems--;
    }

    public synchronized Collection getItems() {
        return items.values();
    }

    protected void finalize() throws Throwable {
        items.clear();
    }

    public synchronized int getNumberOfItems(){
        return numberOfItems;
    }

    public synchronized double getTotal() {
        double amount = 0.0;

        for(Iterator i = getItems().iterator(); i.hasNext();) {
            ShoppingCartItem item = (ShoppingCartItem) i.next();
            BookDetails bookDetails = (BookDetails) item.getItem();

            amount += item.getQuantity() * bookDetails.getPrice();
        }

        return roundoff(amount);
    }

    private double roundoff(double x) {
        long val = Math.round(x*100);
        return val/100.0;
    }

    public synchronized void clear() {
        items.clear();
        numberOfItems = 0;
    }
}