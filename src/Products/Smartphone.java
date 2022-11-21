package Products;

// O - Open-Closed Principle - класс закрыт от модификации, но открыт для расширения и имплементации
// L - класс Charger может наследоваться от Product, но не может от Charger
public class Smartphone extends Product implements Showable {
    private String brand;

    public Smartphone(String name, int price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void show() {
        System.out.println("Смартфон " + getName() + " " + getBrand() + " " + getPrice());

    }
}
