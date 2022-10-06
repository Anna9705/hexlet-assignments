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
        ArrayList<Char> listOfChars = new ArrayList<>();
        for (var n = 0; n < setOfChars.length(); n++) {
            listOfChars.add(setOfChars.charAt(n));
        }
        for (var i = 0; i < word.length(); i++) {
            if (listOfChars.contains(word.charAt(i))) {
                listOfChars.remove(word.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
