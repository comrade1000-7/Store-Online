package ProductsList;

import Products.Product;
import Products.Showable;

// S - Single Responsibility Principle - корзина нужна для подбора товаров и учета скидки
// I - Interface Segregation Principle - интерфейсы для суммирования и отображения разделены
public class Cart extends ProductsList implements Deletable, Showable{
    private boolean isRegistered;
    private int discount = 500;

    public Cart(boolean isRegistered) {
        super();
        this.isRegistered = isRegistered;
    }

    public Order buy() {
        System.out.println("Покупка совершена успешно!");
        return isRegistered ? new Order(list, Order.counter++, fullPrice - discount) :
                new Order(list, Order.counter++, fullPrice);
    }

    @Override
    public void sum() {
        for (Product product : list) {
            fullPrice += product.getPrice();
        }
        System.out.println(isRegistered ? "Цена с учетом скидки " + discount + " = " + (fullPrice - discount)
                                        : "Итоговая цена " + fullPrice);
    }

    @Override
    public void delete(int index) {
        list.remove(index - 1);
    }

    @Override
    public void show() {
        System.out.println("В вашем заказе: ");
        for (Product product : list) {
            System.out.println("- " + product.getName() + " " + product.getPrice());
        }
    }
}
