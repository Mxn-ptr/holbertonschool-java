import java.util.function.Consumer;
import java.util.function.Supplier;

public class Product {
    private final String name;
    private double price;
    private Double markupPercentage = 10.0;
    Supplier<Double> priceWithMarkup = () -> this.price * (1 + this.markupPercentage / 100);
    Consumer<Double> updateMarkup = newPercentage -> this.markupPercentage = newPercentage;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
