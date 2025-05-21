import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PeopleQuery {
    public static TreeMap<String, TreeSet<Person>> getPeopleGroupedByPositionInReverseOrder(List<Person> persons) {
        return persons.stream().collect(Collectors.groupingBy(
                Person::getPosition,
                () -> new TreeMap<>(Comparator.reverseOrder()),
                Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Person::getCode))))
        );
    }
}
