import java.util.List;

public class ProductSearch {
    public static List<Product> filter(List<Product> products, FilterCriteria filterCriteria) {
        return products.stream().filter(filterCriteria::test).toList();
    }
}
