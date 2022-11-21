package ProductsList;

import Products.Product;
import Products.Showable;

import java.util.ArrayList;
import java.util.List;

// S - Single Responsibility Principle - история заказов хранит заказы, поэтому добавить заказ можно,
//                                       а удалить из истории - нельзя
// I - Interface Segregation Principle - интерфейсы для суммирования и отображения разделены
public class OrdersHistory implements Showable, Summable {

    public static List<Order> history = new ArrayList<>();

    @Override
    public void show() {
        for (Order order : history) {
            System.out.println("\nЗаказ " + order.getId() + ":");
            for (int i = 0; i < order.list.size(); i++) {
                System.out.println((i + 1) + ") " + order.getList().get(i) + " " + order.getList().get(i).getPrice());
            }
            System.out.println("Общая сумма заказа: " + order.getTotalPrice());
        }
    }

    @Override
    public void sum() {
        int tmp = 0;
        for (Order order : history) {
            tmp += order.getTotalPrice();
        }
        System.out.println("Общий объём продаж: " + tmp);
    }

    public void addOrders (Order order) {
        history.add(order);
        System.out.println("Заказ " + order.getId() + " сохранен успешно!");
    }
}
