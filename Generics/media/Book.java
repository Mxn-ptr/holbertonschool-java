public class Book extends Media {
    private int edition;

    public Book(String name, int edition) {
        this.name = name;
        this.edition = edition;
    }

    public int getEdition() {
        return edition;
    }
}
