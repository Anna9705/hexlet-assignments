package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        LinkedHashMap<String, String> result = new LinkedHashMap<>();
        for (String map2 : data2.keySet()) {
            if (data1.containsKey(map2)) {
                if (data2.get(map2).equals(data1.get(map2))) {
                    result.put(map2, "unchanged");
                } else {
                    result.put(map2, "changed");
                }
            } else {
                result.put(map2, "added");
            }
        }
        for (String map1 : data1.keySet()) {
            if (!data2.containsKey(map1)) {
                result.put(map1, "deleted");
            }
        }
        return result;
    }
}
//END
