public class Post implements Comparable<Post> {
    private Author author;
    private String title;
    private String body;
    private Categories category;

    public Post(Author author, String title, String body, Categories category) {
        this.author = author;
        this.title = title;
        this.body = body;
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Post o) {
        return this.title.compareTo(o.title);
    }
}
