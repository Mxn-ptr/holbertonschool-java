import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Query {
    public static List<Product> getBooksFromOrder(Order order) {
        return order.getProducts().stream()
                .filter(product -> product.getCategory() == ProductCategory.BOOK)
                .collect(Collectors.toList());
    }

    public static Product getProductWithHighestPrice(List<Product> products) {
        List<Product> sortedProducts = new ArrayList<>(products);
        sortedProducts.sort(Comparator.comparing(Product::getPrice));
        return sortedProducts.reversed().getFirst();
    }

}
