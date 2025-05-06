public class Media {
    protected String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  String.format("Type: %s - Name: %s", this.getClass().getName(), getName());
    }
}
