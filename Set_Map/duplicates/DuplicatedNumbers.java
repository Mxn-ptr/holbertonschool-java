import java.util.HashSet;
import java.util.TreeSet;

public class DuplicatedNumbers {
    public static TreeSet<Integer> isFind(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        TreeSet<Integer> duplicates = new TreeSet<>();
        for (int num: array) {
            if (!seen.contains(num)) {
                seen.add(num);
            } else {
                duplicates.add(num);
            }
        }
        return duplicates;
    }
}
