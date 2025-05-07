import java.util.List;
import java.util.function.Predicate;

public class ProductSearch {
    public static List<Product> filter(List<Product> products, Predicate<Product> productPredicate) {
        return products.stream().filter(productPredicate).toList();
    }
}
