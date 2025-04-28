import java.util.TreeMap;

public class PhraseAnalyzer {
    public static TreeMap<String, Integer> wordCount(String stringToCount) {
        String[] results = stringToCount.toLowerCase().split("\\s|!|\\.|\\?|,");
        TreeMap<String, Integer> count = new TreeMap<String, Integer>();
        int newCount = 0;
        for (String e: results) {
            if (count.containsKey(e)) {
                newCount = count.get(e) + 1;
            } else {
                newCount = 1;
            }
            if (!e.isBlank())
                count.put(e, newCount);
        }
        return count;
    }
}
