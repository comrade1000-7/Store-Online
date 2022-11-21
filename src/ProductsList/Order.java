package ProductsList;

import Products.Product;

import java.util.List;

// O - Open-Closed Principle - класс закрыт от модификации, но открыт для расширения и имплементации
public class Order extends ProductsList {
    private int id;
    private int totalPrice;

    public static int counter = 1;


    public Order(List<Product> list, int id, int totalPrice) {
        super(list);
        this.id = id;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void reOrder (int id) {

    }
}
