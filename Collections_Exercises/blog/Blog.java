import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Blog {
    private final ArrayList<Post> posts = new ArrayList<>();

    public ArrayList<Post> getPost() {
        return posts;
    }

    public void addPost(Post post) {
        this.posts.add(post);
    }

    public TreeSet<String> getAllAuthors() {
        TreeSet<String> authors = new TreeSet<>();
        for (Post post : this.posts) {
            authors.add(post.getAuthor());
        }
        return authors;
    }

    public TreeMap<String, Integer> getCountByCategory() {
        TreeMap<String, Integer> countByCategory = new TreeMap<>();
        for (Post post : this.posts) {
            countByCategory.merge(post.getCategory(), 1, Integer::sum);
        }
        return countByCategory;
    }
}
