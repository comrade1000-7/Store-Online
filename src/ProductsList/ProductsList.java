package ProductsList;

import Products.Product;
import Products.Showable;

import java.util.ArrayList;
import java.util.List;

public class ProductsList implements Summable {
    protected List<Product> list;
    protected int fullPrice;

    public ProductsList(List<Product> list) {
        this.list = list;
    }

    public ProductsList() {}

    public List<Product> getList() {
        return list;
    }

    public void addProduct(Product product) {
        if (list != null) {
            list.add(product);
        } else {
            list = new ArrayList<>();
            list.add(product);
        }
    }

    @Override
    public void sum() {
        for (Product product : list) {
            fullPrice += product.getPrice();
        }
        System.out.println(fullPrice);
    }
}
