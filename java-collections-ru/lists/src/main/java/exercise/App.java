package exercise;

import java.util.Arrays;
import java.util.ArrayList;

// BEGIN
public class App {
    public static boolean scrabble(String setOfChars, String word) {
        if (setOfChars.length() < word.length()) {
            return false;
        }
        word = word.toLowerCase();
        List<Char> chars = Arrays.asList(setOfChars.split());
        for (var i = 0; i < word.length(); i++) {
            if (chars.contains(word.charAt(i))) {
                chars.remove(word.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
