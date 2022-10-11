package exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        List<String> sortedDates = users.stream()
                .filter(user -> user.get("gender").equals("male"))
                .map(date -> date.get("birthday"))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        String[] result = new String[sortedDates.size()];
        int i = 0;
        for (String date : sortedDates) {
            for(Map<String, String> user : users) {
                if (user.get("birthday").equals(date) && user.get("gender").equals("male")) {
                    result[i] = user.get("name");
                    i++;
                }
            }
        }
        return Arrays.stream(result).toList();
    }
}
// END
