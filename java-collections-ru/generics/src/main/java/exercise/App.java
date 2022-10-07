package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> book : books) {
            boolean check = true;
            for (String key : where.keySet()) {
                if (!where.get(key).equals(book.get(key))) {
                    check = false;
                }
            }
            if (check) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
