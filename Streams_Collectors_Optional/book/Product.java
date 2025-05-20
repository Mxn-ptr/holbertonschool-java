public class Product {
    private int code;
    private String name;
    private ProductCategory category;
    private double price;

    public Product(int code, String name, ProductCategory category, double price) {
        this.code = code;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getCode() {

        return code;
    }

    public String getName() {
        return name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s %s $ %s", code, name, category, price );
    }
}
