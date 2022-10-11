package exercise;

import java.util.Arrays;

// BEGIN
class App {
    public static String[][] enlargeArrayImage(String[][] image) {
        if (image.length == 0) {
            return new String[0][0];
        }
        String[][] result = new String[image.length * 2][image[0].length * 2];
        for (var n = 0; n < image.length; n++) {
            for (var m = 0; m < image[0].length; m++) {
                result[n * 2][m * 2] = image[n][m];
                result[n * 2 + 1][m * 2] = image[n][m];
                result[n * 2][m * 2 + 1] = image[n][m];
                result[n * 2 + 1][m * 2 + 1] = image[n][m];
            }
        }
        return result;
    }
}
// END
