import java.util.*;
import java.util.stream.Collectors;

public class PeopleQuery {
    public static TreeMap<String, TreeSet<Person>> getPeopleGroupedByPositionInReverseOrder(List<Person> persons) {
        return persons.stream().collect(Collectors.groupingBy(
                Person::getPosition,
                () -> new TreeMap<>(Comparator.reverseOrder()),
                Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Person::getCode)))
        ));
    }

    public static Map<String, Long> getPeopleCountByPosition(List<Person> persons) {
        return persons.stream().collect(Collectors.groupingBy(Person::getPosition, Collectors.counting()));
    }

    public static Map<String, Map<Integer, Long>> getPeopleCountByPositionAndAge(List<Person> persons) {
        return persons.stream().collect(Collectors.groupingBy(Person::getPosition, Collectors.groupingBy(Person::getAge, Collectors.counting())));
    }

    public static Map<String, Double> getAverageSalaryByPosition(List<Person> persons) {
        return persons.stream().collect(Collectors.groupingBy(Person::getPosition, Collectors.averagingDouble(Person::getSalary)));
    }

    public static Map<String, TreeSet<String>> getHobbiesByPosition(List<Person> persons) {
        return persons.stream().collect(Collectors.groupingBy(
           Person::getPosition,
           Collectors.flatMapping(
                   person -> person.getHobbies().stream(),
                   Collectors.toCollection(TreeSet::new)
           )
        ));
    }
}
