package Products;

// O - Open-Closed Principle - класс закрыт от модификации, но открыт для расширения и имплементации
// L - класс Charger может наследоваться от Product, но не может от Smartphone
public class Charger extends Product implements Showable {
    private int power;

    public Charger(String name, int price, int power) {
        super(name, price);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public void show() {
        System.out.println("Зарядное устройство" + getName() + " " + getPower() + " " + getPrice());
    }
}
