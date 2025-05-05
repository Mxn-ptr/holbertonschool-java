import java.util.*;

public class Blog {
    private List<Post> posts = new ArrayList<>();

    public List<Post> getPost() {
        return posts;
    }

    public void addPost(Post post) {
        for (Post ePost : this.posts) {
            if (ePost.compareTo(post) == 0) {
                throw new IllegalArgumentException("Post already exits");
            }
        }
        this.posts.add(post);
    }

    public Set<Author> getAllAuthors() {
        TreeSet<Author> authors = new TreeSet<>();
        for (Post post : this.posts) {
            authors.add(post.getAuthor());
        }
        return authors;
    }

    public Map<Categories, Integer> getCountByCategory() {
        TreeMap<Categories, Integer> countByCategory = new TreeMap<>();
        for (Post post : this.posts) {
            countByCategory.merge(post.getCategory(), 1, Integer::sum);
        }
        return countByCategory;
    }

    public Set<Post> getPostsByAuthor(Author author) {
        TreeSet<Post> postsByAuthor = new TreeSet<>();
        for (Post post : this.posts) {
            if (post.getAuthor().compareTo(author) == 0) {
                postsByAuthor.add(post);
            }
        }
        return postsByAuthor;
    }

    public Set<Post> getPostsByCategory(Categories category) {
        TreeSet<Post> postsByCategory = new TreeSet<>();
        for (Post post : this.posts) {
            if (post.getCategory() == category) {
                postsByCategory.add(post);
            }
        }
        return postsByCategory;
    }

    public Map<Categories, Set<Post>> getAllPostsByCategories() {
        Map<Categories, Set<Post>> postsByCategories = new EnumMap<>(Categories.class);

        for (Categories category : Categories.values()) {
            postsByCategories.put(category, new TreeSet<>());
        }
        for (Post post : this.posts) {
            Categories category = post.getCategory();
            postsByCategories.get(category).add(post);
        }

        return postsByCategories;
    }

    public Map<Author, Set<Post>> getAllPostsByAuthor() {
        Map<Author, Set<Post>> postsByAuthor = new TreeMap<>();

        for (Post post : this.posts) {
            postsByAuthor.computeIfAbsent(post.getAuthor(), k -> new TreeSet<>()).add(post);
        }

        return postsByAuthor;
    }
}
