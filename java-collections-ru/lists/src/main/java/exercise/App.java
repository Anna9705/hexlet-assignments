package exercise;

import java.util.Arrays;
import java.util.ArrayList;

// BEGIN
public class App {
    public static boolean scrabble(String setOfChars, String word) {
        if (setOfChars.length() < word.length()) {
            return false;
        }
        String[] chars = setOfChars.split("");
        ArrayList charList = new ArrayList(Arrays.asList(chars));
        for (var i = 0; i < word.length(); i++) {
            String current = word.substring(i, i + 1).toLowerCase();
            if (!charList.contains(current)) {
                return false;
            }
            charList.remove(current);
        }
        return true;
    }
}
//END
