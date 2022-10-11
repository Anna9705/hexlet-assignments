package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String content) {
        String[] filteredLines = Arrays.stream(content.split("\n"))
                .filter(line -> line.startsWith("environment"))
                .map(line -> line.replaceAll("environment=", ""))
                .map(line -> line.replaceAll("\"", ""))
                .toArray(String[]::new);
        StringBuilder result = new StringBuilder();
        for (String line : filteredLines) {
            String[] variables = line.split(",");
            for(String variable : variables) {
                if (variable.startsWith("X_FORWARDED_")) {
                    result.append(variable.replace("X_FORWARDED_", "")).append(",");
                }
            }
        }
        String result1 = result.toString();
        return result1.substring(0, result1.length() - 1);
    }
}
//END
