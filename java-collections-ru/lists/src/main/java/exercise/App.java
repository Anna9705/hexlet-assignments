package exercise;

import java.util.Arrays;
import java.util.ArrayList;

// BEGIN
public class App {
    public static boolean scrabble(String setOfChars, String word) {
        if (setOfChars.length() < word.length()) {
            return false;
        }
        int check = 0;
        word = word.toLowerCase();
        char[] charArray = setOfChars.toCharArray();
        for (var i = 0; i < word.length(); i++) {
            for (var n = 0; n < setOfChars.length(); n++) {
                if (charArray[n] == word.charAt(i)) {
                    charArray[n] = '-';
                    check++;
                    break;
                }
            }
        }
        return check == word.length();
    }
}
//END
