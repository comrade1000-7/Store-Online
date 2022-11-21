import Products.Product;
import Products.Showable;
import ProductsList.Addable;

import java.util.HashMap;
import java.util.Map;

public class Stock implements Showable, Addable {
    private Map<Product, Integer> stock = new HashMap<>();

    @Override
    public void addProduct (Product product, int num) {
        if (!stock.containsKey(product)) {
            stock.put(product, num);
        } else {
            stock.put(product, stock.get(product) + num);
        }
        System.out.println("На склад добавлено: " + product.getName() + " " + num + " шт");
    }

    @Override
    public void show() {
        int count = 1;
        System.out.println("Сегодня в продаже: ");
        for (var entry : stock.entrySet()) {
            System.out.println(count + ") " + entry.getKey() + ": " + entry.getValue() + " шт");
            count++;
        }
    }


}
