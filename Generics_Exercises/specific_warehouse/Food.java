public class Food {
    private String name;
    private int calories;
    private double price;

    public Food(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("[%s] %f $ %f", this.name, (double) this.calories, this.price);
    }
}
