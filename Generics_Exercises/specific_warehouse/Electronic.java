public class Electronic {
    private String description;
    private double value;

    public Electronic(String description, double value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }


    @Override
    public String toString() {
        return String.format("[%s] $ %f", this.description, this.value);
    }
}
