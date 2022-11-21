import Products.Charger;
import Products.Product;
import Products.Smartphone;
import ProductsList.Cart;
import ProductsList.Order;
import ProductsList.OrdersHistory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        OrdersHistory history = new OrdersHistory();
        Cart cart = new Cart(true);
        Scanner scanner = new Scanner(System.in);
        Product iPhone = new Smartphone("iPhone 14 Pro Max", 149990, "Apple");
        Product charger = new Charger("Беспроводная зарядка", 3990, 3);

        stock.addProduct(iPhone, 10);
        stock.addProduct(charger, 30);

        System.out.println("Привет! Посмотри на наши товары: ");

        stock.show();



        while (true) {
            System.out.println("Введите номер товара, чтобы добавить его в корзину? Или нажмите \"0\" для покупки");
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            switch (input) {
                case 1: cart.addProduct(iPhone);
                break;
                case 2: cart.addProduct(charger);
                break;
            }
        }


        cart.show();
        cart.sum();

        Order newOrder = cart.buy();

        history.addOrders(newOrder);
        history.show();
    }
}
